package com.blood_bank_system.tables;

public class blood_bank {
	private int id;
	private String name;
	private String address;
	private String region;
	private String contactNumber;
	private String email;
	private String operationalHours;
	private String specialServices;
	private String contactPersonName;
	private String contactPersonDesignation;
	private String contactPersonPhone;
	private String contactPersonEmail;
	private String certificationDetails;
	private String accreditationDetails;
	private int storageCapacity;
	private String bloodComponentsHandled;
	private String testingFacilities;
	private String transfusionServices;
	private String otherActivities;
	private String additionalInformation;

	// Constructor
	public blood_bank(String name, String address, String region, String contactNumber, String email, String operationalHours,
                     String specialServices, String contactPersonName, String contactPersonDesignation,
                     String contactPersonPhone, String contactPersonEmail, String certificationDetails,
                     String accreditationDetails, int storageCapacity, String bloodComponentsHandled,
                     String testingFacilities, String transfusionServices, String otherActivities,
                     String additionalInformation) {
        this.name = name;
        this.address = address;
        this.region = region;
        this.contactNumber = contactNumber;
        this.email = email;
        this.operationalHours = operationalHours;
        this.specialServices = specialServices;
        this.contactPersonName = contactPersonName;
        this.contactPersonDesignation = contactPersonDesignation;
        this.contactPersonPhone = contactPersonPhone;
        this.contactPersonEmail = contactPersonEmail;
        this.certificationDetails = certificationDetails;
        this.accreditationDetails = accreditationDetails;
        this.storageCapacity = storageCapacity;
        this.bloodComponentsHandled = bloodComponentsHandled;
        this.testingFacilities = testingFacilities;
        this.transfusionServices = transfusionServices;
        this.otherActivities = otherActivities;
        this.additionalInformation = additionalInformation;
    }

	public blood_bank(int id,String name,String address,String region,String contactNumber,String email){
			this.id=id;
		this.name = name;
	        this.address = address;
	        this.region = region;
	        this.contactNumber = contactNumber;
	        this.email = email;
	}

	public blood_bank() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOperationalHours() {
		return operationalHours;
	}

	public void setOperationalHours(String operationalHours) {
		this.operationalHours = operationalHours;
	}

	public String getSpecialServices() {
		return specialServices;
	}

	public void setSpecialServices(String specialServices) {
		this.specialServices = specialServices;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonDesignation() {
		return contactPersonDesignation;
	}

	public void setContactPersonDesignation(String contactPersonDesignation) {
		this.contactPersonDesignation = contactPersonDesignation;
	}

	public String getContactPersonPhone() {
		return contactPersonPhone;
	}

	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}

	public String getContactPersonEmail() {
		return contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	public String getCertificationDetails() {
		return certificationDetails;
	}

	public void setCertificationDetails(String certificationDetails) {
		this.certificationDetails = certificationDetails;
	}

	public String getAccreditationDetails() {
		return accreditationDetails;
	}

	public void setAccreditationDetails(String accreditationDetails) {
		this.accreditationDetails = accreditationDetails;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getBloodComponentsHandled() {
		return bloodComponentsHandled;
	}

	public void setBloodComponentsHandled(String bloodComponentsHandled) {
		this.bloodComponentsHandled = bloodComponentsHandled;
	}

	public String getTestingFacilities() {
		return testingFacilities;
	}

	public void setTestingFacilities(String testingFacilities) {
		this.testingFacilities = testingFacilities;
	}

	public String getTransfusionServices() {
		return transfusionServices;
	}

	public void setTransfusionServices(String transfusionServices) {
		this.transfusionServices = transfusionServices;
	}

	public String getOtherActivities() {
		return otherActivities;
	}

	public void setOtherActivities(String otherActivities) {
		this.otherActivities = otherActivities;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@Override
	public String toString() {
		return "BloodBank{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", region='" + region + '\''
				+ ", contactNumber='" + contactNumber + '\'' + ", email='" + email + '\'' + ", operationalHours='"
				+ operationalHours + '\'' + ", specialServices='" + specialServices + '\'' + ", contactPersonName='"
				+ contactPersonName + '\'' + ", contactPersonDesignation='" + contactPersonDesignation + '\''
				+ ", contactPersonPhone='" + contactPersonPhone + '\'' + ", contactPersonEmail='" + contactPersonEmail
				+ '\'' + ", certificationDetails='" + certificationDetails + '\'' + ", accreditationDetails='"
				+ accreditationDetails + '\'' + ", storageCapacity=" + storageCapacity + ", bloodComponentsHandled='"
				+ bloodComponentsHandled + '\'' + ", testingFacilities='" + testingFacilities + '\''
				+ ", transfusionServices='" + transfusionServices + '\'' + ", otherActivities='" + otherActivities
				+ '\'' + ", additionalInformation='" + additionalInformation + '\'' + '}';
	}
}
