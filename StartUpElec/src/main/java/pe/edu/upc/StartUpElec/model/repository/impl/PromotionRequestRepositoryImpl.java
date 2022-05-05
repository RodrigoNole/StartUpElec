package pe.edu.upc.StartUpElec.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.StartUpElec.model.entity.PromotionRequest;
import pe.edu.upc.StartUpElec.model.repository.PromotionRequestRepository;

@Named
@ApplicationScoped
public class PromotionRequestRepositoryImpl implements PromotionRequestRepository{
	
	@PersistenceContext(unitName = "StartUpElecPU")
	private EntityManager entityManager;	

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<PromotionRequest> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PromotionRequest> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}