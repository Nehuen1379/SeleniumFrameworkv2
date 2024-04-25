@Prueba3
Feature: TC02 - Cargar Usuario

  Background: Ingresar al modulo de Web Tables y dar de alta un usuario

  Scenario: 1. Cargar un usuario en Web Tables
    Given que el usuario ingresa a Web Tables
    When completa el formulario
    Then el usuario verá que el usuario "Test" está presente en la grilla de usuarios

