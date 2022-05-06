package pe.edu.upc.StartUpElec.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Service")
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_service_id")
	private Integer id;
	@Column(name = "type_service_name",length = 50, nullable = false)
	private String name;
	@Column(name = "type_service_description",length = 50, nullable = false)
	private String description;
	@Column(name = "type_service_state",columnDefinition = "Boolean" )
	private boolean state;
	@ManyToOne
	@JoinColumn(name = "Customers_customer_id",nullable = false)
	private Customer customer;		// Customers_customer_id
	
	@ManyToOne
	@JoinColumn(name = "TypeCards_type_card_id",nullable = false)
	private Typecard typecard; 	// TypeCards_type_card_id
	
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Typecard getTypecard() {
		return typecard;
	}

	public void setTypecard(Typecard typecard) {
		this.typecard = typecard;
	}

	
}
