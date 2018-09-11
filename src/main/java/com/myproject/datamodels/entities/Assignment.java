package com.myproject.datamodels.entities;

import com.myproject.datamodels.enums.AssignmentStatus;
import com.myproject.datamodels.enums.Owner;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
public class Assignment {
    private final int id;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private AssignmentStatus status;
    private Map<LocalDate,Owner> daysTable;
}
