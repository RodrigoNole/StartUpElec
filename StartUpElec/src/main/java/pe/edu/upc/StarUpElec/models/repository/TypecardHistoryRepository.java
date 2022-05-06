package pe.edu.upc.StarUpElec.models.repository;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.StartUpElec.models.entity.Customer;
import pe.edu.upc.StartUpElec.models.entity.TypecardHistory;

public interface TypecardHistoryRepository extends JpaRepository<TypecardHistory, Integer> {
	
	List<TypecardHistory> findByTypecardName(String name) throws Exception; 	 //lista de tarjeta
	Optional<Customer> findByIdcustomer(String id) throws Exception; 	//buscar por id de cliente
	void deleteById(String id) throws Exception;

}