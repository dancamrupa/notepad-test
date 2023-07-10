Feature: El usuario ingresa a la pagina
  online notepad y eliminar un articulo de
  una lista

  Scenario: Usuario elimina un articulo de una lista
    Given el usuario ingresa a la pagina online notepad
    When el usuario elimina un articulo de una lista
    Then el usuario podra visualizar que se elimino un articulo de la lista