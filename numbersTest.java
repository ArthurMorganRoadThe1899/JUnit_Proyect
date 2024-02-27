package JUnit_Proyect;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class numbersTest {
    @Test
    public void test(){
        int num1 = 6;
        int num2 = 6;
        int total = num1 + num2;
        int totalFalso = num1 + num2 - 1;

        assertEquals(total, num1 + num2);
        /*assertEquals(totalFalso, num1 + num2);/*Dará siempre error porque totalFalso resta -1, y da un resultado que no se espera que sea num1 + num2*/

    }
}