import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
         /*Cálculo del tiempo dedicado a cada actividad
Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Instrucciones:
•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
*/
        int estudiar;
        int ejercicio ;
        int leer ;
        int tiempo_libre ;
        int tiempo_total = 0;
        int dormir = 8;

        boolean centinela  = true;
        while (centinela){
            int horas_dia = 24;
            horas_dia-=dormir;
            estudiar = 0;
            ejercicio = 0 ;
            leer = 0 ;
            tiempo_libre = 0 ;
            if (estudiar == 0 & ((horas_dia>0) & (horas_dia<=24))){
                estudiar = Integer.parseInt(JOptionPane.showInputDialog("Dime cuantas horas al dia estudias?"));
                 horas_dia-=estudiar;
            }
            if(leer == 0 & ((horas_dia>0) & (horas_dia<=24))){
                leer=Integer.parseInt(JOptionPane.showInputDialog("Dime cuantas horas al dia lees"));
                 horas_dia-=leer;
            }
            if(ejercicio ==0  & ((horas_dia>0) & (horas_dia<=24))){
                ejercicio=Integer.parseInt(JOptionPane.showInputDialog("Dime cuantas horas al dia ejercitas"));
                 horas_dia-=ejercicio;
            }
            if(tiempo_libre==0 & ((horas_dia>0) & (horas_dia<=24))){
                tiempo_libre=Integer.parseInt(JOptionPane.showInputDialog("Dime cuantas horas al dia tienes tiempo libre")
                );
                 horas_dia-=tiempo_libre;
            }

            if((ejercicio!=0 & estudiar!=0 & leer!=0 & tiempo_libre !=0) & (horas_dia>=0)) {
                tiempo_total = estudiar + leer + tiempo_libre + ejercicio;
                JOptionPane.showMessageDialog(null,"Dado a que duermes un aproximado de 8 hs al dia\nEl tiempo total que inviertes en esas actividades es: " + tiempo_total + " hs");
                centinela = false;
            }else{
                JOptionPane.showMessageDialog(null,"No puedes invertir esa cantidad de horas a las actividades o ingresaste un numero no valido");
            }
        }
    }

}
