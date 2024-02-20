/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package escuelaing.edu.parcial_arep;

import static java.awt.PageAttributes.MediaType.A;
import java.util.ArrayList;

/**
 *
 * @author jose.correa-r
 */

// class for do operation matematic
// the calculetor return in double
// calculadora reflexiva y quicksort. service web con sockets
public class Parcial_Arep {
    
    
    private double result;
    private String operation;
    
    public static void main(String[] args) {


    }
    //method sum of calculetor
    public double sum(double a, double b){
        result = a + b;
        return result;
    }
    //method rest of calculetor
    public double rest(double a, double b){
        result = a - b;
        return result;
    }
    //method multiplication of calculetor
    public double nult(double a, double b){
        result = a * b;
        return result;
    }
    public double div(double a, double b){
        result = a / b;
        return result;
    }
    public double result(){
        return result;
    }
    public double operation(String operation, double a, double b){
        if(operation == "+"){
            result = sum(a,b);
            System.out.println("Este es el resultado" + result);
        }else if(operation == "-"){
            result = rest(a,b);
            System.out.println("Este es el resultado" + result);
        }else if(operation == "/"){
            result = nult(a,b);
            System.out.println("Este es el resultado" + result);
        }else if(operation == "*"){
            result = div(a,b);
            System.out.println("Este es el resultado" + result);
        }
        
        return result;
    
    }
    /*
    public void QUICKSORT (ArrayList A, int inicio, int fin){
        if(inicio < fin){
             p = partition(A, inicio,fin);
            QUICKSORT (A,inicio,p - 1);
            QUICKSORT (A,p + 1 ,fin);
        
        
        }
    }

    private ArrayList partition(ArrayList A, int inicio, int fin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    Class c = Math.class;
    m = c.getMethod("cos", Double.Type);
    //m.invoke(null,2.3)
    m.invoke(null, Double.panseDouble("2.3"))
    
    */
}
