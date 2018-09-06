package com.myproject.datamodels.enums;

public enum Priority {
    TOP(4),
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int value;
    Priority(int value){
        this.value = value;
    }
}
