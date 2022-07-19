import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber()
    {
        int expected = 14;
        int actual = this.getLocalNumber();
        Assert.assertTrue("Метод getLocalNumber не возвращает число " + expected,actual == expected);
    }
}
