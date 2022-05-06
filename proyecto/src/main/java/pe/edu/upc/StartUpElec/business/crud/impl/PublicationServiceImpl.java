package pe.edu.upc.StartUpElec.business.crud.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.StartUpElec.business.crud.PublicationService;

import pe.edu.upc.StartUpElec.model.entity.Publication;
import pe.edu.upc.StartUpElec.model.repository.JpaRepository;
import pe.edu.upc.StartUpElec.model.repository.PublicationRepository;
@Named
@ApplicationScoped
public class PublicationServiceImpl implements PublicationService{

	@Inject
	private PublicationRepository publicationRepository;
	
	@Override
	public JpaRepository<Publication, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return this.publicationRepository;
	}
 
	@Override
	public List<Publication> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return this.publicationRepository.findByName(name);
	}
}
