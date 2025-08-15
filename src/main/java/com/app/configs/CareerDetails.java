package com.app.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "person.career.details")
public record CareerDetails(String designation,int salary) {
}
