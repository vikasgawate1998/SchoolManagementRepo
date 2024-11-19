package com.SchoolManagements.SchoolManagament.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolManagements.SchoolManagament.Model.CourseEntity;
@Repository
public interface CourseRepo extends JpaRepository<CourseEntity, Long>{

}
