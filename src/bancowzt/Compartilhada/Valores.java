/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancowzt.Compartilhada;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author natha
 */
public class Valores {
       public static double FormataValor(double valor, int casas) {
        BigDecimal bigDecimal = new BigDecimal(valor);
        bigDecimal = bigDecimal.setScale(casas, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
   }
}
