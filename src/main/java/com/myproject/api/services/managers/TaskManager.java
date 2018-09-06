package com.myproject.api.services.managers;

import com.myproject.datamodels.entities.Task;

public class TaskManager {

    public static Task createNewTask(){
        Task task = new Task();
        return task;
    }
}
