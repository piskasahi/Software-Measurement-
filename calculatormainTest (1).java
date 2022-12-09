package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

class calculatormainTest {
	String url   = "jdbc:mysql://localhost/",
                   uname = "root",
                   upass = "admin";
	calculatormain calobject = new calculatormain();
	@Test
    public void dbtest() throws Exception{
        assertTrue(calobject.isDbConnected(DriverManager.getConnection(url, uname, upass))==true);
    }
	String[] values = {"abc","0123456789","abc@gmail.com"};
    @Test
    public void inserttest() throws Exception{
        assertTrue(calobject.insert(values)==true);
    }
	@Test
    public void testadd() throws Exception{
		equals(calobject.add(1,2)==3);
		equals(calobject.add(4,2)==6);
equals(calobject.add(12,12)==24);
equals(calobject.add(8,9)==17);
equals(calobject.add(1,9)==10);
equals(calobject.add(17,2)==19);
equals(calobject.add(-1,-5)==-6);
equals(calobject.add(-1,2)==1)

}

	@Test
    public void testsub() throws Exception{
		equals(calobject.sub(2,1)==1);
equals(calobject.sub(2,1)==1);
equals(calobject.sub(12,11)==1);
equals(calobject.sub(252,242)==10);
equals(calobject.sub(15,10)==-5);
equals(calobject.sub(-2,1)==-3);
equals(calobject.sub(2,-1)==3);
equals(calobject.sub(52,11)==41);
equals(calobject.sub(32,12)==30);
}
	@Test
    public void testmul() throws Exception{
		equals(calobject.mult(5,2)==10);
equals(calobject.mult(5,-2)==-10);
equals(calobject.mult(5,-2)==-10);
equals(calobject.mult(-5,-2)==10);
equals(calobject.mult(15,20)==300);
equals(calobject.mult(51,2)==102);
equals(calobject.mult(5,21)==105);
}
	@Test
    public void testdiv() throws Exception{
		equals(calobject.divide(15,3)==5);
equals(calobject.divide(15,5)==3);
equals(calobject.divide(-15,3)==-5);
equals(calobject.divide(15,-3)==-5);
equals(calobject.divide(-15,-3)==5);
equals(calobject.divide(12,3)==36);
equals(calobject.divide(15,3)==45);
equals(calobject.divide(15,5)==75);
}
}
