package hw.palindrome;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.css.Counter;

import static org.junit.jupiter.api.Assertions.*;
@Test
public class TestTest {
    public void PalTest1(){
        Inter x1 = new Check();
        Assert.assertEquals(true, x1.isPalindrome(12345));
    }

    public void PalTest2(){
        Inter x2 = new Check();
        Assert.assertEquals(true, x2.isPalindrome(-121));
    }
    public void PalTest3(){
        Inter x3 = new Check();
        Assert.assertEquals(true, x3.isPalindrome(1234554321));
    }


}