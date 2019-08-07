package condicion;

import javax.swing.*; //Aqui se incluye la libreria que se pretende ocupar//
public class Contalum {//Aqui el programa proyecta el nombre que le diste al proyecto//
    
public static void main(String[] args) {//Comienza tu main//
int c1,c2,c3;//Declaracion de variables//
double prom;
int cont=0;//Declaracion de un contador empezando en 0//
int num;//Declaracion de variable para sabier cuantos niños seran calificados//
num=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos alumnos son?"));
do{//Las acciones que va realizar el ciclo//
 c1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa parcial 1"));
 c2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa parcial 2"));
 c3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa parcial 3"));
 prom=(c1+c2+c3)/3;
 
 if (prom>=7){//Condicion para determinar si paso la materia o no//
    JOptionPane.showMessageDialog(null, "Este es tu promedio Final: "+prom+"\n Felicidades, estas aprobado" );
}//Impresion de resultados//
 else if(prom<7){//Falso, por si es que no pasa la materia//
 JOptionPane.showMessageDialog(null,"Este es tu promedio final:"+prom+"\n, estas reprovado, vuelve a inscribirte");
         }//Impresion de resultados//
 cont++;//El contador empieza a sumar de uno en uno las vueltas que da//
}while (cont<num);//Ciclo, las veses que va a repretir el numero de alumnos que seran calificados// 
}
}

