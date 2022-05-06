package pe.edu.upc.StartUpElec.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.StartUpElec.business.crud.CrudService;
import pe.edu.upc.StartUpElec.business.crud.EmployeeService;
import pe.edu.upc.StartUpElec.model.entity.Employee;




@Named("employeeView")
@ViewScoped
public class EmployeeView implements Serializable,EntityView <Employee, Integer>{

	
	private static final long serialVersionUID = 1L;

	private List<Employee> entities;
	private Employee entitySelected;
	private List<Employee> entitiesSelected;
	private Employee entitySearch;
	
	
	
	@Inject
	private EmployeeService entityService;
	
	@PostConstruct
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new Employee();
		getAllEntities();
	}
	
	@Override
	public CrudService<Employee, Integer> getCrudService() {
		// TODO Auto-generated method stub
		return this.entityService;
	}
	@Override
	public void createNew() {
		this.entitySelected=new Employee();
		
		
	}
	@Override
	public Integer getIdFromEntitySelected() {
		// TODO Auto-generated method stub
		return this.entitySelected.getId();
	}
	@Override
	public void searchEntity() {
		try {	// Modificar de acuerdo al atributo a buscar
			this.entities = this.entityService.search(this.entitySearch.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public List<Employee> getEntities() {
		return entities;
	}

	public void setEntities(List<Employee> entities) {
		this.entities = entities;
	}

	public Employee getEntitySelected() {
		return entitySelected;
	}

	public void setEntitySelected(Employee entitySelected) {
		this.entitySelected = entitySelected;
	}

	public List<Employee> getEntitiesSelected() {
		return entitiesSelected;
	}

	public void setEntitiesSelected(List<Employee> entitiesSelected) {
		this.entitiesSelected = entitiesSelected;
	}

	public Employee getEntitySearch() {
		return entitySearch;
	}

	public void setEntitySearch(Employee entitySearch) {
		this.entitySearch = entitySearch;
	}

	public EmployeeService getEntityService() {
		return entityService;
	}

	public void setEntityService(EmployeeService entityService) {
		this.entityService = entityService;
	}
	
	

}
