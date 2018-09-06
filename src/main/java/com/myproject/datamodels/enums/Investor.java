package com.myproject.datamodels.enums;

import lombok.Getter;

@Getter
public enum Investor {
    SHENBAGA_KUMAR(1),
    SIVA(2),
    VINOTH(3),
    VELMURUGAN(4);

    public int id;
    Investor(int id){
        this.id = id;
    }
}
