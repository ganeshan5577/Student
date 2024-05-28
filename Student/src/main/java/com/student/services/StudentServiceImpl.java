package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.repository.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentData(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudentData(Student student) {
		// TODO Auto-generated method stub
			studentRepository.findById(student.getId()).map(studentObj ->{
			studentObj.setName(student.getName());
			studentObj.setDateOfBirth(student.getDateOfBirth());
			studentObj.setJoiningDate(student.getJoiningDate());
			studentObj.setStdClass(student.getStdClass());
			return studentRepository.save(studentObj);
			
		});
			return student;
		
	}


	@Override
	public List<Student> getStudentById(Integer id, String name, String stdClass) {
		// TODO Auto-generated method stub
		if(id != null) {
			return  studentRepository.getStudentIdData(id);
					//findById(id).get();
		} else if(name != null) {
			return studentRepository.getStudentNameData(name);
		} else if(stdClass != null) {
			return studentRepository.getStudentClassData(stdClass);
		}
		return null;
		
	}
	
}
