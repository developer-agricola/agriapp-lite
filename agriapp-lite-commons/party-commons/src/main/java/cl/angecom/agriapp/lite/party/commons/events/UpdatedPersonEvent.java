package cl.angecom.agriapp.lite.party.commons.events;

import java.util.Date;

import org.springframework.stereotype.Component;

import cl.angecom.agriapp.lite.party.commons.dto.PersonDTO;

@Component
public class UpdatedPersonEvent {	
	
	private String partyId;
	private String salutation;
	private String firstName;
	private String middleName;
	private String lastName;	
	private String personalTitle;
	private String suffix;
	private String nickName;
	private String firstNameLocal;
	private String middleNameLocal;
	private String lastNameLocal;
	private String otherLocal;
	private String memberId;
	private String gender;
	private Date birthDate;
	private String maritalStatus;
	private String socialSecurityNumber;
	private Double totalYearsWorkExperience;
	private String comments;
	private String employmentStatusEnumId;	
	private String residenceStatusEnumId;
	private String occupation;
	
public UpdatedPersonEvent(){}
	
	public UpdatedPersonEvent(PersonDTO personDto){	
		setPartyId(personDto.getPartyId());
		setSalutation(personDto.getSalutation());
		setFirstName(personDto.getFirstName());
		setMiddleName(personDto.getMiddleName());
		setLastName( personDto.getLastName());
		setPersonalTitle(personDto.getPersonalTitle());
		setSuffix(personDto.getSuffix());
		setNickName(personDto.getNickName());
		setFirstNameLocal(personDto.getFirstNameLocal());
		setMiddleNameLocal(personDto.getMiddleNameLocal());
		setOtherLocal(personDto.getLastNameLocal());
		setOtherLocal(personDto.getOtherLocal());
		setMemberId(personDto.getMemberId());
		setGender(personDto.getGender());
		setBirthDate(personDto.getBirthDate());
		setMaritalStatus(personDto.getMaritalStatus());
		setSocialSecurityNumber(personDto.getSocialSecurityNumber());
		setTotalYearsWorkExperience(personDto.getTotalYearsWorkExperience());
		setComments(personDto.getComments());
		setEmploymentStatusEnumId(personDto.getEmploymentStatusEnumId());
		setResidenceStatusEnumId(personDto.getResidenceStatusEnumId());
		setOccupation(personDto.getOccupation());
	}	
	
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonalTitle() {
		return personalTitle;
	}
	public void setPersonalTitle(String personalTitle) {
		this.personalTitle = personalTitle;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFirstNameLocal() {
		return firstNameLocal;
	}
	public void setFirstNameLocal(String firstNameLocal) {
		this.firstNameLocal = firstNameLocal;
	}
	public String getMiddleNameLocal() {
		return middleNameLocal;
	}
	public void setMiddleNameLocal(String middleNameLocal) {
		this.middleNameLocal = middleNameLocal;
	}
	public String getLastNameLocal() {
		return lastNameLocal;
	}
	public void setLastNameLocal(String lastNameLocal) {
		this.lastNameLocal = lastNameLocal;
	}
	public String getOtherLocal() {
		return otherLocal;
	}
	public void setOtherLocal(String otherLocal) {
		this.otherLocal = otherLocal;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public Double getTotalYearsWorkExperience() {
		return totalYearsWorkExperience;
	}
	public void setTotalYearsWorkExperience(Double totalYearsWorkExperience) {
		this.totalYearsWorkExperience = totalYearsWorkExperience;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getEmploymentStatusEnumId() {
		return employmentStatusEnumId;
	}
	public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
		this.employmentStatusEnumId = employmentStatusEnumId;
	}
	public String getResidenceStatusEnumId() {
		return residenceStatusEnumId;
	}
	public void setResidenceStatusEnumId(String residenceStatusEnumId) {
		this.residenceStatusEnumId = residenceStatusEnumId;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}		
}
