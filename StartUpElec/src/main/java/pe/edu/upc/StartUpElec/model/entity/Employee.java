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
@Table(name = "Employees")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "employee_name", length = 50, nullable = false)
	private Integer name;

	@Column(name = "employee_dni", length = 8, nullable = false)
	private Integer dni;

	@Column(name = "employee_lastName", length = 50, nullable = false)
	private Integer lastName;

	@Column(name = "employee_email", length = 50, nullable = false)
	private Integer email;

	@Column(name = "employee_image", length = 500, nullable = true)
	private Integer image;

	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	private List<Promotion> promotions;

	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	private List<Publication> publications;

}
