import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Una tienda desea registrar las ventas realizadas cada día durante una semana.
        El programa debe calcular el total de ventas al final de la semana.*/

        int contador= 1;
        int ventas_realizadas = 0 ;
        int total_ventas;
        int dias_semana = 7;


        while(contador<dias_semana){
            switch (contador){
                case 1 :
                    ventas_realizadas += Integer.parseInt(JOptionPane.showInputDialog("Hoy es Lunes.\nCuantas ventas realizaste hoy?"));
                    break;
                case 2 :
                    ventas_realizadas += Integer.parseInt(JOptionPane.showInputDialog("Hoy es Martes.\nCuantas ventas realizaste hoy?"));
                    break;
                case 3 :
                    ventas_realizadas += Integer.parseInt(JOptionPane.showInputDialog("Hoy es Miercoles.\nCuantas ventas realizaste hoy?"));
                    break;
                case 4 :
                    ventas_realizadas += Integer.parseInt(JOptionPane.showInputDialog("Hoy es Jueves.\nCuantas ventas realizaste hoy?"));
                    break;
                case 5 :
                    ventas_realizadas += Integer.parseInt(JOptionPane.showInputDialog("Hoy es Viernes.\nCuantas ventas realizaste hoy?"));
                    break;
                case 6 :
                    ventas_realizadas += Integer.parseInt(JOptionPane.showInputDialog("Hoy es Sabado.\nCuantas ventas realizaste hoy?"));
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingresa un valor correcto. Te confundiste en alguno de los dias");
                    break;
            }
            if (ventas_realizadas>0 & contador == 6) {
                JOptionPane.showMessageDialog(null,"Felicidades esta semana has realizado: " + ventas_realizadas+ " ventas");
            }
            contador++;

        }

    }
}
