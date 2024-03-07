package com.onlineappointment.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.onlineappointment.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity,String> {

}
