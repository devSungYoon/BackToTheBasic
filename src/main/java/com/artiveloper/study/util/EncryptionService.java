package com.artiveloper.study.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by kimsunwoo on 2016-06-24.
 */
public class EncryptionService {

    public String getEncryptionPassword(String passWord) {
        String salt = getEncodedSalt();
        return DigestUtils.sha256Hex(passWord + salt);
    }

    public String getEncodedSalt() {
        Random random = new SecureRandom();
        byte [] salt = new byte[32];
        random.nextBytes(salt);
        String encodedSalt = salt.toString();
        return encodedSalt;
    }

}
