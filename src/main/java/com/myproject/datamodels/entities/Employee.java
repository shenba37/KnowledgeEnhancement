package com.myproject.datamodels.entities;

import com.myproject.datamodels.enums.Gender;
import com.myproject.datamodels.enums.Occupation;
import com.myproject.datamodels.enums.Rating;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private Gender gender;

    private Occupation occupation;
    private Rating rating;

    private boolean isAdmin;
}
