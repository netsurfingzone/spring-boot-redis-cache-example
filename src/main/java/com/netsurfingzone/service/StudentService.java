package com.netsurfingzone.service;

import org.springframework.stereotype.Component;

import com.netsurfingzone.entity.Student;

@Component
public interface StudentService {
	public Student save(Student student);

	public Student update(Student student);

	public Student get(int id);

	public void delete(Student student);
}
