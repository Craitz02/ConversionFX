/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.conversionfx.core;

/**
 *
 * @author Sistemas-12
 */
public class CurrencyConvertion {
    public static float CorToDol(float value){
        return ((float)value/35.16f);
    }
    public static float DolToCor(float value){
        return (float)(value*35.36f);
    }
    public static float DolToEu(float value){
        return (float)(value*0.82f);
    }
    public static float EuToDol(float value){
        return (float)(value*1.22f);
    }
    
}
