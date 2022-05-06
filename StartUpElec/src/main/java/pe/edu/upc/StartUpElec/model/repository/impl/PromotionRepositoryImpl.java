package pe.edu.upc.StartUpElec.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.StartUpElec.model.entity.Promotion;
import pe.edu.upc.StartUpElec.model.repository.PromotionRepository;

public class PromotionRepositoryImpl implements PromotionRepository{

	@PersistenceContext(unitName = "StartUpElecPU")
	private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<Promotion> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promotion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
