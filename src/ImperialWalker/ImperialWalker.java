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
public class ImperialWalker implements Spesifications {
    
    String WType;
    String WIDNumber;
    int height;
    int length;
    int width;
    int weight;
    int crew;
    int troopCapacity;
    int opRange;
    int maxSpeed;
    GeoLocation pos;
    WalkerArmanent primaryWeapon;
    WalkerArmanent secondarWeapon; 

    public ImperialWalker(String WType, int height, int length, int width, int weight, int crew, int troopCapacity, int opRange, int maxSpeed, GeoLocation pos, WalkerArmanent primaryWeapon, WalkerArmanent secondarWeapon) {
        this.WType = WType;
        this.height = height;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.crew = crew;
        this.troopCapacity = troopCapacity;
        this.opRange = opRange;
        this.maxSpeed = maxSpeed;
        this.pos = new GeoLocation(100,100) ;
        this.primaryWeapon = primaryWeapon;
        this.secondarWeapon =  WalkerArmanent.Granadelauncher;
    }
    
    
    
    

    @Override
    public void displayWalkerInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
    
}
