import java.io.FilterOutputStream;

public class Cuadradocalculos {
    public int perimetro(int lado) {
        if (lado > 0) {
            int suma = lado * 4;
            System.out.println("El perímetro es: " + suma);
            return suma;
        } else {
            System.out.println("El valor del lado debe ser mayor a 0");
            return 0;
        }
    }
    public int area ( int lado){
            if (lado > 0) {
                int area = lado * lado;
                System.out.println("El área es: " + area);
                return area;
            }else {
                System.out.println("El valor del lado debe ser mayor a 0");
                return 0;
            }
        }
    }
