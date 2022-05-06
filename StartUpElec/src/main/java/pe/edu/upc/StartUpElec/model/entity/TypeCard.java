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
@Table(name = "TypeCards")
public class TypeCard implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_card_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "type_card_name", length = 50)
	private String name;

	@Column(name = "type_card_state", nullable = false)
	private Boolean state;

	@OneToMany(mappedBy = "typeCard", fetch = FetchType.LAZY)
	private List<Service> services;

	@OneToMany(mappedBy = "typeCard", fetch = FetchType.LAZY)
	private List<TypeCardHistory> typeCardHistories;

	
}
