package com.mt.spacetasks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mt.spacetasks.model.Tasks;

@Controller
@RequestMapping(path = "/api")
public class TasksDetailsController {

	@GetMapping(path = "/tasks", produces = "")
	public Tasks getAllTasks() {

		return null;
	}

	@GetMapping(path = "/tasks{id}", produces = "")
	public Tasks getTasksByID() {

		return null;
	}

	@PostMapping(path = "/tasks", produces = "")
	public Tasks createnewTask() {

		return null;
	}

	@PutMapping(path = "/tasks/{id}", produces = "")
	public Tasks updateTaskbyID() {

		return null;
	}
	

	@DeleteMapping(path = "/tasks/{id}", produces = "")
	public void deleteTaskByID() {
	}
	
	@DeleteMapping(path = "/tasks", produces = "")
	public void deleteAllTasks() {
	}
}
