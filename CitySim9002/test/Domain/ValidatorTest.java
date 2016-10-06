/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import domain.Validator;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author AsphaltPanthers
 */
public class ValidatorTest {

    /*
    * The validator should return true if the input is a number.
    * Test if the validator return true if the input is a number.
    * */
    @Test
    public void ifOneArgumentIsProvidedReturnTrue() {
        Assert.assertTrue(new Validator().validateNumberOfArguments(new String[] { "1" }));
    }

    /*
    * The validator should return false if the input length is not correct.
    * Test if the validator return false if the input length is not correct.
    * */
    @Test
    public void ifOneArgumentIsNotProvidedReturnFalse() {
        Assert.assertFalse(new Validator().validateNumberOfArguments(new String[] { "1", "2" }));
    }

    /*
    * The validator should return true if the input is an integer.
    * Test if the validator return true if the input is an integer.
    * */
    @Test
    public void ifArgumentIsAnIntegerReturnTrue() {
        Assert.assertTrue(new Validator().validateArgumentType(new String[] { "1" }));
    }

    /*
    * The validator should return false if the input is not an integer.
    * Test if the validator return false if the input is not an integer.
    * */
    @Test
    public void ifArgumentIsNotAnIntegerReturnFalse() {
        Assert.assertFalse(new Validator().validateArgumentType(new String[] { "test" }));
    }

    /*
   * The validator should return true if the input is correct in length and type.
   * Test if the validator return true if the input is correct in length and type.
   * */
    @Test
    public void ifArgumentLengthAndTypeIsCorrectReturnTrue(){

        Validator mockValidator = mock(Validator.class);
        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();
        Assert.assertTrue(mockValidator.validateArguments(new String[0]));
    }
}
