package com.choucair.formacion.definition;

import com.choucair.formacion.steps.PopupValidationStep;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	@Steps
	PopupValidationStep popupvalidationStep;
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String clave) throws Throwable {
	    popupvalidationStep.login_colorlib(Usuario, clave);
	}

	@Given("^Ingreso a la opcion$")
	public void ingreso_a_la_opcion() throws Throwable {
	   popupvalidationStep.ingreso_a_la_opcion();
	}
	
	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() throws Throwable {
	   
	}

	@When("^Diligencio Formulario Popup Validation$")
	public void diligencio_Formulario_Popup_Validation() throws Throwable {

	}

	@Then("^Verifico valor$")
	public void Verifico_valor() throws Throwable {
		  popupvalidationStep.verifico_valor();
	}
	
	@Then("^Ingreso la busqueda$")
	public void Ingreso_la_busqueda() throws Throwable {
		popupvalidationStep.ingreso_la_busqueda();
	}

	

}
