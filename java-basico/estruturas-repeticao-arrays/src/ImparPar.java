
/*Escrever um programa que leia N números e devolva a quantidade de números ímpares
e a quantidade de números pares
*****************************/
import java.util.Scanner;

public class ImparPar {
    public static void main (String args[]){

        int quantidade;
        int numero;
        int impares = 0;
        int pares = 0;


        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a quantidade de números: ");
        quantidade = scan.nextInt();

        int count = 0;

        do{
        System.out.println("Digite um número: ");
        numero = scan.nextInt();
        count++;
            if(numero % 2 == 0){
                pares++;

            } else{
                
                impares++;

            }

        } while (count < quantidade);

        System.out.println("Quantidade de pares: "+pares);
        System.out.println("Quantidade de ímpares: "+impares);




    }
}
