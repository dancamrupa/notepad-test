Feature: El usuario ingresa a la pagina
         online notepad y mueve un articulo de
         una lista

  Scenario: Usuario mueve un articulo de una lista
    Given el usuario ingresa a la pagina online notepad
    When el usuario mueve un articulo de una lista
    Then el usuario podra visualizar que movio un articulo de la lista