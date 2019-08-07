package sección;
import javax.swing.*;
public class Sección {
    public static void main(String[] args) {
    int mes;
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
        break;}}}
