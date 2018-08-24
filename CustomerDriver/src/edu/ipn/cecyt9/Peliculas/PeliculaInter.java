/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.Peliculas;

import java.math.BigDecimal;
import java.util.Locale;
/**
 *
 * @author Pablo Fernando Rosas
 */ 
public class PeliculaInter {
    public interface Pelicula {
    String titulo = "nose";
    int año = 2018;
    Locale locale = Locale.ITALY;
    BigDecimal balance = new BigDecimal("0");
    public String rodaje(String titulo);
     public String rodaje2(int año);
      public String rodaje3(String titulo);
       public String rodaje4(String titulo);
        public String rodaje5(String titulo);
       
    
}
}
