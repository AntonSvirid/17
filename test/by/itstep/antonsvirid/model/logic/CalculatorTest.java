package by.itstep.antonsvirid.model.logic;

import org.junit.Assert;
import org.junit.Test;
// import static org.junit.Assert;

public class CalculatorTest {

    @Test
    public void testSum() {
        // arrange (подготовка) (заготовиить вводные паранметры)
        int a = 10;
        int b = 3;
        int expected = 13;

        // act (запустить функционал) (вызвать соответсвующий класс, передать в него данные)
        int actual = Calculator.sum(a, b);

        // assert проверить работает ли функционал
        if (expected != actual) {   // если ожидаемый рез не равен актуальному
            Assert.fail();      // вызов ошибки
        }

    }

    @Test
    public void testSub() {

        int a = 10;
        int b = 3;
        int expected = 12;

        int actual = Calculator.sub(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMul() {

        int a = 10;
        int b = 3;
        int expected = 30;

        int actual = Calculator.mul(a, b);

        if (expected != actual) {
            Assert.fail();
        }

    }

    @Test
    public void testDiv() {

        int a = 10;
        int b = 3;
        int expected = 3;

        int actual = Calculator.div(a, b);

        if (expected != actual) {
            Assert.fail();
        }

    }

}
