/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletest;

/**
 *
 * @author eljam3239
 */
public abstract class Vehicle {
     int gas;
     int kilometers;
     String colour;
     
     public Vehicle(int gas, int kilo, String col){
         gas = gas;
         kilometers = kilo;
         colour = col;
     }
     
     public void fillGas(){
         gas += 20;
     }
     public double getKilo(){
        return kilometers;
     }
     public String getColour(){
         return ("The vehicle is "+colour);
     }
     
     
}
