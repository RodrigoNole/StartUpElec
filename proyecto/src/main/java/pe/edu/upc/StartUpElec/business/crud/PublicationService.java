package pe.edu.upc.StartUpElec.business.crud;



import java.util.List;

import pe.edu.upc.StartUpElec.model.entity.Publication;

public interface PublicationService extends CrudService<Publication, Integer>{

	public List<Publication> findByName(String name) throws Exception ;

}
