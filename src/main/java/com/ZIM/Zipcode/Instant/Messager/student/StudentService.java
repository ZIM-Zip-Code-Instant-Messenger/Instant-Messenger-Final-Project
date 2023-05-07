package com.ZIM.Zipcode.Instant.Messager.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	public List <Student> getStudents(){
		return List.of(
			new Student (
				1L,
				"Andre",
				"andre.zip@gmail.com",
				LocalDate.of(2000, Month.NOVEMBER, 19), 
				29
			)
		);
    
}
}
