package edu.ipn.cecyt9.Peliculas;
public abstract class PeliculaAbs{
/**
 *
 * @author Pablo Fernando Rosas
 */ 
    private String Titulo;
    
    public void Funcion(){}
    public abstract void NuevaFuncion();
    
    public String Programar(){
        String pro=(" se reproducira a las 13:00 hrs");
        return pro;
    }
    
    
    public void setNombre(String s){
     Titulo =s;
    }
    
    public String getNombre(){
    return Titulo;
    }
   
}
