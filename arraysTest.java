package JUnit_Proyect;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class arraysTest {

    @Test
    public void test(){
        ArrayList<Integer> arrNums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<String> arrStrings = new ArrayList<>(Arrays.asList("La'zel", "Astarion", "Shadow Heart", "Halsin", "Gale", "La'zel"));

        assertEquals(arrNums.get(0), arrNums.get(0));
        /*assertEquals(arrStrings.get(0), arrStrings.get(3));/*Aquí dará error porque se espera que el resultado sea La'zel*/
    }

}