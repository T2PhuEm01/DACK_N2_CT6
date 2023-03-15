import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;


public class loginTest {
    @Test
    public void loginTest1() {
        login abc = new login();
        boolean result = abc.login("bc@gmail.com", "abc123@");
        assertTrue( result);
    }
    @Test
    public void loginTest2() {
        login abc = new login();
        boolean result = abc.login("ABc@gmail.com", "123@Av");
        assertTrue( result);
    }
    @Test
    public void loginTest3() {
        login abc = new login();
        boolean result = abc.login("ABC@gmail.com", "hoang123@A");
        assertTrue( result);
    }
    @Test
    public void loginTest4() {
        login abc = new login();
        boolean result = abc.login("BCA@gmail.com", "hoand123@A");
        assertTrue( result);
    }
    @Test
    public void loginTest5() {
        login abc = new login();
        boolean result = abc.login("TTT@gmail.com", "abc123@A");
        assertTrue( result);
    }
}
