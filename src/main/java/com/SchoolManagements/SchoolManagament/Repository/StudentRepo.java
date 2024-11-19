package com.SchoolManagements.SchoolManagament.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolManagements.SchoolManagament.Model.StudentEntity;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long> {

}
