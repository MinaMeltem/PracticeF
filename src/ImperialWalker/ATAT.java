/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImperialWalker;

import GEO.GeoLocation;
import Globals.Spesifications;
import Globals.WalkerArmanent;

/**
 *
 * @author class
 */
public class ATAT extends ImperialWalker implements Spesifications {
    
    public ATAT(String WType, int height, int length, int width, int weight, int crew, int troopCapacity, int opRange, int maxSpeed, GeoLocation pos, WalkerArmanent primaryWeapon, WalkerArmanent secondarWeapon) {
        super(WType, height, length, width, weight, crew, troopCapacity, opRange, maxSpeed, pos, 
                primaryWeapon = WalkerArmanent.HeavyLaserCannon, secondarWeapon  );
    }

    @Override
    public void displayWalkerInfo() {
        super.displayWalkerInfo();
        System.out.println("HEAVY WALKER...."+this.getWType()+ this.getWIDNumber()+ "^^^^^^^^^^^^^^^");
        System.out.println("HEIGHT: " + this.getHeight() + "Meters");
        System.out.println("WEIGHT: " + this.getWeight() + "Metric Tons");
        System.out.println("HEIGHT - WEIGHT RATIO: " + (this.getHeight() - this.getWeight()) +" Meters per Metric Ton");
        System.out.println("LENGTH: " + this.getLength() + "Meters");
        System.out.println("WIDTH: " + this.getWidth() + "Meters");
        System.out.println("CREW: " + this.getCrew()+ " Stormtroopers");
        System.out.println("TROOPER CAPACITY: " + this.getTroopCapacity());
        System.out.println("MAX SPEED: "+ this.getMaxSpeed() + " KM per hour");
        System.out.println("OPERATIONAL RANGE: "+ this.getOpRange()+ " KM");
        System.out.println("TRAVEL TIME TO OPRANGE: "+(this.getOpRange() / this.getMaxSpeed())+" hours");
        System.out.println("CURRENT pOSITION: [" + this.getPos().getX()+ ", " + this.getPos().getY() + "]");
        System.out.println("PPRIMARY WEAPON: "+ this.getPrimaryWeapon());
        System.out.println("PRIMARY WEAPON RANGE: " + this.getPrimaryWeapon().getWeaponRange());
        System.out.println("SECONDARY WEAPON: "+ this.getSecondarWeapon());
        System.out.println("SECONDARY WEAPON RANGE: " + this.getSecondarWeapon().getWeaponRange());
                
                
    }
    
    
    
}
