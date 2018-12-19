/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Globals;

/**
 *
 * @author class
 */
public enum WalkerArmanent { 
    
    /**
     *
     */
    HeavyLaserCannon("HLC", 2000,2 ,100 ),
    LightLaserCannon("LLC",1000,4,100),
    Granadelauncher("GL",250 ,2,50 );
    
    String weaponType;
    int weaponRange;
    int weaponcount;
    int ammaCount;

    private WalkerArmanent(String weaponType, int weaponRange, int weaponcount, int ammaCount) {
        this.weaponType = weaponType;
        this.weaponRange = weaponRange;
        this.weaponcount = weaponcount;
        this.ammaCount = ammaCount;
    }
    
    
    
    
}
