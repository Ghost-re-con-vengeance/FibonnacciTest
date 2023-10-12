package test.java;
import org.junit.*;

public class FibTest {
    Fib fib;
    int[] correctFibonacciArray = {0,1,1,2,3,5,8,13,21,34};

    @Before
    public void SetUpInstance() {
        fib = new Fib(10);
    }   

    @Test
    public void checkIfTheFirstTenNumbersOfTheFibonacciSequenceAreCorrect(){
        Assert.assertArrayEquals(correctFibonacciArray,fib.GetFibArrayValues());
    }
}
