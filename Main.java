
import java.io.*;
import static java.lang.System.err;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            MiddleSquare MS= new MiddleSquare(4125);
            LinearCongruentialGenerator LCG =new LinearCongruentialGenerator(5,7,35,10000);
            Evaluator E_MS=new Evaluator(MS);
            Evaluator E_LCG=new Evaluator(LCG);
            System.out.println("LCG:"+E_LCG.evaluate(100));
            System.out.println(" MS:"+E_MS.evaluate(100));
        }catch (Exception e)
        {
            System.out.println("Got an exception! " + err);
        }
    }
}
