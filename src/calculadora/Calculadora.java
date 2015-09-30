/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author stgoirh
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] opciones= {"suma", "resta", "multiplicacion", "division"};
        JOptionPane.showMessageDialog(null,"Ingrese numeros");
        String Num1s =JOptionPane.showInputDialog("Ingrese un numero");
        int Num1= Integer.parseInt(Num1s);
        JOptionPane.showMessageDialog(null,"el numero ingresado es: "+Num1);
        String Num2s =JOptionPane.showInputDialog("Ingrese otro numero");
        int Num2= Integer.parseInt(Num2s);
        JOptionPane.showMessageDialog(null,"el numero ingresado es: "+Num2);
        int opcion = JOptionPane.showOptionDialog(
                                null
                            ,   "que operacion desea realizar?"
                            ,    "Operaciones"
                            ,    JOptionPane.DEFAULT_OPTION
                            ,    JOptionPane.INFORMATION_MESSAGE
                            ,    null
                            ,    opciones
                            ,    null  
        );
        JOptionPane.showMessageDialog(null,"Ha elejido: "+opciones[opcion]);
        int Rsum=Num1+Num2;
        int Rrest=Num1-Num2;
        int Rmult=Num1*Num2;
        int Rdiv=Num1/Num2;       
        if(opcion==1){
            JOptionPane.showMessageDialog(null,"el resultado es: "+Rsum);
        }
    }
    
    
}
