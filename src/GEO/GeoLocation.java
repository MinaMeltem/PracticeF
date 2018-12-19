/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GEO;

/**
 *
 * @author class
 */
public class GeoLocation {
    
    int x;
    int y;
    
    public static double EuclideanDistance(GeoLocation L1, GeoLocation L2){
      double d;
      d = Math.sqrt((Math.pow((L1.getX() - L2.getX()),2)) + Math.pow((L1.getY() - L2.getY()), 2));
      return d;
        
    }

    public GeoLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
