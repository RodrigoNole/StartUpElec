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
@Table(name = "PromotionRequests")
public class PromotionRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promotion_request_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "promotion_request_discount", columnDefinition = "DECIMAL(3,2)")
	private Float discount;

	@Column(name = "promotion_request_state", nullable = false)
	private Boolean state;

	@Column(name = "promotion_request_description", length = 200)
	private String description;

	@Column(name = "promotion_request_creation_date")
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Column(name = "promotion_request_expiration_date")
	@Temporal(TemporalType.DATE)
	private Date expirationDate;

	@Column(name = "promotion_request_start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@ManyToOne
	@JoinColumn(name = "promotion_id", nullable = false)
	private Promotion promotion;

}
