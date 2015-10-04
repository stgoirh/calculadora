
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {

    public static void main(String[] args) {
        String[] opciones = {"suma", "resta", "multiplicacion", "division",
            "mayor", "porcentaje", "salir"};
        String[] opcionsal = {"si", "no"};
        int finciclo = 99;
        do {
            int opcion = JOptionPane.showOptionDialog(
                    null, "que operacion desea realizar?", "Operaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null
            );
            int oper = opcion;
            switch (oper) {
                case 0:
                    String Num1su = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num1sum = Integer.parseInt(Num1su);
                    String Num2su = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num2sum = Integer.parseInt(Num2su);
                    int Rsum = Num1sum + Num2sum;
                    JOptionPane.showMessageDialog(null, "el resultado es: " + Rsum);
                    break;
                case 1:
                    String Num1re = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num1res = Integer.parseInt(Num1re);
                    String Num2re = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num2res = Integer.parseInt(Num2re);
                    int Rrest = Num1res - Num2res;
                    JOptionPane.showMessageDialog(null, "el resultado es: " + Rrest);
                    break;
                case 2:
                    String Num1mu = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num1mult = Integer.parseInt(Num1mu);
                    String Num2mu = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num2mult = Integer.parseInt(Num2mu);
                    int Rmult = Num1mult * Num2mult;
                    JOptionPane.showMessageDialog(null, "el resultado es: " + Rmult);
                    break;
                case 3:
                    String Num1di = JOptionPane.showInputDialog("Ingrese un numero");
                    double Num1div = Double.parseDouble(Num1di);
                    String Num2di = JOptionPane.showInputDialog("Ingrese un numero");
                    double Num2div = Double.parseDouble(Num2di);
                    if(Num2div==0){
                        JOptionPane.showMessageDialog(null, "el numero 2 no puede ser"
                                + " 0 ingrese otro numero");
                        String NumAuxS = JOptionPane.showInputDialog("Ingrese otro numero");
                        double NumAux = Double.parseDouble(NumAuxS);
                        JOptionPane.showMessageDialog(null, "el numero ingresado es: " + NumAuxS);
                        double Rdiv = Num1div / NumAux;
                        JOptionPane.showMessageDialog(null, "el resultado es: " + Rdiv);
                        break;
                    }else{
                        double Rdiv = Num1div / Num2div;
                        JOptionPane.showMessageDialog(null, "el resultado es: " + Rdiv);
                        break; 
                    } 
                case 4:
                    String Num1ma = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num1may = Integer.parseInt(Num1ma);
                    String Num2ma = JOptionPane.showInputDialog("Ingrese un numero");
                    int Num2may = Integer.parseInt(Num2ma);
                    if(Num1may>Num2may){
                        JOptionPane.showMessageDialog(null,Num1may+"es mayor que: "+ Num2may);
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,Num2may+" es mayor que "+Num1may);
                        break;
                    }
                case 5:    
                    String Num1po = JOptionPane.showInputDialog("Ingrese un numero");
                    double Num1por = Double.parseDouble(Num1po);
                    String Num2po = JOptionPane.showInputDialog("ingrese el porcentaje");
                    double Num2por = Double.parseDouble(Num2po);
                    double Num2paux=Num2por/100;
                    double Rporc=Num1por*Num2paux;
                    JOptionPane.showMessageDialog(null,"el "+Num2por+" % de "+Num1por+" es: "+Rporc);
                    break;
                case 6:
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
