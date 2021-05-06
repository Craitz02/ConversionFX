/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.conversionfx.core;

/**
 *
 * @author Sistemas-15
 */
public class TemperatureConvertion {   
    public static float FahToCelcius(float temp) {
        return (temp - 32) * 5 / 9;
    }
    public static float CelciusToFah(float temp) {
        return (temp * 9 / 5) + 32;
    }
}
