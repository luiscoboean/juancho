import java.util.Scanner;

/**
 * Esta clase nos permite hallar el área de un triángulo.
 * necesito preguntarle al usuario la base y la altura para calcular esa ´área
 *
 * @author Luis
 * @version (a version number or a date)
 */
public class AreaTriangulo
{
    public static void main(String[] args)
    {
        // Datos de entrada: información que necesito del usuario
        double base, altura;
        // Datos de salida: donde estara almacenado el resultado de la solucion al problema
        double area;
        
        // Primera tarea: preguntarle al usuario los datos de entrada
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la base: ");
        base = teclado.nextDouble();
        
        System.out.print("Ahora ingrese el valor de la altura: ");
        altura = teclado.nextDouble();
        
        // Calcular el dato de salida, el área
        area = base * altura / 2;
        
        // Ultimo paso: mostrarle al usuario el dato de salida
        System.out.println("El area es: " + area);
        
    }
}
