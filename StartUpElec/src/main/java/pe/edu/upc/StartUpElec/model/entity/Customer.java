package pe.edu.upc.StartUpElec.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "Customers")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "costumer_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "costumer_name", length = 50, nullable = false)
	private String name;

	@Column(name = "costumer_dni", length = 8, nullable = false)
	private String dni;

	@Column(name = "costumer_lastName", length = 50, nullable = false)
	private String lastName;

	@Column(name = "costumer_email", length = 50, nullable = false)
	private String email;

	@Column(name = "costumer_image", length = 500, nullable = true)
	private String image;

	@Column(name = "costumer_state", nullable = false)
	private Boolean state;

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Home> homes;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Promotion> promotions;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Service> services;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<TypeCardHistory> typeCardsHistories;
}
