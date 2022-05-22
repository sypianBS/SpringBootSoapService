package com.example.demo.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.student.schemeOutput.*;

@Service
public class StudentService {
	private List<Student> students;
	
	public StudentService() {		
		students = this.generateStudents();
	}
	
	public Student getStudentsById(long id) {
		return students
				.stream()
				.filter(student -> student.getId() == id)
				.findFirst().get();
	}
	
	public List<Student> generateStudents() {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("John");
		
		Student student2 = new Student();
		student2.setId(2);
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Mary");
		
		Student student4 = new Student();
		student4.setId(4);
		student4.setName("Craig");
				
		List<Student> studentsList = new ArrayList<Student>();
		Collections.addAll(studentsList, student1, student2, student3, student4);
		
		return studentsList;
	} 
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public long getNumberOfStudents() {
		return this.students.size();
	}

}
