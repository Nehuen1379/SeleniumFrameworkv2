@Prueba
Feature: TC01 - Validar Inicio de Sesión

  Background: Validar el inicio de sesión con credenciales válidas

  Scenario: 1. Ingresar correctamente a la homepage
    Given que el usuario ingresa al sitio web
    When ingrese sus credenciales validas
    Then la aplicacion muestra un mensaje de ingreso exitoso
