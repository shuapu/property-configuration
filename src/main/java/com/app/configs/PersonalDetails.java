package com.app.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "person.personal.details")
public record PersonalDetails(String name,int age,String gender) {
}
