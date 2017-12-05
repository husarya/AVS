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

	Repairs() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String descriptionOfTheFault;
	@NotBlank
	private String descriptionOfRepair;
	@NotNull
	private Long workCosts;
	private Long partsCosts;
	@NotBlank
	private String technician;
	private String parts;
	@NotBlank
	private String deliveredBy;
	
}
