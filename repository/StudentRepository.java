package com.suhid.studentportal.repository;

import com.suhid.studentportal.model.SignUpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//to save database, does post-delete-get etc by itself
@Repository
public interface StudentRepository extends JpaRepository<SignUpModel,Long> {

}
