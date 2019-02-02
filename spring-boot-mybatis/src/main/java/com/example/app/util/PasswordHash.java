package com.example.app.util;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.time.Instant;

@Component
public class PasswordHash {
    public String passwordToHash(String password) throws Exception {
        MessageDigest dijest = MessageDigest.getInstance("SHA-256");
        dijest.update(password.getBytes());
        byte[] src = dijest.digest();
        StringBuilder builder = new StringBuilder();
        for (byte b : src) {
            String s = Integer.toHexString(b & 0xFF);
            if (s.length() < 2) {
                builder.append('0');
            }
            builder.append(s);
        }
        return builder.toString();
    }
}
