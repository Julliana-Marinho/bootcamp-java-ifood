public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: "+ areaQuadrado);

        double areaRetangulo = Quadrilatero.area(2,5);
        System.out.println("Área do retângulo: "+areaRetangulo);

        double areaTrapezio = Quadrilatero.area(3, 2, 2);
        System.out.println("Área do trapézio: "+areaTrapezio);
    }
}
