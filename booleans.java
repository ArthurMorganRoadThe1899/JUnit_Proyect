package JUnit_Proyect;

public class booleans {
    public static boolean tf(int num){

        int bin = (int) (Math.random() * 2 + 0);

        if(bin == 1){
            System.out.print("verdadero ijo mio");
            return true;
        }else{
            System.out.print("falso como tu");
            return false;
        }

    }
}
