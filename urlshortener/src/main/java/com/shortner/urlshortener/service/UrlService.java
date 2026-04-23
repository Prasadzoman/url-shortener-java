package com.shortner.urlshortener.service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class UrlService {

    private Map<String, String> urlStore = new HashMap<>();
    private static final String CHARSET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private Random random = new Random();

    public String shortenUrl(String originalUrl) {
        String code = generateCode();
        urlStore.put(code, originalUrl);
        return code;
    }

    public String getOriginalUrl(String code) {
        return urlStore.get(code);
    }

    private String generateCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            code.append(CHARSET.charAt(random.nextInt(CHARSET.length())));
        }
        return code.toString();
    }
}