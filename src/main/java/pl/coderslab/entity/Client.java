package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "clients")
public class Client {

	Client() {
		
	}
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
	
	
}
