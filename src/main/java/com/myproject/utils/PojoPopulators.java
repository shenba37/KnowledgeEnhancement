package com.myproject.utils;

import com.myproject.datamodels.enums.Gender;
import com.myproject.datamodels.enums.Occupation;
import com.myproject.datamodels.enums.Rating;
import com.myproject.datamodels.entities.Employee;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.UUID;

public class PojoPopulators {
    private static Random randomNumberGenerator = new Random();

    public static Collection<Employee> populateEmployees(int numbers){
        Collection<Employee> employees = new HashSet<>();
        for(int i=0; i<numbers; i++){
            Employee employee = new Employee();
            employee.setId(randomNumberGenerator.nextInt(Integer.MAX_VALUE));
            employee.setName(UUID.randomUUID().toString());
            Gender[] genderValues = Gender.values();
            employee.setGender(genderValues[randomNumberGenerator.nextInt(genderValues.length)]);
            Occupation[] occupationValues = Occupation.values();
            employee.setOccupation(occupationValues[randomNumberGenerator.nextInt(occupationValues.length)]);
            Rating[] ratingValues = Rating.values();
            employee.setRating(ratingValues[randomNumberGenerator.nextInt(ratingValues.length)]);
            employees.add(employee);
            if(employee.getOccupation().equals(Occupation.ADMIN)){
                employee.setAdmin(true);
            }else{
                employee.setAdmin(false);
            }
        }
        employees.forEach(System.out::println);
        return employees;
    }

    public static void main(String[] args) {
        populateEmployees(100);
    }
}
