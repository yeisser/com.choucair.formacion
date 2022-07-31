package com.choucair.formacion.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.support.ui.Wait;

@DefaultUrl("https://ginni-gcp.pandero.com.pe/")
//@DefaultUrl("https://siuqa.sunedu.gob.pe")
public class ColorlibLoginPage extends PageObject {

	//Campo usuario
	@FindBy(xpath="//*[@id=\"linkRecuperar\"]")
	public WebElementFacade btnReestablezco;
	
	//Campo password
		@FindBy(xpath="//*[@id='login']/form/input[2]")
		public WebElementFacade txtPassword;
		
		//Boton
		@FindBy(xpath="/html/body/app-core/div/app-inicio-sesion/ginni-modal[1]/ngx-smart-modal/div/div/div/div/div[2]/div[2]/div/ginni-cargando/div/div/div[1]/div/form/div/input")
		public WebElementFacade txtReestablece;
	
		//label del home a verificar
		@FindBy(xpath="/html/body/app-core/div/app-inicio-sesion/ginni-modal[1]/ngx-smart-modal/div/div/div/div/div[2]/div[2]/div/ginni-cargando/div/div/div[1]/div/form/label")
		public WebElementFacade lblHomePpal;
		
		
		@FindBy(xpath="//*[@id='btnEnviarModal']")
		public WebElementFacade btnEnviar;
		
		@FindBy(xpath="//*[@id='buscador']")
		public WebElementFacade txtbuscador;
		
		@FindBy(xpath="//*[@id='main-page']/ginni-bandeja-de-reactivaciones/ginni-pagina-full/div/div/div/ginni-pagina-container[2]/div/div[2]/ginni-cargando/div/div/div[1]/table/tbody/tr/td[2]/p")
		public WebElementFacade lblLista;
			
		//label del home a verificar
		@FindBy(xpath="//*[@id=\"main-page\"]/ginni-reactivaciones-detalle/ginni-pagina-full/div/div/ginni-pagina-container/ginni-cargando/div/div/div[1]/ginni-header-asociado/div/div/div[1]/h3")
		public WebElementFacade lblHomePpal1;
		
		public void IngresarDatos(String strUsuario,String strPass)
		{
			waitFor(9);
		//	txtUsername.sendKeys(strUsuario);
			waitFor(2);
			txtPassword.sendKeys(strPass);
			//btnSignIn.click();
			
		}
		
		public void verifico_valor() {
			String labelv="Esta cuenta no es válida";
			String strMensaje= lblHomePpal.getText();
			assertThat(strMensaje,containsString(labelv));
			
		}
		
		
		public void ingreso_a_la_opcion()
		{
			btnReestablezco.click();
			waitFor(2);
			txtReestablece.sendKeys("123");
			waitFor(2);
			btnEnviar.click();
			waitFor(2);
		
		}
		
		
		public void Ingreso_Busqueda()
		{
		   txtbuscador.sendKeys("ATOCHE CAMIZAN FRANK GIANTPIER");
			waitFor(2);
		   lblLista.click();
			waitFor(2);
			String labelv="ATOCHE CAMIZAN FRANK GIANTPIER";
			String strMensaje= lblHomePpal1.getText();
			assertThat(strMensaje,containsString(labelv));
		   
		}
		
		
}
