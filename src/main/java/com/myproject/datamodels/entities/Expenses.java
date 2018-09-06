package com.myproject.datamodels.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Expenses {
    private int id;
    private int amount;
    private String description;
}
