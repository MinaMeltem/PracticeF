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
    
   private String WType;
   private String WIDNumber;
   private int height;
   private int length;
   private int width;
   private int weight;
   private int crew;
   private int troopCapacity;
   private int maxSpeed;
   private int opRange;   
   private GeoLocation pos;
   private WalkerArmanent primaryWeapon;
   private WalkerArmanent secondarWeapon; 

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

    public String getWType() {
        return WType;
    }

    public void setWType(String WType) {
        this.WType = WType;
    }

    public String getWIDNumber() {
        return WIDNumber;
    }

    public void setWIDNumber(String WIDNumber) {
        this.WIDNumber = WIDNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getOpRange() {
        return opRange;
    }

    public void setOpRange(int opRange) {
        this.opRange = opRange;
    }

    public WalkerArmanent getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(WalkerArmanent primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public WalkerArmanent getSecondarWeapon() {
        return secondarWeapon;
    }

    public void setSecondarWeapon(WalkerArmanent secondarWeapon) {
        this.secondarWeapon = secondarWeapon;
    }

    public GeoLocation getPos() {
        return pos;
    }

    public void setPos(GeoLocation pos) {
        this.pos = pos;
    }

    public int getTroopCapacity() {
        return troopCapacity;
    }

    public void setTroopCapacity(int troopCapacity) {
        this.troopCapacity = troopCapacity;
    }
    
    
    
    
    
}
