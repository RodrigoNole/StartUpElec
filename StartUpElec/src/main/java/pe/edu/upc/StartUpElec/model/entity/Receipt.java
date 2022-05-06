package pe.edu.upc.StartUpElec.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Data

@Entity
@Table(name = "Receipts")
public class Receipt implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "receipt_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "receipt_month", length = 50)
	private String month;

	@Column(name = "receipt_amount", columnDefinition = "DECIMAL(7,2)")
	private Float amount;

	@Column(name = "receipt_description", length = 200)
	private String description;

	@Column(name = "receipt_creation_date")
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Column(name = "receipt_expiration_date")
	@Temporal(TemporalType.DATE)
	private Date expirationDate;

	@ManyToOne
	@JoinColumn(name = "home_id", nullable = false)
	private Home home;

}
