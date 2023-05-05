Feature: Calculadora

  Scenario: Somar dois números
    Given que eu tenho uma calculadora
    When eu somo "2" e "2"
    Then o resultado deve ser "4"

  Scenario: Subtrair dois números
    Given que eu tenho uma calculadora
    When eu subtraio "5" de "10"
    Then o resultado deve ser "5"

  Scenario: Multiplicar dois números
    Given que eu tenho uma calculadora
    When eu multiplico "3" por "4"
    Then o resultado deve ser "12"

  Scenario: Dividir dois números
    Given que eu tenho uma calculadora
    When eu divido "20" por "5"
    Then o resultado deve ser "4"