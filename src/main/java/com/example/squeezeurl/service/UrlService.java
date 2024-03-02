package com.example.squeezeurl.service;

import com.example.squeezeurl.repository.UrlRepository;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public String convertToShortUrl(UrlLongRequest request)
}
