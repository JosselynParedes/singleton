package ec.edu.itsqmet.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ec.edu.itsqmet.singleton.repository.ICountryRepository;

@SpringBootTest
class SingletonApplicationTests {
	
	//@Autowired
	private ICountryRepository countryRepository;
	
	@Test
	void contextLoads() {
		countryRepository.count();
		System.out.println(countryRepository.count());
	    assertEquals(3, countryRepository.count());
	}

}
