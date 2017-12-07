package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.Repairs;

public interface RepairsRepository extends JpaRepository<Repairs, Long> {

}
