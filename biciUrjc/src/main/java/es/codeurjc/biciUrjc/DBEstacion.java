package es.codeurjc.biciUrjc;

import java.util.Arrays;
import es.codeurjc.biciUrjc.model.estacionBicicletas;
import es.codeurjc.biciUrjc.repository.RepoEstacionBicis;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("local")
public class DBEstacion {
	
	
	
	@Autowired
	private RepoEstacionBicis EstacionRepo;
		
	@PostConstruct
	
	public void userDB() {
		EstacionRepo.saveAll(Arrays.asList(
			new estacionBicicletas(0000001,"25.0N,90E", 5),
			new estacionBicicletas(0000055,"34.0N,69E", 10)//mirar por que sale un numero random en gestion de estaciones
			));
	}
	
	
}
