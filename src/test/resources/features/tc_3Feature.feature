Feature: Validar integración de nuevos campos en la sabana

  Scenario: Verificar la integración del campo 'Descuento'
    Given El usuario está en la sabana de facturación
    When Verifica la existencia del campo 'Descuento'
    Then El campo 'Descuento' está presente en la sabana

    When Inserta valores en el campo 'Descuento'
    Then Los valores del 'Descuento' se insertan correctamente

    When El usuario revisa el resumen de facturación
    Then El resumen incluye el 'Descuento' aplicado