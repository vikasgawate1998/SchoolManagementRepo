package com.SchoolManagements.SchoolManagament.Model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long course_Id;

	@Column(nullable = false)
	private String courseName;

	@Column
	private String description;

	@ManyToMany
	private Set<StudentEntity> students = new HashSet<>();

	@Override
	public String toString() {
		return "CourseEntity [Id=" + course_Id + ", courseName=" + courseName + ", description=" + description
				+ ",getId()=" + getCourseId() + ", getCourseName()=" + getCourseName() + ", getDescription()="
				+ getDescription() + ",students=" + getStudents() + "]";
	}

	public Long getCourseId() {
		return course_Id;
	}

	public void setId(Long course_id) {
		this.course_Id = course_id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<StudentEntity> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentEntity> students) {
		this.students = students;
	}
}
