package com.learning.java8programming.api_streams;

import com.myproject.datamodels.entities.Employee;
import com.myproject.datamodels.enums.Rating;
import com.myproject.utils.PojoPopulators;

import java.util.Collection;
import java.util.stream.Collectors;

public class Implementation implements Concept {

    @Override
    public void internalIteration() {
        Collection<Employee> employees = PojoPopulators.populateEmployees(100);
        System.out.println("\n\n EXCELLENT EMPLOYEES : ");
        System.out.println(employees.stream().filter(employee -> employee.getRating().equals(Rating.EXCELLENT)).collect(Collectors.toList()).size());
    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.internalIteration();
    }
}
