import java.io.FilterOutputStream;

public class Cuadradocalculos {
    public double perimetro(double lado) {
        if (lado > 0) {
            double suma = (lado * 4);
            System.out.println("El perímetro es: " + suma);
            return suma;
        } else {
            System.out.println("El valor del lado debe ser mayor a 0");
            return 0;
        }
    }
    public double area ( double lado){
            if (lado > 0) {
                double area = lado * lado;
                System.out.println("El área es: " + area);
                return area;
            }else {
                System.out.println("El valor del lado debe ser mayor a 0");
                return 0;
            }
        }
    }
