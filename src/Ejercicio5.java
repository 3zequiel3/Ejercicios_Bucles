import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Una empresa desea calcular las horas extras trabajadas por sus empleados.
        Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.*/
        int horas = 0;
        int horas_extra;
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    """
                            Seleccione una opción:
                            1. Ingresar horas trabajadas por esta semana
                            2. Calcular horas extras
                            3. Salir
                            """,
                    "Menú de opciones", JOptionPane.QUESTION_MESSAGE));
            switch (op){
                case 1 :
                    horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas horas trabajaste hoy dia?","Cantidad de horas",JOptionPane.QUESTION_MESSAGE));
                    break;
                case 2 :
                    if (horas>40){
                        horas_extra = horas -40;
                        JOptionPane.showMessageDialog(null,"Esta semana trabajaste " + horas_extra + "hs extra");
                    }
                    break;
                case 3 :
                    JOptionPane.showMessageDialog(null,"Gracias,adios......");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingresa un valor valido");
                    break;
            }
        }while(op!=3);
    }
}
