@Prueba2
Feature: TC02 - RadioButton

  Background: Ingresar al modulo de radioButton, hacer click en la opcion "Yes", validar el texto "Yes" y validar que el radioButton "No" se encuentre deshabilitado

  Scenario: 1. Click en Radio Button y Validacion
    Given que el usuario ingresa a Radio Button
    When hace click en el radioButton Yes
    Then la pagina web devuelve un mensaje al usuario diciendo Yes
    And valido que el radioButton Impressive se encuentre habilitado

