package com.myproject.datamodels.enums;

public enum Owner {
    VELMURUGAN(4),
    SIVA_KUMAR(3),
    VINODTH_KUMAR(2),
    SHENBAGA_KUMAR(1);

    public int id;
    Owner(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
