package com.onlineappointment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineappointment.entity.PatientEntity;
import com.onlineappointment.repository.PatientRepository;

@Service
public  class PatientServiceImpl implements PatientService {
	
	@Autowired
	 PatientRepository patientrepo;

	@Override
	public PatientEntity register(PatientEntity patient){
		
		return patientrepo.save(patient);
	}

	

	@Override
	public List<PatientEntity> getAllPatients() {
		
		return patientrepo.findAll();
	}

	@Override
	public PatientEntity getPatient(String patientId) {

		return patientrepo.findById(patientId).orElse(null);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public PatientEntity update(PatientEntity patient) {
		// TODO Auto-generated method stub
		Optional<PatientEntity> patientupdate=patientrepo.findById(patient.getPatientId());
		
		PatientEntity patients=null;
		if(patientupdate.isPresent())
		{
			 patients=patientupdate.get();
			patientrepo.save(patient);
			
		}
		else
		{
			System.out.print("no patientId Found");
		}
		return patients;
	}

	@Override
	public void delete(String patientId) {
		
		
    Optional<PatientEntity> patientdelete=patientrepo.findById(patientId);
		
		
		if(patientdelete.isPresent())
		{
			patientrepo.deleteById(patientId);
			System.out.println("Patient record deleted");			
		}
		else
		{
			System.out.print("no patientId Found");
		}
		
	}

	
	
		
	

	

}
