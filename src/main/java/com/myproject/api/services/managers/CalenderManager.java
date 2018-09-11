package com.myproject.api.services.managers;

import com.myproject.datamodels.entities.Assignment;
import com.myproject.datamodels.enums.AssignmentStatus;
import com.myproject.datamodels.enums.Owner;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CalenderManager {
    public static List<Assignment> assignments = new ArrayList<>();

    public static Assignment createNewAssignment(String description,LocalDate startDate,LocalDate endDate){
        Assignment assignment = new Assignment(new Random().nextInt());
        assignment.setDescription(description);
        assignment.setStartDate(startDate);
        assignment.setEndDate(endDate);
        assignment.setStatus(AssignmentStatus.NEW);
        return assignment;
    }

    public static void scheduleNewAssignment(Assignment assignment){
        assignment.setDaysTable(createDaysTable(assignment.getStartDate(),assignment.getEndDate()));
        assignment.setStatus(AssignmentStatus.SCHEDULED);
    }

    private static Map<LocalDate,Owner> createDaysTable(LocalDate assignmentStartDate, LocalDate assignmentEndDate){
        long numberOfDays = ChronoUnit.DAYS.between(assignmentStartDate, assignmentEndDate);
        System.out.println(numberOfDays);
        Map<LocalDate,Owner> dayAssignmentToOwner = new HashMap<>();
        while(numberOfDays > 0){
            for (Owner owner :getOwnersInOrders()) {
                dayAssignmentToOwner.put(assignmentStartDate.plusDays(numberOfDays),owner);
                numberOfDays--;
            }
        }
        System.out.println(Arrays.asList(dayAssignmentToOwner));
        return dayAssignmentToOwner;
    }

    private static Owner[] getOwnersInOrders(){
        Owner[] owners = Owner.values();
        Arrays.sort(owners,Comparator.comparing(Owner::getId));
        return owners;
    }

    public static void main(String[] args) {
        Assignment assignment = createNewAssignment("Assignment-1",LocalDate.now(),LocalDate.now().plusDays(8));
        assignments.add(assignment);
        scheduleNewAssignment(assignment);
    }
}
