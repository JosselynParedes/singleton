package ec.edu.itsqmet.singleton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.singleton.dto.CountryDTO;

public interface ICountryRepository extends JpaRepository<CountryDTO, Integer>{

}
