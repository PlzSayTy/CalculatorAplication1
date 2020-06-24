package steps;

import Application.CalculatorApp;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class MenosTest {
    private Integer a;
    private Integer b;
    private Integer expectedResult;
    private CalculatorApp calculatorApp;
    @Before
    //@org.junit.Before
    public void initialize(){
        calculatorApp = new CalculatorApp();
    }


    @When("Вычитание")
    @Story(value = "ВЫЧИТАНИЕ")
    @Test
    public void testCalculator(DataTable dataTable){
        List<String> list = dataTable.asList();
        System.out.println("Параметры = " + Integer.parseInt(list.get(0)) + " и "+ Integer.parseInt(list.get(1)));
        System.out.println("Ожидаемый результат = " + Integer.parseInt(list.get(2)));
        Assert.assertTrue(calculatorApp.menos(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)))==Integer.parseInt(list.get(2)));
        System.out.println();

    }
}
