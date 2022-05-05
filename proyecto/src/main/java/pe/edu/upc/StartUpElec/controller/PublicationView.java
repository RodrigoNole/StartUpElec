package pe.edu.upc.StartUpElec.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.StartUpElec.business.crud.CrudService;
import pe.edu.upc.StartUpElec.business.crud.PublicationService;
import pe.edu.upc.StartUpElec.model.entity.Employee;
import pe.edu.upc.StartUpElec.model.entity.Publication;




@Named("publicationView")
@ViewScoped
public class PublicationView implements Serializable,EntityView <Publication, Integer>{

	
	private static final long serialVersionUID = 1L;

	private List<Publication> entities;
	private Publication entitySelected;
	private List<Publication> entitiesSelected;
	private Publication entitySearch;
	
	
	
	
	@Inject
	private PublicationService entityService;
	
	
	@PostConstruct
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new Publication();
		getAllEntities();
	}
	
	@Override
	public CrudService<Publication, Integer> getCrudService() {
		// TODO Auto-generated method stub
		return this.entityService;
	}

	@Override
	public void createNew() {
		// TODO Auto-generated method stub
		this.entitySelected=new Publication();
		this.entitySelected.setEmployee(new Employee());
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

	public List<Publication> getEntities() {
		return entities;
	}

	public void setEntities(List<Publication> entities) {
		this.entities = entities;
	}

	public Publication getEntitySelected() {
		return entitySelected;
	}

	public void setEntitySelected(Publication entitySelected) {
		this.entitySelected = entitySelected;
	}

	public List<Publication> getEntitiesSelected() {
		return entitiesSelected;
	}

	public void setEntitiesSelected(List<Publication> entitiesSelected) {
		this.entitiesSelected = entitiesSelected;
	}

	public Publication getEntitySearch() {
		return entitySearch;
	}

	public void setEntitySearch(Publication entitySearch) {
		this.entitySearch = entitySearch;
	}

	public PublicationService getEntityService() {
		return entityService;
	}

	public void setEntityService(PublicationService entityService) {
		this.entityService = entityService;
	}

	

}
