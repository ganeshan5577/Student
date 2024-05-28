package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	
	@Query(value ="Select * from student where id =:id", nativeQuery = true)
	List<Student> getStudentIdData(Integer id);
	
	@Query(value ="Select * from student where name =:name", nativeQuery = true)
	List<Student> getStudentNameData(String name);
	
	@Query(value ="Select * from student where class =:stdClass", nativeQuery = true)
	List<Student> getStudentClassData(String stdClass);
    

}
