package com.shortner.urlshortener.Controller;


import com.shortner.urlshortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/")
    public String home() {
        return "URL Shortener is running!";
    }

    @PostMapping("/shorten")
    public Map<String, String> shorten(@RequestBody Map<String, String> request) {
        String originalUrl = request.get("url");
        String code = urlService.shortenUrl(originalUrl);

        return Map.of(
                "shortUrl", "http://localhost:8080/" + code
        );
    }

    @GetMapping("/{code}")
    public void redirect(@PathVariable String code, HttpServletResponse response) throws IOException {
        String originalUrl = urlService.getOriginalUrl(code);

        if (originalUrl != null) {
            response.sendRedirect(originalUrl);
        } else {
            response.setStatus(404);
        }
    }
}