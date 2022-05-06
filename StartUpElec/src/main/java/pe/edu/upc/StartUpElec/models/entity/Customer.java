package pe.edu.upc.StartUpElec.models.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Integer id;
	@Column(name = "customer_name",length = 50, nullable = false)
	private String name;
	@Column(name = "customer_dni",length = 8, nullable = false)
	private String dni;
	@Column(name = "customer_lastname",length = 50, nullable = false)
	private String lastname;
	@Column(name = "customer_email",length = 50, nullable = false)
	private String email;
	@Column(name = "customer_image",length = 500, nullable = true)
	private String image;
	@Column(name = "customer_state",columnDefinition = "Boolean" )
	private boolean state;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Service> services;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<TypecardHistory> typecardhistories;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<TypecardHistory> getTypecardhistories() {
		return typecardhistories;
	}

	public void setTypecardhistories(List<TypecardHistory> typecardhistories) {
		this.typecardhistories = typecardhistories;
	}
	


}
