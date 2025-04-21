Feature: Verificar creación de columna nueva

  Scenario: Verificar la creación de una columna nueva para el campo 'Total'
    Given el usuario abre la sabana contable y selecciona la hoja de mejoras
    When el usuario inserta una columna nueva para el campo 'Total'
    Then la columna es insertada con el nombre 'Total'
    When el usuario aplica la fórmula adecuada
    Then la fórmula es aplicada correctamente