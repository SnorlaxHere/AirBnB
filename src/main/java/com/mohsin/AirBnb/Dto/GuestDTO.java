package com.mohsin.AirBnb.Dto;

import com.mohsin.AirBnb.Entities.UserEntity;
import com.mohsin.AirBnb.Enums.Gender;
import lombok.Data;

@Data
public class GuestDTO {
    private Long id;
    private String name;
    private Gender gender;
    private Integer age;
}
