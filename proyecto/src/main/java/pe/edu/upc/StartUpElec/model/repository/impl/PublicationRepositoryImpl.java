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
		return this.findById(id, Publication.class);
	}

	@Override
	public List<Publication> findAll() throws Exception {
		String jpql = "SELECT publication FROM Publication publication";
		return this.findByQuery(Publication.class, jpql);
	}
	public List<Publication> findByName(String name) throws Exception {
		String jpql = "SELECT publication FROM Publication publication WHERE publication.name = '" + name  + "'";
		return this.findByQuery(Publication.class, jpql);
	}
	@Override
	public List<Publication> findByData(String data) throws Exception {
		String jpql = "SELECT publication FROM Publication publication WHERE publication.name = '" + data  + "'";
		return this.findByQuery(Publication.class, jpql);
	}
}
