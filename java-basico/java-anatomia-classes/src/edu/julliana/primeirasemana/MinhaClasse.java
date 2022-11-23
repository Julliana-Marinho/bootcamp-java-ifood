package edu.julliana.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        final String BR = "Brasil"; //"final": uppercase + underline.
        
        //====declarações inválidas de variáveis
        //int numero &um = 1  => únicos símbolos: _ e $
        //int 1numero = 1 =>não pode começar com nº
        //int numero um = 1 => não pode espaço
        //int long = 1 => não pode usar palavras reservadas

        //====Declarações válidas:

        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;

        //boas práticas: camelCase.

        //====Declaração de variáveis e métodos

        //Tipo nomeBemDefinido = Atribuição
        //exemplos:

        String meuNome = "Julliana";

        int anoFabricacao = 2022;

        boolean verdadeira = true;

        //podemos também fazer modificações:

        anoFabricacao = 2018;

        //métodos

        //TipoRetorno NomeObjetivoNoInfinitivo Parametros

        //Exemplo


        //int somar (int numeroUm, int numero2)
        //String formatarCep (long cep)

        String primeiroNome = "Julliana";
        String segundoNome = "Marinho";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

        }

        //declaracao metodo

        public static String nomeCompleto (String primeiroNome, String segundoNome) {
            return primeiroNome.concat(" ").concat(segundoNome);
            
        }
}
