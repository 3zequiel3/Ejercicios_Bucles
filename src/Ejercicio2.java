import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*Una empresa desea calcular el salario semanal de sus empleados
        basándose en las horas trabajadas y una tarifa fija por hora.*/
        int empleados;
        double tarifa_por_hora = 15.8;
        int horas_trabajadas;
        double salario;

        empleados = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Empleados Hay en la Empresa"));
        for (int i = 1; i <= empleados; i++) {
            horas_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajo el empleado " + i));
            salario = horas_trabajadas * tarifa_por_hora;
            JOptionPane.showMessageDialog(null,"El salario del empleado " + i + "es" + "\n" + salario);
        }
    }
}
