import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;


public class dangkyTest {
    @Test
    public void dangkyTest1() {
        dangky abc = new dangky();
        boolean result = abc.dangky("A","ABC","Abc@gmail.com","abc123@A","abc123@A");
        assertTrue( result);
    }
    @Test
    public void dangkyTest2() {

        dangky abc = new dangky();
        boolean result = abc.dangky("hoa","ABc","ABc@gmail.com","123@Av","123@Av");
        assertTrue( result);
    }
    @Test
    public void dangkyTest3() {
        dangky abc = new dangky();
        boolean result = abc.dangky("Hoa","Abc","ABC@gmail.com","hoang123@A","hoang123@A");
        assertTrue( result);
    }
    @Test
    public void dangkyTest4() {
        dangky abc = new dangky();
        boolean result = abc.dangky("abC","abc","BCA@gmail.com","hoand123@A","abc123@A");
        assertTrue( result);
    }
    @Test
    public void dangkyTest5() {
        dangky abc = new dangky();
        boolean result = abc.dangky("A","hoang","TTT@gmail.com","abc123@A","abc123@A");
        assertTrue( result);
    }


}
