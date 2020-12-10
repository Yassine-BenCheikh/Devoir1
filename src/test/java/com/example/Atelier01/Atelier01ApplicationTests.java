package com.example.Atelier01;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.Atelier01.entities.Voiture;
import com.example.Atelier01.repos.VoitureRepository;



@SpringBootTest
class Atelier01ApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository;
	@Test
	public void testCreateVoiture() {
	Voiture voit = new Voiture("BMW X5",465000.000,new Date());
	voitureRepository.save(voit);
	
	}
	 @Test
	 public void testFindVoiture()
	 {
	 Voiture v = voitureRepository.findById(1L).get();
	 System.out.println(v);
	 }
	 @Test
	 public void testUpdateVoiture()
	 {
	 Voiture v = voitureRepository.findById(1L).get();
	 v.setPrixVoiture(1000.0);
	 voitureRepository.save(v);
	 }
	 @Test
	 public void testDeleteVoiture()
	 {
		 voitureRepository.deleteById(1L);;
	 }
	 @Test
	 public void testListerTousVoitures()
	 {
	 List<Voiture> voits = voitureRepository.findAll();
	 for (Voiture v : voits)
	 {
	 System.out.println(v);
	 }
	 }

}
