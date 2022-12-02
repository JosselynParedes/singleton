package ec.edu.itsqmet.singleton.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "country")
public class CountryDTO {

	@Id
	private Integer id;
	private String name;
	private String description;
	private String code;
	
	public CountryDTO () {
		
	}

	public CountryDTO(Integer id, String name, String description, String code) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.code = code;
	}
}
