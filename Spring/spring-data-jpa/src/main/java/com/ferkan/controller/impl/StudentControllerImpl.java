package com.ferkan.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferkan.controller.IStudentControler;
import com.ferkan.dto.DtoStudent;
import com.ferkan.dto.DtoStudentIU;
import com.ferkan.services.IStudentService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentControler {
	
	@Autowired
	private IStudentService studentService;
	
	@PostMapping(path = "/save")
	@Override
	public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping(path = "/list")
	@Override
	public List<DtoStudent> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping(path = "/getStudentById/{id}")
	@Override
	public DtoStudent getStudentById(@PathVariable(value = "id" , required = true) Integer id) {
		return studentService.getStudentById(id);
	}

	@DeleteMapping(path = "/getDeleteByID/{id}")
	@Override
	public Boolean deleteStudentById(@PathVariable(value = "id", required = true) Integer id) {
		return studentService.deleteStudentById(id);
	}

	
	@PutMapping(path = "/update/{id}")
	@Override
	public DtoStudent updatedStudent(@PathVariable(value = "id", required = true) Integer id,@RequestBody DtoStudentIU updateStudent) {
		return studentService.updateStudent(id, updateStudent);
	}
	

}
