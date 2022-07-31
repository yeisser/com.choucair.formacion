#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitu y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un globo informativo.

  @CasoExitoso1
  Scenario: Prueba de mensaje
    Given Ingreso a la opcion
    Then  Verifico Valor
    
   @CasoExitoso2
  Scenario: Prueba de busqueda
    Given Ingreso a la opcion 
    Then  Ingreso la busqueda
 
 
