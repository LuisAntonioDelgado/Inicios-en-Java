
package condicion;
import javax.swing.*;//Se llama a la Libreria que se ocupara//
public class Condicion {//Titlo qe le has puesto a tu proyecto//

 
    public static void main(String[] args) {//Comienza tu main//
      int a,b;//Declaracion de variables con int que es entero// 
      //Comandos para ingresar cantidades y dar valor a esas variables//
      a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero"));
      b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero entero"));
      if (a>b){//Condicion para determinar que numero es mayor//
          JOptionPane.showMessageDialog(null,"El numero mayor es="+a);
          }//Impresion de resultados//
      
          else if (b>a){//Condicion por si el resultado es falso//
               JOptionPane.showMessageDialog(null,"El numero mayor es="+b);
                  }
              
      }
    }
    

