package com.myproject.datamodels.entities;

import com.myproject.datamodels.enums.Priority;
import com.myproject.datamodels.enums.TaskStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Task {
    private final int id;
    private String description;
    private LocalDate scheduledDate;
    private LocalDate dueDate;
    private Priority priority;
    private TaskStatus status;
}
