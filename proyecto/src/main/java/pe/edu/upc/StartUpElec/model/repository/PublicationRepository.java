package pe.edu.upc.StartUpElec.model.repository;


import java.util.List;


import pe.edu.upc.StartUpElec.model.entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Integer>{

	List<Publication> findByName(String name) throws Exception;
}
