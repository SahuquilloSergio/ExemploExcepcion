
package ExemploExcepcion;

import javax.swing.JOptionPane;

public class VariosCatch {
    
    private int numerador;
    private int denominador;

    public VariosCatch() {
        
    }

    public void dividirCapturaVariosCatch(){
        numerador =Integer.parseInt( JOptionPane.showInputDialog("Teclea el numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
        try{
        int resultado = (numerador/denominador);
        System.out.println(numerador+"/"+denominador+"="+resultado );
        }catch(ArithmeticException e){
            //System.out.println("No se puede dividir entre 0");
            
        
        }catch(NumberFormatException e2){
            System.out.println("Error 2 "+e2.toString());

    }

    }
}
