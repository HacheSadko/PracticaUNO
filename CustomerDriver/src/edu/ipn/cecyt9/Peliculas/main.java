
package edu.ipn.cecyt9.Peliculas;

/**
 *
 * @author Pablo Fernando Rosas
 */ 
public class main {
    public static void main(String[] args){
        PeliculaConstructor pel=new PeliculaConstructor();
        pel.Pelicula1("India");
        pel.Pelicula2("Jones");
        pel.Pelicula3("2 horas");
        pel.Pelicula4("accion");
        pel.Pelicula5(2018);
        System.out.println(pel.toString());
        
        //Abstracta
        
        PeliculaAbs abs= new PeliculaAbs() {
            @Override
            public void NuevaFuncion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println("\nAbstact:");
        abs.setNombre("indiana Jones");
        System.out.println("La pelicula "+abs.getNombre()+abs.Programar());
    }
    
}
