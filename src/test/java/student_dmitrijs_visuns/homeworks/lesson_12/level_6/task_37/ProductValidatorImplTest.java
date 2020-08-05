package student_dmitrijs_visuns.homeworks.lesson_12.level_6.task_37;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProductValidatorImplTest {

    @Test
    public void TitleRule_1 () {
        ProductValidatorImpl test = new ProductValidatorImpl();
        Product testProduct = new Product("", 30, "apple");
        assertTrue(test.validate(testProduct).size() == 1);
    }

    @Test
    public void TitleRule_2 () {
        ProductValidatorImpl test = new ProductValidatorImpl();
        Product testProduct = new Product("Ab", 30, "apple");
        assertTrue(test.validate(testProduct).size() == 1);
    }

    @Test
    public void TitleRule_3 () {
        ProductValidatorImpl test = new ProductValidatorImpl();
        Product testProduct = new Product("1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890" +
                "1234567890"
                , 30, "apple");
        assertTrue(test.validate(testProduct).size() == 1);
    }

    @Test
    public void TitleRule_4 () {
        ProductValidatorImpl test = new ProductValidatorImpl();
        Product testProduct = new Product("Пэрсик", 30, "apple");
        assertTrue(test.validate(testProduct).size() == 1);
    }

    @Test
    public void PriceRule_3 () {
        ProductValidatorImpl test = new ProductValidatorImpl();
        Product testProduct = new Product("Pineapple", 30, "apple");
        assertTrue(test.validate(testProduct).size() == 1);
    }

    @Test
    public void DescriptionRule_1 () {
        ProductValidatorImpl test = new ProductValidatorImpl();
        Product testProduct = new Product("Pineapple", 30, "эта ананасик");
        assertTrue(test.validate(testProduct).size() == 1);
    }

}