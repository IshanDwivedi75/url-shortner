package com.example.squeezeurl.service;

import org.springframework.stereotype.Service;

@Service
public class BaseConversion {
    private static final String domainString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private char[] domainChar = domainString.toCharArray();
    private int base = domainChar.length;

    public String encode(long input){
        var encodeStr = new StringBuilder();
        if(input == 0){
            return String.valueOf(domainChar[0]);
        }
        while(input > 0){
            encodeStr.append(domainChar[(int)input % base]);
            input /= base;
        }
        return encodeStr.reverse().toString();
    }
}
