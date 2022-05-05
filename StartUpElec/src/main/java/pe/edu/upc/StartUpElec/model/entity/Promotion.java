package pe.edu.upc.StartUpElec.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "Promotions")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promotion_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "promotion_name", length = 50)
	private String name;

	@Column(name = "promotion_description", length = 50)
	private String description;
	
	@Column(name = "promotion_state", nullable = false)
	private Boolean state;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;

	@OneToMany(mappedBy = "promotion", fetch = FetchType.LAZY)
	private List<PromotionRequest> promotionRequests;

}
