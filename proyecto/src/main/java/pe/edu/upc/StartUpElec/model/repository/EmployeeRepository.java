package pe.edu.upc.StartUpElec.model.repository;

import java.util.List;

import pe.edu.upc.StartUpElec.model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByName(String name) throws Exception;

}
