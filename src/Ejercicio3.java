import javax.swing.*;
import java.sql.Array;
public class Ejercicio3 {
    public static void main(String[] args) {
        /*Una tienda necesita revisar el inventario de sus productos y determinar si algún
         artículo tiene menos de 5 unidades disponibles para realizar un pedido.*/
        int num_prod = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos tienes en inventario?"));

        String [] nombres = new String[num_prod];
        int [] cantidad = new int[num_prod];

        for (int i = 1; i <= num_prod; i++) {
            nombres[i] = JOptionPane.showInputDialog("Cual es el nombre del producto" + i+ " :");
            cantidad[i] = Integer.parseInt(JOptionPane.showInputDialog("Cual es la cantidad en inventario del producto: " + nombres[i]));
        }
        for (int i = 0; i < num_prod; i++) {
            if (cantidad[i] < 5){
                JOptionPane.showMessageDialog(null,"Debes realizar un pedido del producto " + nombres[i]);
            }
        }
    }
}
