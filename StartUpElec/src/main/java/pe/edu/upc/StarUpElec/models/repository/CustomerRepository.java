package pe.edu.upc.StarUpElec.models.repository;

import java.util.List;
import java.util.Optional;
import pe.edu.upc.StartUpElec.models.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	List<Customer> findByName(String name) throws Exception; 			//lista por nombre de cliente
	Optional<Customer> findByIdcustomer(String id) throws Exception; 	//buscar por id de cliente
	
}
