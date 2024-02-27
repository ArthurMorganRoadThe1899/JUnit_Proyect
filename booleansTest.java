package JUnit_Proyect;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class booleansTest {
    @Test
    public void test() {
        boolean v = true;
        boolean trueFalse;

        int bin = (int) (Math.random() * 2 + 0);

        if(bin == 1){
            System.out.print("verdadero ijo mio");
            trueFalse = true;
        }else{
            System.out.print("falso como tu");
            trueFalse = false;
        }
        assertEquals(v,trueFalse);
    }
}