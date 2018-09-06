package com.myproject.datamodels.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Investment {
    private int id;
    private int amount;
    private String description;
    private int investorId;
}
