/*
 * 
 */
package Globals;

public enum WalkerArmanent { 
    
    /**
     *
     */
    HeavyLaserCannon("HLC", 2000,2 ,100 ),
    LightLaserCannon("LLC",1000,4,100),
    Granadelauncher("GL",250 ,2,50 );
    
    private String weaponType;
    private int weaponRange;
    private int weaponcount;
    private int ammaCount;

    private WalkerArmanent(String weaponType, int weaponRange, int weaponcount, int ammaCount) {
        this.weaponType = weaponType;
        this.weaponRange = weaponRange;
        this.weaponcount = weaponcount;
        this.ammaCount = ammaCount;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponRange() {
        return weaponRange;
    }

    public void setWeaponRange(int weaponRange) {
        this.weaponRange = weaponRange;
    }

    public int getWeaponcount() {
        return weaponcount;
    }

    public void setWeaponcount(int weaponcount) {
        this.weaponcount = weaponcount;
    }

    public int getAmmaCount() {
        return ammaCount;
    }

    public void setAmmaCount(int ammaCount) {
        this.ammaCount = ammaCount;
    }
    
    
   
    
    
    
    
}
