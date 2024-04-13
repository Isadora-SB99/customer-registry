package br.faccat.padarqsis.customerregistry.repository;

import br.faccat.padarqsis.customerregistry.model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel, String> {
}
