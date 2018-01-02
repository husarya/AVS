package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "repairs")
public class Repairs {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String descriptionOfRepair;
	
	@NotNull
	private String workCosts;
	
	private String partsCosts;
	
	@NotBlank
	private String technician;
	
	private String parts;
	
	@NotBlank
	private String dateOfRepair;
	
	@OneToOne
	private Client client;
	
	@OneToOne Status status;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescriptionOfRepair() {
		return descriptionOfRepair;
	}
	public void setDescriptionOfRepair(String descriptionOfRepair) {
		this.descriptionOfRepair = descriptionOfRepair;
	}
	public String getWorkCosts() {
		return workCosts;
	}
	public void setWorkCosts(String workCosts) {
		this.workCosts = workCosts;
	}
	public String getPartsCosts() {
		return partsCosts;
	}
	public void setPartsCosts(String partsCosts) {
		this.partsCosts = partsCosts;
	}
	public String getTechnician() {
		return technician;
	}
	public void setTechnician(String technician) {
		this.technician = technician;
	}
	public String getParts() {
		return parts;
	}
	public void setParts(String parts) {
		this.parts = parts;
	}
	public String getDateOfRepair() {
		return dateOfRepair;
	}
	public void setDateOfRepair(String dateOfRepair) {
		this.dateOfRepair = dateOfRepair;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
    
	
	
}
