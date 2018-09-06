package com.myproject.datamodels.enums;

import lombok.Getter;

@Getter
public enum Occupation {
    FARMER(1),
    ELECTRICIAN(2),
    HELPER(3),
    AGENT(4),
    DRIVER(5),
    ADMIN(6);

    private int id;

    Occupation(int id){
        this.id = id;
    }
}
