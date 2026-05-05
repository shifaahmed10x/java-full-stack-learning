package com.ahmed.SpringJDBC;

import com.ahmed.SpringJDBC.model.Student;
import com.ahmed.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setName("Shifa");
		s1.setRollno(107);
		s1.setDivision("TE-A");

		StudentService service =context.getBean(StudentService.class);
		service.addStudent(s1);

		List<Student> studentList = service.getStudents();
		System.out.println(studentList);
	}

}
