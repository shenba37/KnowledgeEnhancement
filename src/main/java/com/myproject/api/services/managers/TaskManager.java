package com.myproject.api.services.managers;

import com.myproject.datamodels.entities.Task;
import com.myproject.datamodels.enums.Priority;
import com.myproject.datamodels.enums.TaskStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskManager {
    private static List<Task> allTasks = new ArrayList<>();

    public static Task createNewTask(String description, LocalDate scheduledDate, LocalDate dueDate, Priority priority){
        Task task = new Task(new Random().nextInt(Integer.MAX_VALUE));
        task.setDescription(description);
        task.setScheduledDate(scheduledDate);
        task.setPriority(priority);
        task.setDueDate(dueDate);
        task.setStatus(TaskStatus.OPEN);
        return task;
    }

    public static void main(String[] args) {
        Task task1 = createNewTask("Task-1",LocalDate.now(),LocalDate.now().plusDays(1),Priority.HIGH);
        allTasks.add(task1);

        Task task2 = createNewTask("Task-2",LocalDate.now().plusDays(1),LocalDate.now().plusDays(1),Priority.LOW);
        allTasks.add(task2);

        Task task3 = createNewTask("Task-3",LocalDate.now().plusDays(2),LocalDate.now().plusDays(2),Priority.LOW);
        allTasks.add(task3);

        System.out.println(allTasks);
    }
}
