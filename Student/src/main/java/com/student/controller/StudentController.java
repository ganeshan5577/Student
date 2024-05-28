package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.repository.StudentService;


@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
		
	@PostMapping(value = "/saveStudent")
	public ResponseEntity<Student> saveStudentData(@RequestBody Student student){
		try {
			Student studentEntity =	studentService.saveStudentData(student);
			return new ResponseEntity<>(studentEntity,HttpStatus.CREATED);
		}
		catch (Exception e){
	           return new ResponseEntity<>(HttpStatusCode.valueOf(500));
	        }
		
		
	}
	
	@GetMapping("/byId/{studentId}")
	public ResponseEntity<List<Student>> getStudentId(@PathVariable("studentId") Integer id){
		try {
			List<Student> student = studentService.getStudentById(id,null,null);
			return new ResponseEntity<>(student,HttpStatusCode.valueOf(200));
		}
		catch (Exception e){
	           return new ResponseEntity<>(HttpStatusCode.valueOf(500));
	        }
		
	}
	
	@GetMapping("/byName/{studentName}")
	public ResponseEntity<List<Student>> getStudentName(@PathVariable("studentName") String name){
		try {
			List<Student> student = studentService.getStudentById(null,name,null);
			return new ResponseEntity<>(student,HttpStatusCode.valueOf(200));
		}
		catch (Exception e){
	           return new ResponseEntity<>(HttpStatusCode.valueOf(500));
	        }
		
	}
	
	@GetMapping("/byClass/{studentClass}")
	public ResponseEntity<List<Student>> getStudentClass(@PathVariable("studentClass") String stdName){
		try {
			List<Student> student = studentService.getStudentById(null,null,stdName);
			return new ResponseEntity<>(student,HttpStatusCode.valueOf(200));
		}
		catch (Exception e){
	           return new ResponseEntity<>(HttpStatusCode.valueOf(500));
	        }
		
	}
	
	@PutMapping(value = "/updateStudent")
	public ResponseEntity<Student> updateStudentData(@RequestBody Student student){
		try {
			Student studentEntity = studentService.updateStudentData(student);
			return new ResponseEntity<Student>(studentEntity,HttpStatus.CREATED);
		}
		catch (Exception e){
	           return new ResponseEntity<>(HttpStatusCode.valueOf(500));
	        }
		
		
	}

}
