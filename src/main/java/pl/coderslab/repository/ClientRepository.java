package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.coderslab.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	@Query("select u from Client u where u.status = 2")
	List<Client> findByStatus();
	
	@Query("select a from Client a where a.status= 1 or a.status = 3")
	List<Client> findByInRepair();
}
