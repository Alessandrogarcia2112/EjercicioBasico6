import java.util.Scanner;

public class Principal {
    public void main(){
        double lado;
        Cuadradocalculos cuadradocalculos = new Cuadradocalculos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cálculo de área y perímetro de un cuadrado");
        System.out.println("Ingresa el valor del lado del cuadrado: ");
        lado = teclado.nextDouble();

        while(lado>0){
            cuadradocalculos.area(lado);
            cuadradocalculos.perimetro(lado);
            System.out.println("Ingresa otro valor del lado (0 o negativo para terminar): ");
            lado = teclado.nextDouble();
        }
    }
}
