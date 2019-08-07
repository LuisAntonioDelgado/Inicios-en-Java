package anidamiento;
import javax.swing.*;
public class Anidamiento {

    
    public static void main(String[] args) {
       int programa,mes,prom,peaje,newton,fuerza,masa,aceleracion;
      
       programa=Integer.parseInt(JOptionPane.showInputDialog("Selecciona un programa"
               + "\n1)Mes"
               + "\n2)Beca"
               + "\n3)Peaje"
               + "\n4)Segunda Ley de Newton"));
       switch (programa){
           case 1:
                mes=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes"));
    
    switch(mes){
        case 1:JOptionPane.showMessageDialog(null, "Enero tiene 31 días");
        break;
        case 2:JOptionPane.showMessageDialog(null, "Febrero tiene 28 días");
        break;
        case 3:JOptionPane.showMessageDialog(null, "Marzo tiene 31 días");
        break;
        case 4:JOptionPane.showMessageDialog(null, "Abril tiene 30 días");
        break;
        case 5:JOptionPane.showMessageDialog(null, "Mayo tiene 31 días");
        break;
        case 6:JOptionPane.showMessageDialog(null, "Junio tiene 30 días");
        break;
        case 7:JOptionPane.showMessageDialog(null, "Julio tiene 31 días");
        break;
        case 8:JOptionPane.showMessageDialog(null, "Agosto tiene 31 días");
        break;
        case 9:JOptionPane.showMessageDialog(null, "Septiembre tiene 30 días");
        break;
        case 10:JOptionPane.showMessageDialog(null, "Octubre tiene 31 días");
        break;
        case 11:JOptionPane.showMessageDialog(null, "Noviembre tiene 30 días");
        break;
        case 12:JOptionPane.showMessageDialog(null, "Diciembre tiene 31 días");
        break;
    }
               break;
           case 2:
                prom=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu promedio"));
   switch (prom){
       case 0:case 1:case 2:case 3:case 4:case 5: case 6:JOptionPane.showMessageDialog(null,"Estas reprobado,"
               + " tu promedio es= "+prom);
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
       
               break;
               
           case 3:
               peaje=Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de que vehiculo conduce"));
               switch (peaje){
                   case 1:JOptionPane.showMessageDialog(null,"Conduces un vehiculo tipo Turismo. \nFavor de pagar $65");
                   break;
                   case 2:JOptionPane.showMessageDialog(null,"Conduces un vehiculo tipo Autobus. \nFavor de pagar $150");
                    break;
                   case 3:JOptionPane.showMessageDialog(null,"Conduces un vehiculo tipo Motocicleta. \nFavor de pagar $35");
                     break;
               }
               break;
           case 4:
                newton=Integer.parseInt(JOptionPane.showInputDialog("Que nesesita calcular"
               + "\n1)Fuerza"
               + "\n2)Masa"
               + "\n3)Aceleración"));
     switch (newton){
         case 1: masa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la masa de objeto"));
                 aceleracion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la aceleración de objeto"));
               fuerza=masa*aceleracion;
               JOptionPane.showMessageDialog(null,"La Fuerza aplicada es de: "+fuerza+"N");
               break;
         case 2: fuerza=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza que es aplicada al objeto"));
                 aceleracion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la aceleración de objeto"));
               masa=fuerza/aceleracion;
               JOptionPane.showMessageDialog(null,"La masa del objeto es de: "+masa+"Kg");
               break;
         case 3: fuerza=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerzaque se le aplica al objeto"));
                 masa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la masa que tiene el objeto"));
               aceleracion=fuerza/masa;
               JOptionPane.showMessageDialog(null,"La la aceleracion es de: "+aceleracion+"m/s");
               break;
                }
                break;
       default:JOptionPane.showMessageDialog(null,"Opción Incorrecta");
       
    
      
    }}}
     
    

