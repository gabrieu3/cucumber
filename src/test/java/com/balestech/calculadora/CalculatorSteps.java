package com.balestech.calculadora;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private Calculator calculator;
    private double resultado;

    @Given("^que eu tenho uma calculadora$")
    public void que_eu_tenho_uma_calculadora() {
        calculator = new Calculator();
    }

    @When("^eu somo \"(\\d+)\" e \"(\\d+)\"$")
    public void eu_somo_e(String arg1, String arg2) {
        resultado = calculator.sum(Double.parseDouble(arg1), Double.parseDouble(arg2));
    }

    @When("^eu subtraio \"(\\d+)\" de \"(\\d+)\"$")
    public void eu_subtraio_de(String arg1, String arg2) {
        resultado = calculator.subtract(Double.parseDouble(arg2), Double.parseDouble(arg1));
    }

    @When("^eu multiplico \"(\\d+)\" por \"(\\d+)\"$")
    public void eu_multiplico_por(String arg1, String arg2) {
        resultado = calculator.multiply(Double.parseDouble(arg1), Double.parseDouble(arg2));
    }

    @When("^eu divido \"(\\d+)\" por \"(\\d+)\"$")
    public void eu_divido_por(String arg1, String arg2) {
        resultado = calculator.divide(Double.parseDouble(arg1), Double.parseDouble(arg2));
    }

    @Then("^o resultado deve ser \"(\\d+)\"$")
    public void o_resultado_deve_ser(String arg1) {
        assertEquals(Double.parseDouble(arg1), resultado, 0.00001);
    }
}

