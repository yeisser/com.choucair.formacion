package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationStep {
	
	ColorlibLoginPage colorlibLoginPage;
	
	@Step
	public void login_colorlib(String strUsuario, String strPass)
	{
//      a.  Abrir navegador con la url de prueba
		colorlibLoginPage.open();
/*      b.  Ingresar usuario demo
 *      c.  Ingresar password demo
 *      d.  Click en botón Sign in*/
        colorlibLoginPage.IngresarDatos(strUsuario,strPass);
 //     e.  Verificar la Autentiación (label en home)
      //  colorlibLoginPage.VerificaHome();	
		
	}
	
	@Step
	public void ingreso_a_la_opcion()
	{
		colorlibLoginPage.open();
		colorlibLoginPage.ingreso_a_la_opcion();

		
	}
	
	@Step
	public void verifico_valor()
	{

		colorlibLoginPage.verifico_valor();
		
	}
	
	@Step
	public void ingreso_la_busqueda()
	{
		colorlibLoginPage.Ingreso_Busqueda();
		
	}

}
