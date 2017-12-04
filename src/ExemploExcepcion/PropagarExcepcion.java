
package ExemploExcepcion;

import javax.swing.JOptionPane;


public class PropagarExcepcion {
   private int numerador;
   private int denominador;

    public PropagarExcepcion() {
    }

    public void dividirPropagaExcepcion()throws ArithmeticException{
        numerador =Integer.parseInt( JOptionPane.showInputDialog("Teclea el numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
        if(denominador==0)
            throw new ArithmeticException("***non se pode dividir entre 0***");
        System.out.println("Resultado="+numerador/denominador);
    
    
    }








}
