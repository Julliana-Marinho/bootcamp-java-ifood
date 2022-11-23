/*Lê um número n de letras e responde quantas são consoantes */

import java.util.Scanner;
import java.util.Arrays;

public class Consoantes{

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o número de letras: ");
        int quantidadeLetras = scan.nextInt();

        int count = 0;
        int numeroVogais = 0;
        int numeroConsoantes = 0;
        String[] consoantes = new String[quantidadeLetras];

        do{
            System.out.println("Insira uma letra:");
            String letra = scan.next();
            count++;
            
            if (letra.equalsIgnoreCase("a") || 
                letra.equalsIgnoreCase("e") || 
                letra.equalsIgnoreCase("i") || 
                letra.equalsIgnoreCase("o") || 
                letra.equalsIgnoreCase("u")){
                    numeroVogais++;
            } else{
                consoantes [numeroConsoantes] = letra;
                numeroConsoantes++;
            }

        }while(count < quantidadeLetras);

        System.out.println("O número de vogais é: "+numeroVogais);
        System.out.println("O número de consoantes é: "+numeroConsoantes);
        System.out.println("As consoantes são: ");
        for (String consoante : consoantes){
            if (consoante != null) 
            System.out.println(consoante + " ");
        }


    }


}