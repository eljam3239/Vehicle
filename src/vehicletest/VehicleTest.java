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
public class VehicleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car whip = new Car(10, 20, "Red", true, false);
        System.out.println(whip.getKilo()+" km travelled");
        whip.fillGas();
        System.out.println(whip);
        System.out.println(whip.getColour());
        //there are two more accessor methods, but they are somewhat redundant as the overridden toString methos effectively returns the same stuff
        System.out.println("");
        Minivan momWhip = new Minivan(700, 160000, "Black", 4, "Soccer" );
        System.out.println(momWhip.getKilo()+" km travelled");
        momWhip.fillGas();
        System.out.println("The vehicle has "+ momWhip.returnCapacity()+" passengers.");
        System.out.println("The van is on its way to do "+ momWhip.whatActivity());
        System.out.println(momWhip);
        momWhip.setActivity("Bball");
        momWhip.setPassengers(7);
        System.out.println(momWhip);
        System.out.println(momWhip.getColour());
        System.out.println("");
        
        Truck truck = new Truck(40, 1678, "Matte Black", "Illegal Immigrants", 450);
        System.out.println(truck.getKilo()+" km travelled");
        truck.fillGas();
        System.out.println(truck.getCargo());
        System.out.println("The cargo weighs "+ truck.getWeight()+" pounds.");
        System.out.println(truck);
        truck.setCargo(3500 ,"Timber" );
        System.out.println(truck);
        
        
    }
    
}
