
import java.util.ArrayList;

public class TestPuzzles {
    public static void main( String args[] ){
        
        PuzzlesJava generator  = new PuzzlesJava(); 
        ArrayList<Integer> variable  = generator.getTenRolls();
        System.out.println( variable );

        String letra = generator.getRandomLetter();
        System.out.println(letra);

        String password = generator.generatePassword();
        System.out.println(password);
        System.out.println("------------------------------------");
        String contrasena[] = generator.getNewPasswordSet(10);
        for(int  i = 0; i<contrasena.length; i++){
            System.out.println(contrasena[i]);
        }
    }
}