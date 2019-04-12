Feature: Funcionalidad de mostrar Catalog

  Scenario: Registro de un item
    Given 'Catalog' page is loaded
    And click 'Registrar Item' button in 'footer-right' page
    And insert "abc123" project name field in 'Form Dialogo' page
