package com.attech.encrypt.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.attech.encrypt.auto.EncryptAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * 启用加密Starter
 * 
 * <p>在Spring Boot启动类上加上此注解<p>
 * 
 * <pre class="code">
 * &#064;SpringBootApplication
 * &#064;EnableEncrypt
 * <pre>
 * 
 * @author
 *
 * @about
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({EncryptAutoConfiguration.class})
public @interface EnableEncrypt {

}
