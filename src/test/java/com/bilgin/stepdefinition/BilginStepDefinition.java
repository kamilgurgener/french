package com.bilgin.stepdefinition;

import com.bilgin.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BilginStepDefinition {
	
	HomePage homepage = new HomePage();
	
	@Given("kullanici google ana sayfaya gider")
	public void kullanici_google_ana_sayfaya_gider() {
	    
	    
	}

	@When("kullanici arama kutusuna bilgin yazar")
	public void kullanici_arama_kutusuna_bilgin_yazar() {
		homepage.aramaYap();
	    
	}

	@When("arama tusuna basar")
	public void arama_tusuna_basar() {
	    
	    
	}

	@Then("bilgin ifadesinin gectigi tum sonuclar liste halinde ekranda gorunur")
	public void bilgin_ifadesinin_gectigi_tum_sonuclar_liste_halinde_ekranda_gorunur() {
	    
	    
	}
	
	

}
