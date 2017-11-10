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
public class Car extends Vehicle{
    boolean isAutomatic;
    boolean isConvertible;
    public Car(int g, int k, String c, boolean isAuto, boolean isConvert){
        super(g,k,c);
        isAutomatic = isAuto;
        isConvertible = isConvert;
    }
    
    public String getConvertible(){
        String out;
        if(isConvertible){
           out = "This whip be a convertable.";
        }else{
            out = "This whip isnt a convertable.";
        }    
            return out;
     
    }
    /**
     *
     * @return
     */
    public String getAuto(){
        String outinfo;
        if(isAutomatic){
            outinfo = "This whip is automatic.";
        }else{
            outinfo = "THis whip is standard";
        }
        return outinfo;
    }
    public String toString(){
        String out;
        out = "Whip is a convertible: "+isConvertible+", Whip is automatic: "+isAutomatic;
        return out;
    }
    
}
