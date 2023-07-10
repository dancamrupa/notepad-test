Feature: El usuario ingresa a la pagina
  online notepad para crear un texto
  enriquecido.

  Scenario: Usuario crea una nota de texto enriquecido
    Given el usuario ingresa a la pagina online notepad
    When el usuario crea un texto enriquecido en negrita
    Then el usuario visualiza la nota creada