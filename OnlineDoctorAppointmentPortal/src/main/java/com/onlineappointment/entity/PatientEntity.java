package com.onlineappointment.entity;


import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PatientEntity {
	
	@Id
	private  String patientId;
	private  String patientName;
	private String mobileNumber;
	@Column(unique = true)
	private String email;
	private String medicalInformation;
	private String bloodGroup;
	private String chronicDisease;
	private String familyDoctorName;
	private String emergencyContact;
	private String addressLine1;
	private String addressLine2;
	private  String city;
	private  String state;
	private String pincode;
	private String gender;
	private String medicalInsurances;
	private String aadhar;
	private String password;
	private String confirmPassword;
	
	
	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	




	
	

	public PatientEntity( String mobileNumber, String email, String medicalInformation,
			String bloodGroup, String chronicDisease, String familyDoctorName, String emergencyContact,
			String addressLine1, String addressLine2, String pincode, String gender, String medicalInsurances,
			String aadhar, String password, String confirmPassword,String patientId, String patientName, String city, String state) {
		super();
		
		
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.medicalInformation = medicalInformation;
		this.bloodGroup = bloodGroup;
		this.chronicDisease = chronicDisease;
		this.familyDoctorName = familyDoctorName;
		this.emergencyContact = emergencyContact;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.gender = gender;
		this.medicalInsurances = medicalInsurances;
		this.aadhar = aadhar;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.patientId = patientId;
		this.patientName = patientName;
		this.city = city;
		this.state = state;
	}












	











	public String getPatientId() {
		return patientId;
	}












	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}












	public String getPatientName() {
		return patientName;
	}












	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}












	public String getMobileNumber() {
		return mobileNumber;
	}












	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}












	public String getEmail() {
		return email;
	}












	public void setEmail(String email) {
		this.email = email;
	}












	public String getMedicalInformation() {
		return medicalInformation;
	}












	public void setMedicalInformation(String medicalInformation) {
		this.medicalInformation = medicalInformation;
	}












	public String getBloodGroup() {
		return bloodGroup;
	}












	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}












	public String getChronicDisease() {
		return chronicDisease;
	}












	public void setChronicDisease(String chronicDisease) {
		this.chronicDisease = chronicDisease;
	}












	public String getFamilyDoctorName() {
		return familyDoctorName;
	}












	public void setFamilyDoctorName(String familyDoctorName) {
		this.familyDoctorName = familyDoctorName;
	}












	public String getEmergencyContact() {
		return emergencyContact;
	}












	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}












	public String getAddressLine1() {
		return addressLine1;
	}












	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}












	public String getAddressLine2() {
		return addressLine2;
	}












	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}












	public String getCity() {
		return city;
	}












	public void setCity(String city) {
		this.city = city;
	}












	public String getState() {
		return state;
	}












	public void setState(String state) {
		this.state = state;
	}












	public String getPincode() {
		return pincode;
	}












	public void setPincode(String pincode) {
		this.pincode = pincode;
	}












	public String getGender() {
		return gender;
	}












	public void setGender(String gender) {
		this.gender = gender;
	}












	public String getMedicalInsurances() {
		return medicalInsurances;
	}












	public void setMedicalInsurances(String medicalInsurances) {
		this.medicalInsurances = medicalInsurances;
	}












	public String getAadhar() {
		return aadhar;
	}












	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}












	public String getPassword() {
		return password;
	}












	public void setPassword(String password) {
		this.password = password;
	}












	public String getConfirmPassword() {
		return confirmPassword;
	}












	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	



















}
