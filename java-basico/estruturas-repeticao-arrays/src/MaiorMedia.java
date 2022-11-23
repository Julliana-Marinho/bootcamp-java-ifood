import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int numero;
        int maior = 0;
        int soma=0;
        double media;

        do {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            count = count + 1;
            soma = soma + numero;

            if (numero > maior){
                maior = numero;
            }


        }while(count < 5);

        media = soma / 5;

        System.out.println("Maior valor inserido é: "+maior);
        System.out.println("A média dos valores é: "+ media);


    }

   
}
