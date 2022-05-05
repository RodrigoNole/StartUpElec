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
@Table(name = "TypeCardsHistories")
public class TypeCardHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_card_histories_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "type_card_histories_details_number", length = 16)
	private String detailsNumber;

	@ManyToOne
	@JoinColumn(name = "typeCard_id", nullable = false)
	private TypeCard typeCard;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	
}
