
import java.util.*;

public class Teste {

    public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int numero = leitor.nextInt();
        
        int count = 0;
        int tamanhoVetor = elementos.length;
        boolean numeroEncontrado = false;
        do{
          if (elementos[count]==numero){
            System.out.println("Achei "+numero+" na posição "+count);
            numeroEncontrado = true;
            break;
          } else count++;
        } while (count<tamanhoVetor);

        if(numeroEncontrado == false) System.out.println("Não encontrei o número "+numero);

        
  
          
         

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    }
}