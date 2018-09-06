package com.myproject.datamodels.enums;

import lombok.Getter;

public enum Rating {
    EXCELLENT(5),
    GOOD(4),
    AVERAGE(3),
    NOT_SATISFACTORY(2),
    POOR(1);

    @Getter
    private  int value;
    Rating(int value){
        this.value = value;
    }
}
