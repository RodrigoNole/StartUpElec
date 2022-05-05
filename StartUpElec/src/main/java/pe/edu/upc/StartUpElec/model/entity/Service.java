package pe.edu.upc.StartUpElec.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name = "Services")
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "service_name", length = 50)
	private String name;

	@Column(name = "service_description", length = 50)
	private String description;

	@Column(name = "service_state", nullable = false)
	private Boolean state;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "typeCard_id", nullable = false)
	private TypeCard typeCard;

	
}
