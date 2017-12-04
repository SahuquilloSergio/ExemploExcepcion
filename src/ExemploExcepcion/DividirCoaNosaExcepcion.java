
package ExemploExcepcion;

import javax.swing.JOptionPane;


public class DividirCoaNosaExcepcion {

    private int numerador;
    private int denominador;
    
    public DividirCoaNosaExcepcion(){
            
    }
    
    public void diCNExcepcion() throws NosaExcepcion{
        numerador =Integer.parseInt( JOptionPane.showInputDialog("Teclea el numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
        if(denominador ==0)
            throw new NosaExcepcion("no se puede dividir entre 0");
        System.out.println("Algo que va aqui pero no me dio tiempo a verlo");
            
                    
                    }
    
    
}
