public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
//estrutura padrão:
//<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
Byte idade;
short anoFabricacao = 2021;
double salarioMinimo = 1200.25;
float pi = 3.14F; //tem que terminar com F
int cep = 21070333; //se começar com zero, terá que montar uma string
long cpf = 987654321L; //Tem que terminar com L. Se começar com zero, terá que montar uma string.

int numero = 1;
numero = 2;
System.out.print(numero);

//Quando o valor nunca poderá mudar: Constantes
//utilizamos a palavra "final" no inicio
//declaração em CAIXA ALTA


final double VALOR_DE_PI = 3.14;




    }
}
