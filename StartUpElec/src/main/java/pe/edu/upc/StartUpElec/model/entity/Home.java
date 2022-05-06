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
@Table(name = "Homes")
public class Home implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "home_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "costumer_adress", length = 50)
	private String adress;

	@Column(name = "costumer_description", length = 200)
	private String description;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@OneToMany(mappedBy = "home", fetch = FetchType.LAZY)
	private List<Receipt> receipts;

}
