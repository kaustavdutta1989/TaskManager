package com.srhheidelberg.sad.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srhheidelberg.sad.taskmanager.model.EmployeeProfile;

public interface EmployeeProfileJPARepository extends JpaRepository<EmployeeProfile, Integer>{

}
