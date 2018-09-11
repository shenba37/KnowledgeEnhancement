package com.myproject.datamodels.enums;

public enum AssignmentStatus {
    NEW(1),
    SCHEDULED(2),
    IN_PROGRESS(3),
    ON_HOLD(4),
    COMPLETED(5),
    CANCELLED(6),
    ARCHIVED(7);

    int value;
    AssignmentStatus(int value){
        this.value = value;
    }
}
