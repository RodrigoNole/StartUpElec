package pe.edu.upc.StartUpElec.models.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TypeCards")
public class Typecard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "typecard_id")
	private Integer id;
	@Column(name = "typecard_name",length = 50, nullable = false)
	private String name;
	@Column(name = "typecard_state",columnDefinition = "Boolean" )
	private boolean state;
	
	@OneToMany(mappedBy = "typecard",fetch = FetchType.LAZY)
	private List<Service>services;
	
	@OneToMany(mappedBy = "typecard",fetch = FetchType.LAZY)
	private List<TypecardHistory>typecardhitories;

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

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<TypecardHistory> getTypecardhitories() {
		return typecardhitories;
	}

	public void setTypecardhitories(List<TypecardHistory> typecardhitories) {
		this.typecardhitories = typecardhitories;
	}
	
}
