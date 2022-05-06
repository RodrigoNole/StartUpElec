package pe.edu.upc.StarUpElec.models.repository;

import java.util.Optional;

import pe.edu.upc.StartUpElec.models.entity.Typecard;

public interface TypecardRepository extends JpaRepository<Typecard, Integer> {
	
	Optional<Typecard> findById(String id) throws Exception;

}