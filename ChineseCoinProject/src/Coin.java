import java.math.*;;

public class Coin {
	private double r;
    //private Hole holeObj;
    private static double pi;
    
    Hole holeObj = new Hole(0);
    
    private static void setPI() {
        pi = 3.1416;
    }
    
    public Coin(int s1, int r1) { 
        r = r1; 
        holeObj.setHole( s1 ); 
    }
    
    public Hole getHoleObj () { 
        return holeObj; 
    }
    
    public void setHoleObj(int s2) { 
    	holeObj.setHole( s2 ); 
    }   
    
    public double getCoin() { 
        return r; 
    }
    
    public void setCoin(double r2) { 
        r = r2; 
    }
    
    public double area()  { 
       double chineseCoinArea = r * r * pi - holeObj.area();
       return chineseCoinArea; 
    }
    
    public boolean isNormal() { 
        return r > (holeObj.getHole() * Math.pow(2.0, 0.5)); 
    }
}
