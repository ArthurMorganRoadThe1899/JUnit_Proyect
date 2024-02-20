import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import JUnit_Proyect.booleans;
class booleansTest {

     @Test
     public void mamada() {
         boolean v = true;
         boolean tf;
         int num= 6;

         tf = booleans.tf(num);

         assertEquals(v,tf);
     }
}