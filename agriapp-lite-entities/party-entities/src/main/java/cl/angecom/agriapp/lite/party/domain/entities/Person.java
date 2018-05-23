package cl.angecom.agriapp.lite.party.domain.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSON")
public class Person {	
	@Id	
	@Column(name = "PARTY_ID", nullable = false, length = 20)
	private String partyId;
	
	@Column(name = "SALUTATION", length = 100)
	private String salutation;
	
	@Column(name = "FIRST_NAME", nullable= false, length = 100)
	private String firstName;
	
	@Column(name = "MIDDLE_NAME", length = 100)
	private String middleName;
	
	@Column(name = "LAST_NAME", length = 100)
	private String lastName;
	
	@Column(name = "PERSONAL_NAME", length = 100)
	private String personalTitle;
	
	@Column(name = "SUFFIX", length = 100)
	private String suffix;	
	
	@Column(name = "NICK_NAME_LOCAL", length = 100)
	private String nickName;	
	
	@Column(name = "FIRST_NAME_LOCAL", length = 100)
	private String firstNameLocal;
	
	@Column(name = "MIDDLE_NAME_LOCAL", length = 100)
	private String middleNameLocal;
	
	@Column(name = "LAST_NAME_LOCAL", length = 100)
	private String lastNameLocal;
	
	@Column(name = "OTHER_LOCAL", length = 100)
	private String otherLocal;
	
	@Column(name = "GENDER")	
	private boolean gender;
	
	@Column(name = "BIRTH_DATE")
	private Date birthDate;
	
	@Column(name = "MARITAL_STATUS")
	private String maritalStatus;
	
	@Column(name = "SOCIAL_SECURITY_NUMBER", length = 255)
	private String socialSecurityNumber;
	
	@Column(name = "PASSPORT_NUMBER", length = 255)
	private String passportNumber;
	
	@Column(name = "PASSPORT_EXPIRE_DATE")
	private Date passportExpireDate;
	
	@Column(name = "TOTAL_YEARS_WORK_EXPERIENCE", precision = 2, scale = 1)
	private Double totalYearsWorkExperience;
	
	@Column(name = "COMMENTS", length = 255)
	private String comments;
	
	@Column(name = "EMPLOYMENT_STATUS_ENUM_ID", length = 20)
	private String employmentStatusEnumId;	
	
	@Column(name = "RESIDENCE_STATUS_ENUM_ID", length = 20)
	private String residenceStatusEnumId;	
	
	@Column(name = "RESIDENCE_STATUS_ENUM_ID", length = 100)
	private String occupation;
	
	@Column(name = "YEARS_WITH_EMPLOYER")
	private Long yearsWithEmployer;
	
	@Column(name = "MONTHS_WITH_EMPLOYER")
	private Long monthsWithEmployer;
	
	@Column(name = "CARD_ID", length = 60)
	private String cardId;
	
}
