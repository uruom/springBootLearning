package com.uruom.springbooot02config.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
//javaConfig绑定配置文件的值，可以采取这些方式
@ConfigurationProperties(prefix = "person")
//加载指定的配置文件
//@PropertySource(value = "classpath:uruom.properties")

@Validated//数据校验
public class Person {

//    @Value("${name}")
//    @Email(message = "用户名不合法")
    @Null
    private String lastname;

    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;
}
