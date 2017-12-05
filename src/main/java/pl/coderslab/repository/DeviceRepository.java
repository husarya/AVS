package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

	
}
