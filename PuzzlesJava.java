import java.util.Random;
import java.util.ArrayList;

class PuzzlesJava {
    
    public ArrayList<Integer> getTenRolls (){
        Random randMachine = new Random();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for( int i=0; i<10; i++){
            numeros.add(randMachine.nextInt(20));
        }
        return numeros;
    }
    public String getRandomLetter(){
        String alfabeto[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random indiceRandom = new Random();
        int indice = indiceRandom.nextInt(25);
        return alfabeto[indice];
    }

    public String generatePassword(){
        String password="";
        for ( int i=0; i<8;i++){
            password = password + getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet(int tamano){
        String matriz[] = new String[tamano];

        for( int i = 0; i < tamano; i++){
            String variable = generatePassword();
            matriz[i] = variable;
        } 
        return matriz;
        
    }
} 