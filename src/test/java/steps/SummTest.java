package steps;

import Application.CalculatorApp;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SummTest {
    private CalculatorApp calculatorApp;
    @Before
    //@org.junit.Before
    public void initialize(){
        calculatorApp = new CalculatorApp();
    }

    @When("Сложение")
    @Story("СЛОЖЕНИЕ")
    @Test
    public void testCalculator(DataTable dataTable){
        List<String> list = dataTable.asList();
        System.out.println("Параметры = " + Integer.parseInt(list.get(0)) + " и "+ Integer.parseInt(list.get(1)));
        System.out.println("Ожидаемый результат = " + Integer.parseInt(list.get(2)));
        Assert.assertTrue(calculatorApp.summ(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)))==Integer.parseInt(list.get(2)));
        System.out.println();
    }
}
