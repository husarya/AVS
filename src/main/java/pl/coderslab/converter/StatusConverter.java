package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.entity.Status;
import pl.coderslab.repository.StatusRepository;

public class StatusConverter implements Converter<String, Status> {

	@Autowired
	StatusRepository statusRepository;
	
	public Status convert(String source) {
		Status status = statusRepository.findOne(Long.parseLong(source));
		return status;
	}
	
	
}
