package com.student.repository;



import java.util.List;

import com.student.model.Student;


public interface StudentService {

	Student saveStudentData(Student student);

	Student updateStudentData(Student student);

	List<Student> getStudentById(Integer id,String name, String stdClass);

}
