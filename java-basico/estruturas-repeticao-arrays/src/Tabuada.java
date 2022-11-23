/*Gera qualquer tabuada de número inteiro entre 1 e 10 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tabuada;


        System.out.println("Qual tabuada você gostaria?");
        tabuada = scan.nextInt();

        int count = 1;
        do{
            System.out.println(tabuada + " x " + count + " = " + (tabuada*count));
            count++;
        } while (count <= 10);

    }
    
}
