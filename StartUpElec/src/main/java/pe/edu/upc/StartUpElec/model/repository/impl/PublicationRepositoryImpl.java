package pe.edu.upc.StartUpElec.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.StartUpElec.model.entity.Publication;
import pe.edu.upc.StartUpElec.model.repository.PublicationRepository;

@Named
@ApplicationScoped
public class PublicationRepositoryImpl implements PublicationRepository{
	
	@PersistenceContext(unitName = "StartUpElecPU")
	private EntityManager entityManager;	

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<Publication> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publication> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
