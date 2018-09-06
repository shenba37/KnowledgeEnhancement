package com.myproject.datamodels.enums;

import lombok.Getter;

@Getter
public enum Gender {
    MALE('M'),
    FEMALE('F');

    private char value;
    Gender(char value){
        this.value = value;
    }
}
