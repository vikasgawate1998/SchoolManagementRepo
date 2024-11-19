package com.SchoolManagements.SchoolManagament.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagements.SchoolManagament.Model.CourseEntity;
import com.SchoolManagements.SchoolManagament.Repository.CourseRepo;

@Service
public class CourseService {

@Autowired
private CourseRepo courseRepo;
	
	public CourseEntity SaveAllData(CourseEntity courseEntity)
	{
		courseEntity=courseRepo.save(courseEntity);
		return courseEntity;
	}
	
	
}
