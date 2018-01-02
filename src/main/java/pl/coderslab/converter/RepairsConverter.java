package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.entity.Repairs;
import pl.coderslab.repository.RepairsRepository;

public class RepairsConverter implements Converter<String, Repairs> {

	@Autowired
	RepairsRepository repairsRepository;
	
	public Repairs convert(String source) {
		Repairs repairs = repairsRepository.findOne(Long.parseLong(source));
		return repairs;
	}
	
}
