package com.myproject.datamodels.enums;

public enum TaskStatus {
    OPEN(1),
    IN_PROGRESS(2),
    ON_HOLD(3),
    COMPLETED(4),
    CANCELLED(5),
    ARCHIVED(6);

    int value;
    TaskStatus(int value){
        this.value = value;
    }
}
