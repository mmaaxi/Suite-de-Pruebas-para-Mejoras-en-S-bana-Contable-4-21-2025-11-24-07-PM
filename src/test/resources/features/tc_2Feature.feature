Feature: Verificar modificación de formulas existentes

  Scenario: Modificar y guardar formulas en la sabana
    Given El usuario ha abierto una hoja de cálculo existente
    When El usuario selecciona una columna existente en la sabana
    Then La columna se selecciona
    When El usuario modifica la formula a la requerida por la mejora
    Then La formula se actualiza y se refleja en los totales
    When El usuario guarda la hoja
    Then La hoja se guarda sin errores