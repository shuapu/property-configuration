package com.app.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonResponseDto {
    private String name;
    private int age;
    private String gender;
    private String designation;
    private int salary;
}
