package com.myproject.datamodels.enums;

public enum Status {
    NEW(1),
    SCHEDULED(2),
    IN_PROGRESS(3),
    COMPLETED(4),
    ARCHIVED(5),
    CANCELLED(6);

    int value;
    Status(int value){
        this.value = value;
    }
}
