public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void ligar(){
        ligada=true;
        System.out.println("Ligando...");
    }

    public void desligar(){
        ligada=false;
        System.out.println("Desligando...");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal para: "+canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal para: "+canal);
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para: "+canal);
    }
}
