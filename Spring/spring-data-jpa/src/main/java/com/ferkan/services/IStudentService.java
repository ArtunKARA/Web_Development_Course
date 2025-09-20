package com.ferkan.services;

import java.util.List;

import com.ferkan.dto.DtoStudent;
import com.ferkan.dto.DtoStudentIU;

public interface IStudentService {
	
	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public Boolean deleteStudentById(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU updatedStudent);
	
}
