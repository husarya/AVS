package pl.coderslab.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private String streetAndLocalNumber;
	@NotBlank
	private String city;
	@NotBlank
	private String postCode;
	@NotBlank
	private String email;
	@NotBlank
	private String phone;
	@NotBlank
	private String brand;
	@NotBlank
	private String model;
	@NotBlank
	private String deviceCondition;
	@NotBlank
	private String colour;
	@NotBlank
	private String technician;
	@NotBlank
	private String type;
	@NotBlank
	private String descriptionOfTheFault;
	@NotBlank
	private String dateOfAdd;
	
	@OneToOne
	private Repairs repairs;
	
	@ManyToOne
	private Status status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAndLocalNumber() {
		return streetAndLocalNumber;
	}
	public void setStreetAndLocalNumber(String streetAndLocalNumber) {
		this.streetAndLocalNumber = streetAndLocalNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getDeviceCondition() {
		return deviceCondition;
	}
	public void setDeviceCondition(String deviceCondition) {
		this.deviceCondition = deviceCondition;
	}
	public String getTechnician() {
		return technician;
	}
	public void setTechnician(String technician) {
		this.technician = technician;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescriptionOfTheFault() {
		return descriptionOfTheFault;
	}
	public void setDescriptionOfTheFault(String descriptionOfTheFault) {
		this.descriptionOfTheFault = descriptionOfTheFault;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDateOfAdd() {
		return dateOfAdd;
	}
	public void setDateOfAdd(String dateOfAdd) {
		this.dateOfAdd = dateOfAdd;
	}
	public Repairs getRepairs() {
		return repairs;
	}
	public void setRepairs(Repairs repairs) {
		this.repairs = repairs;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	

//	public Repairs getRepairs() {
//		return repairs;
//	}
//	public void setRepairs(Repairs repairs) {
//		this.repairs = repairs;
//	}
//	public Status getStatus() {
//		return status;
//	}
//	public void setStatus(Status status) {
//		this.status = status;
//	}
//	
}
