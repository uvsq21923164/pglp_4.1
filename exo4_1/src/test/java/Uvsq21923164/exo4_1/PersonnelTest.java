package Uvsq21923164.exo4_1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Uvsq21923164.exo4_1.Personnel.PersonnelBuilder;
public class PersonnelTest {

	private Personnel pers;
	
	@Before()
	public void setUp() {
		pers = new PersonnelBuilder("youyou", "kebir", "electricien")
				.dateNaissance(LocalDate.parse("1998-06-01", DateTimeFormatter.ISO_DATE))
				.addNumeroTelephone(new NumeroTelephone("Perso", "0751393363"))
				.addNumeroTelephone(new NumeroTelephone("Fax", "0136254845"))
				.build();	
	}
	
	
	@Test()
	public void testGetNom() {
		assertEquals(pers.getNom(), "youyou");
	}
	
	@Test()
	public void testGetPrenom() {
		assertEquals(pers.getPrenom(), "kebir");
	}
	
	@Test()
	public void testGetFonction() {
		assertEquals(pers.getFonction(), "electricien");
	}
	
	@Test()
	public void testGetDateNaissance() {
		assertEquals(pers.getDateNaissance(), 
				LocalDate.parse("1998-06-01", DateTimeFormatter.ISO_DATE));
	}
	
	@Test()
	public void testGetNumerosTelephone() {
		List<NumeroTelephone> numList = new ArrayList<NumeroTelephone>();
		numList.add(new NumeroTelephone("Perso", "0751393363"));
		numList.add(new NumeroTelephone("Fax", "0136254845"));
		assertEquals(pers.getNumerosTelephone(), numList);	
	}
	
	@Test()
	public void testTypeStringPersonnel() {
		assertEquals(pers.typeString(), "Personnel");
	}
	
	@Test()
	public void testTypeStringGroupe() {
		assertEquals((new PersonnelGroupe()).typeString(), "Groupe");
	}
	
	
	
}
