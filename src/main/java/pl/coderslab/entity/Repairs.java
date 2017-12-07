package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Long workCosts;
	
	private Long partsCosts;
	
	@NotBlank
	private String technician;
	
	private String parts;
	
	
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
	public Long getWorkCosts() {
		return workCosts;
	}
	public void setWorkCosts(Long workCosts) {
		this.workCosts = workCosts;
	}
	public Long getPartsCosts() {
		return partsCosts;
	}
	public void setPartsCosts(Long partsCosts) {
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

	
	
}
