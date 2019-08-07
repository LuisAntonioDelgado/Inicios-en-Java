package sección;
import javax.swing.*;
public class Beca {
    
     public static void main(String[] args) {
         int prom;
   prom=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu promedio"));
   switch (prom){
       case 0:case 1:case 2:case 3:case 4:case 5: case 6:JOptionPane.showMessageDialog(null,"Estas reprobado, tu promedio es= "+prom);
       break;
       case 7:JOptionPane.showMessageDialog(null,"Tu promedio es="+prom+".\n No tienes beca, pero pasaste");
       break;
       case 8: JOptionPane.showMessageDialog(null,"Tu promedio es= "+prom+".\n Tienes 20% de beca");
       break;
       case 9: JOptionPane.showMessageDialog(null,"Tu promedio es= "+prom+".\n Tienes 35% de beca");
       break;
       case 10: JOptionPane.showMessageDialog(null,"Tu promedio es= "+prom+".\n Tienes 50% de beca");
       break;
       default:JOptionPane.showMessageDialog(null,"Dato fuera de rango, vuelve a ingresar el valor");
   }
     }
}
