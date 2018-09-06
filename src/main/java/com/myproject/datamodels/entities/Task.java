package com.myproject.datamodels.entities;

import com.myproject.datamodels.enums.Priority;
import com.myproject.datamodels.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Task {
    private int id;
    private String description;
    private LocalDate scheduledDate;
    private Priority priority;
    private Status status;
}
