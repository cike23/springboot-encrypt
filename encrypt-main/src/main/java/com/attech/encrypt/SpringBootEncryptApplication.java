package com.attech.encrypt;

import com.attech.encrypt.anno.EnableEncrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 加解密测试
 * <p>
 * yinjihuan
 */
@SpringBootApplication
@EnableEncrypt
public class SpringBootEncryptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEncryptApplication.class, args);
    }

}
