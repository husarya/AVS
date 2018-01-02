package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.coderslab.entity.Repairs;

public interface RepairsRepository extends JpaRepository<Repairs, Long> {

	@Query("select u from Repairs u where u.status.id = 2")
	List<Repairs> findByRepaired();
	
}
