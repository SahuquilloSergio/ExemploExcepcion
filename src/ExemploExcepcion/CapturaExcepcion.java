package ExemploExcepcion;

import javax.swing.JOptionPane;

public class CapturaExcepcion {
    private int numerador;
    private int denominador;

    public CapturaExcepcion() {
        
    }

    public void dividircaptura(){
        numerador =Integer.parseInt( JOptionPane.showInputDialog("Teclea el numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
        try{
        int resultado = (numerador/denominador);
        System.out.println(numerador+"/"+denominador+"="+resultado );
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        
    }

}
