package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Value("${value.name}")
	private String newnameString;
	@GetMapping("/")
	public String homepage()
	{
		return  newnameString+" to student list";
	}
	@GetMapping("/list")
	public List<Student> getList()
	{
		List<Student> detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"XXXX",23));
		detailsList.add(new Student(2,"YYYY",42));
		detailsList.add(new Student(3,"ZZZZ",84));
		return detailsList;
	}
	

}
