
package ExemploExcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemploExcepcion {

   
    public static void main(String[] args) {
//       CapturaExcepcion CE1 = new CapturaExcepcion();
//       CE1.dividircaptura();

//        VariosCatch VC2 = new VariosCatch();
//        VC2.dividirCapturaVariosCatch();

//        ConFInally CF1 = new ConFInally();
//        CF1.dividirCapturaVariosCatch();

          PropagarExcepcion PE1 = new PropagarExcepcion();
          try{
          PE1.dividirPropagaExcepcion();
          }catch(ArithmeticException ex){
              System.out.println(ex.getMessage());
          }
//            DividirCoaNosaExcepcion DCNE1 = new DividirCoaNosaExcepcion();
//        try {
//            DCNE1.diCNExcepcion();
//        } catch (NosaExcepcion ex) {
//            System.out.println(ex.getMessage());
//        }
    
    //CODIFICAR UN PROGRAMA QUE LEA 2 NUMEROS PARA CALCULAR SU DIVISION
    //DE MODO QUE EL NUMERADOR TIENE QUE ESTAR ENTRE 20 Y 100
    //CASO CONTRARIO SALTARA UNA EXCEPCION QUE DEBEMOS CAPTURAR
    //PRIMERO LA CAPTURAREMOS EN EL METODO DIVIDIR
    //LUEGO LA CAPTURAMOS PROPAGANDOLA A UN METODO
    
    
    
    
    }
    
}
