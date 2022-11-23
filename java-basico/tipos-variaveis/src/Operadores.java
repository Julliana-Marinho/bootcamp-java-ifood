public class Operadores {
    public static void main(String [] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA"; //concatenação
        System.out.println(nomeCompleto);
        int numero = 5;

        numero = - numero; //muda sinal
        System.out.println(numero);

        numero = - numero; //muda sinal de novo

        System.out.println(numero);

        System.out.println(numero ++); //++ incrementa a variável, mas só no print seguinte

        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel; //! faz a negação da variável, aqui neste exemplo troca de true pra false

        System.out.println(variavel);

        //Operadores relacionais

        //== verifica se há igualdade
        //!== verifica se é diferente

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente numeroDois? " + simNao);

        String nomeUm = "Julliana";
        String nomeDois = new String("Julliana");

        System.out.println(nomeUm.equals(nomeDois)); //para strings, utilizamos "equals"
        
        //Operadores lógicos

        // && operador lógico "E"
        // || operador lógico "ou"

        boolean condicao1=true;

        boolean condicao2=true;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");

        }
    }
}

