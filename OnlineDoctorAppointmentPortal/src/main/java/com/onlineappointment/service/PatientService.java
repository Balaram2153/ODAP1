package com.onlineappointment.service;

import java.util.List;

import com.onlineappointment.entity.PatientEntity;


public interface PatientService {

	public PatientEntity register(PatientEntity patient);
	public List<PatientEntity> getAllPatients();
	public PatientEntity getPatient(String patientId);
	public PatientEntity update(PatientEntity patient);
	public void delete(String patientId);

	
	
}
