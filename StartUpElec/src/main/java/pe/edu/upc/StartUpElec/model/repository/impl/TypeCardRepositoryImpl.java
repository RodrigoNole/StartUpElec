package pe.edu.upc.StartUpElec.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.StartUpElec.model.entity.TypeCard;
import pe.edu.upc.StartUpElec.model.repository.TypeCardRepository;

@Named
@ApplicationScoped
public class TypeCardRepositoryImpl implements TypeCardRepository{
	
	@PersistenceContext(unitName = "StartUpElecPU")
	private EntityManager entityManager;	

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<TypeCard> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeCard> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
