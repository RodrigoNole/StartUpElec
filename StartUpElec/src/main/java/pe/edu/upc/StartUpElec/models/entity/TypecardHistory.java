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
@Table(name = "TypeCardsHistories")
public class TypecardHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_card_histories_id")
	private Integer id;
	@Column(name = "type_card_histories_details_number",length = 50, nullable = false)
	private String detailNumber;
	
	@ManyToOne
	@JoinColumn(name = "type_card_id",nullable = false)
	private Typecard typecard;
	
	@ManyToOne
	@JoinColumn(name = "customer_id",nullable = false)
	private Customer customer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetailNumber() {
		return detailNumber;
	}

	public void setDetailNumber(String detailNumber) {
		this.detailNumber = detailNumber;
	}

	public Typecard getTypecard() {
		return typecard;
	}

	public void setTypecard(Typecard typecard) {
		this.typecard = typecard;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
