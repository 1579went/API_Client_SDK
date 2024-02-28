package icu.pignest.api_client_sdk.utils;

import java.security.SecureRandom;
import java.util.Base64;

/**
 * @author Black
 */
public class KeyGenerator {
    private static final int KEY_LENGTH = 32; // 指定生成的key长度为32字节

    public static String generateAccessKey() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[KEY_LENGTH / 2]; // 生成的字节数要除以2
        random.nextBytes(bytes);
        return Base64.getEncoder().encodeToString(bytes).replace("/", "").replace("+", "").substring(0, 20);
    }

    public static String generateSecretKey() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[KEY_LENGTH];
        random.nextBytes(bytes);
        return Base64.getEncoder().encodeToString(bytes).replace("/", "").replace("+", "").substring(0, 40);
    }
}