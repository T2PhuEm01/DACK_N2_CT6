import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Product_testTest {
    @Test
    public void Test1(){
        Product_test A = new Product_test();
        A.product("túi đeo chéo","12000","1");
        A.product("túi xách","80000","2");
        A.showInfo();
        System.out.println(A.thanhtien());
        assertEquals(172000,A.thanhtien());
    }
    @Test
    public void Test2(){
        Product_test A = new Product_test();
        A.product("túi đeo chéo","230000","1");
        A.product("túi xách","100000","2");
        A.showInfo();
        System.out.println("tổng tiền : "+A.thanhtien());
        assertEquals(430000,A.thanhtien());
    }
    @Test
    public void Test3(){
        Product_test A = new Product_test();
        A.product("Cáp Nguồn loại chuyên để chạy Coin Cũ","49000","1");
        A.product("Đế Tản nhiệt Laptop Cooler Pad N99","129000","7");
        A.showInfo();
        System.out.println("tổng tiền : "+A.thanhtien());
        assertEquals(430000,A.thanhtien());
    }
    @Test
    public void Test4(){
        Product_test A = new Product_test();
        A.product("Cáp Nguồn loại chuyên để chạy Coin Cũ","49000","1");
        A.product("Đế Tản nhiệt Laptop Cooler Pad N99","129000","7");
        A.showInfo();
        System.out.println("tổng tiền : "+A.thanhtien());
        assertEquals(952000,A.thanhtien());
    }
    @Test
    public void Test5(){
        Product_test A = new Product_test();
        A.product("Cáp Nguồn loại chuyên để chạy Coin Cũ","49000","1");
        A.product("Đế Tản nhiệt Laptop Cooler Pad N99","129000","2");
        A.product("Đế Tản nhiệt Laptop Cooler Pad N99","129000","3");
        A.showInfo();
        System.out.println("tổng tiền : "+A.thanhtien());
        assertEquals(694000,A.thanhtien());
    }
    @Test
    public void Test6(){
        Product_test A = new Product_test();
        A.product("Cáp Nguồn loại chuyên để chạy Coin Cũ","49000","1");
        A.product("Đế Tản nhiệt Laptop Cooler Pad N99","129000","2");
        A.product("Đế Tản nhiệt Laptop Cooler Pad N99","129000","3");
        A.showInfo();
       String result = A.search("Đế");
        assertEquals("Đế Tản nhiệt Laptop Cooler Pad N99",result);
    }
}
