
package ExemploExcepcion;


public class NosaExcepcion extends Exception {
    
    
    public NosaExcepcion(){
        super("Informacion de la excepcion");   
        
    }
    public NosaExcepcion(String mensaxe){
        super(mensaxe);
    }
   


}
