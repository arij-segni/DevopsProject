package tn.esprit.spring;

import java.util.logging.LogManager;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimesheetServiceImplTest {
	
	//private static final Logger l = LogManager.getLogger(LoggingAspect.class);
	
	
	@Autowired
	IEntrepriseService entrepSrevice;

	//load context
	@Test
	public void contextLoads() {
	}
	
	/*********   TEST methods EntrepriseServices   *******/
	
	@Test(timeout = 5000)
	public void ajoutEntrTest(){
	
		//test pour ajout entreprise
			Entreprise e=new Entreprise("telnet","Sfax");
			entrepSrevice.ajouterEntreprise(e);
			
			assertNotNull(entrepSrevice.ajouterEntreprise(e));
	}
	
	
	@Test(timeout = 5000)
	public void ajoutDepTest(){
	
		//test pour ajout Dep
			Departement d=new Departement("Informatique");
			entrepSrevice.ajouterDepartement(d);
			
			assertNotNull(entrepSrevice.ajouterDepartement(d));
	}
	
	

}
