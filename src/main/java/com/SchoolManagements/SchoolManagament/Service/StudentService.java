package com.SchoolManagements.SchoolManagament.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagements.SchoolManagament.Model.CourseEntity;
import com.SchoolManagements.SchoolManagament.Model.StudentEntity;
import com.SchoolManagements.SchoolManagament.Repository.CourseRepo;
import com.SchoolManagements.SchoolManagament.Repository.StudentRepo;


@Service
public class StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	
	public StudentEntity SaveAllData(StudentEntity studentEntity)
	{
		studentEntity=studentRepo.save(studentEntity);
		return studentEntity;
	}
	public String registerStudentToCourse(Long stu_Id, Long course_Id) {
        Optional<StudentEntity> studentEntity = studentRepo.findById(stu_Id);
        if (!studentEntity.isPresent()) {
            return "Student not found with ID: " + stu_Id;
        }

        Optional<CourseEntity> courseEntity = courseRepo.findById(course_Id);
        if (!courseEntity.isPresent()) {
            return "Course not found with ID: " + course_Id;
        }

        StudentEntity student = studentEntity.get();
        CourseEntity course = courseEntity.get();

        // Add the course to the student's courses
        student.getCourses().add(course);

        // Add the student to the course's students (for bidirectional mapping)
        course.getStudents().add(student);

        // Save the student (or course)
        studentRepo.save(student);

        return "Student with ID: " + stu_Id + " successfully registered to Course with ID: " + course_Id;
    }


	public List<StudentEntity> getAllRecords() {
		List<StudentEntity>	studentEntity=studentRepo.findAll();
		return studentEntity;
		
	}
}
