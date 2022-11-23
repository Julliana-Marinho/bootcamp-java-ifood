public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status ->  TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " +smartTv.ligada);

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.mudarCanal(13);
        
        smartTv.aumentarCanal();

        smartTv.mudarCanal(32);

        smartTv.desligar();
        System.out.println("Novo status TV -> TV ligada? "+smartTv.ligada);
    }
}
