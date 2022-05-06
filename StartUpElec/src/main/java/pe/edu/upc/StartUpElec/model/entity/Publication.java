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
@Table(name = "Publications")
public class Publication implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "publication_id", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "publication_name", length = 100)
	private String name;

	@Column(name = "publication_date")
	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name = "publication_description", length = 500)
	private String description;

	@Column(name = "publication_image", length = 500, nullable = true)
	private String image;

	@Column(name = "publication_url", length = 500, nullable = true)
	private String url;

	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;

}
