package com.attech.encrypt.auto;

import com.attech.encrypt.advice.EncryptRequestBodyAdvice;
import com.attech.encrypt.advice.EncryptResponseBodyAdvice;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 加解密自动配置
 * 
 * @author yinjihuan
 * 
 * @about http://cxytiandi.com/about
 *
 */
@Configuration
@Component
@EnableAutoConfiguration
@EnableConfigurationProperties(EncryptProperties.class)
public class EncryptAutoConfiguration {

	/**
	 * 配置请求解密
	 * @return
	 */
	@Bean
	public EncryptResponseBodyAdvice encryptResponseBodyAdvice() {
		return new EncryptResponseBodyAdvice();
	}
	
	/**
	 * 配置请求加密
	 * @return
	 */
	@Bean
	public EncryptRequestBodyAdvice encryptRequestBodyAdvice() {
		return new EncryptRequestBodyAdvice();
	}
	
}
