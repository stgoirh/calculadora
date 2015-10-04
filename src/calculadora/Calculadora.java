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
        String[] opciones = {"suma", "resta", "multiplicacion", "division",
            "mayor", "porcentaje", "salir"};
        String[] opcionsal = {"si", "no"};
        int finciclo = 99;
        JOptionPane.showMessageDialog(null, "Ingrese numeros");
        String Num1s = JOptionPane.showInputDialog("Ingrese un numero");
        int Num1 = Integer.parseInt(Num1s);
        JOptionPane.showMessageDialog(null, "el numero ingresado es: " + Num1);
        String Num2s = JOptionPane.showInputDialog("Ingrese otro numero");
        int Num2 = Integer.parseInt(Num2s);
        JOptionPane.showMessageDialog(null, "el numero ingresado es: " + Num2);
        do {
            int opcion = JOptionPane.showOptionDialog(
                    null, "que operacion desea realizar?", "Operaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null
            );
            JOptionPane.showMessageDialog(null, "Ha elejido: " + opciones[opcion]);
            int oper = opcion;
            switch (oper) {
                case 0:
                    int Rsum = Num1 + Num2;
                    JOptionPane.showMessageDialog(null, "el resultado es: " + Rsum);
                case 1:
                    int Rrest = Num1 - Num2;
                    JOptionPane.showMessageDialog(null, "el resultado es: " + Rrest);
                    break;
                case 2:
                    int Rmult = Num1 * Num2;
                    JOptionPane.showMessageDialog(null, "el resultado es: " + Rmult);
                    break;
                case 3:
                    if(Num2==0){
                        JOptionPane.showMessageDialog(null, "el numero 2 no puede ser"
                                + " 0 ingrese otro numero");
                        String NumAuxS = JOptionPane.showInputDialog("Ingrese otro numero");
                        int NumAux = Integer.parseInt(NumAuxS);
                        JOptionPane.showMessageDialog(null, "el numero ingresado es: " + NumAuxS);
                        int Rdiv = Num1 / NumAux;
                        JOptionPane.showMessageDialog(null, "el resultado es: " + Rdiv);
                        break;
                    }else{
                        int Rdiv = Num1 / Num2;
                        JOptionPane.showMessageDialog(null, "el resultado es: " + Rdiv);
                        break; 
                    }             
                case 4:
                    int salir = JOptionPane.showOptionDialog(
                            null, "desea salir?", "salir", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionsal, null
                    );
                    switch (salir) {
                        case 0:
                            finciclo = 0;
                            break;
                        case 1:
                            break;
                    }
                default:
                    break;
            }
        } while (finciclo > 50);
    }

}
