
package condicion;

import javax.swing.*; //Aqui se incluye la libreria que se pretende ocupar//
public class Promedio {//Aqui el programa proyecta el nombre que le diste al proyecto//
    
public static void main(String[] args) {//Comienza tu main//
      int c1,c2,c3;//Delcaracion de variables//
     double prom;//Declaracion de variables//
     do{//Indicas el inicio de ciclo//
      //Se determina que se va ingresar una cantidad  para las variables//
         c1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa parcial 1"));
      c2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa parcial 2"));
      c3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa parcial 3"));
prom=(c1+c2+c3)/3;//Se indica el valor de la variable promedio//
if (prom>=7){// Se aplica una condicion para poder si saber si aprovo la materia//
    JOptionPane.showMessageDialog(null,"Este es el resultado final: "+prom+"n Felicidades, estas aprobado");
}//Impresion de resultados//
else if (prom<7){//falso, reprovo la materia//
JOptionPane.showMessageDialog(null,"Este es tu promedio final: "+prom+ "n ,estas reprobado, vuelve a inscribirte");

}
}while(prom<=10&&prom>=0);//Es un ciclo para que se repita si es que se le da un valor incorrecto a la variable//
JOptionPane.showMessageDialog(null, "Calificaciones incorrectas, vuelve a intentarlo");
}
}