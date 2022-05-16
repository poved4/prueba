/* 2022-05-16 */

package Talleres;
import javax.swing.JOptionPane;

public class Taller_4 {
    
    /* Programa que mediante el ingreso de un día entre semana se muestre que 
    es un día laboral pero si es sabado o domingo  muestre que es un día festivo,
    pero si el usuario digita un dia no valido que lo digite nuevamente*/
    public void weekDays(){
        String message = "";
        String text = JOptionPane.showInputDialog("Que dias es?");
        
        switch (text.toLowerCase()){
            case "lunes" :
            case "martes" :
            case "miercoles" : 
            case "jueves" : 
            case "viernes" :
                    message = "dia laboral";                
                    break;
            case "sabado" :
            case "domingo" :
                 message = "dia festivo";                
                break;
            default :
                message = "Debes ingresar un dia valido";
                break;
        }
        
        JOptionPane.showMessageDialog(null, message);
    }
    
    /*Programa que me permita ingresar la venta de un producto y me muestre 
    cuantos productos quedan existentes, a parte que me permita registrar un 
    nuevo producto y lo almacene dentro del  aplicativo.  Este ejercicio se
    entrega en un repositorio con git*/    
    public static void circleArea (){
        String radious = JOptionPane.showInputDialog("Ingrese el radio del circulo: ");
        double area = Math.PI * Math.pow(Double.parseDouble(radious), 2);
        JOptionPane.showMessageDialog(null, "area: " + area);
    }
    
    
}