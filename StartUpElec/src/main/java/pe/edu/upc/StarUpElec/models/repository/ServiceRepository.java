package pe.edu.upc.StarUpElec.models.repository;

import java.util.List;

import pe.edu.upc.StartUpElec.models.entity.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer> {

	List<Service> findByServiceName(String name) throws Exception; 	//lista por nombre del servicio
	
}
