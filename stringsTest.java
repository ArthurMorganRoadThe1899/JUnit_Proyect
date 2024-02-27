package JUnit_Proyect;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class stringsTest {

    @Test
    public void test(){
        String name1 = "Manolo";
        String name2 = "Alberto";

        assertEquals(name1, name1);
        /*assertEquals(name1, name2); /*Si ejecutamos esta línea dará error, aquí lo que estamos haciendo es comparar si name1 y name2 son igual, si no lo son, da false*/

    }

}