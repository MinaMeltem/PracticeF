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
public class  ATAS extends ImperialWalker implements Spesifications {   

    public ATAS(String WType, int height, int length, int width, int weight, int crew, int troopCapacity, int opRange, int maxSpeed, GeoLocation pos, WalkerArmanent primaryWeapon, WalkerArmanent secondarWeapon) {
        super(WType, height, length, width, weight, crew, troopCapacity, opRange, maxSpeed, pos, 
                primaryWeapon = WalkerArmanent.LightLaserCannon ,secondarWeapon );
    }
    

    @Override
    public void displayWalkerInfo() {
        super.displayWalkerInfo(); 
    }


    
}
