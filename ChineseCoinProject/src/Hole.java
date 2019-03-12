public class Hole {
	private static int s; 
    
    public Hole(int s) { 
        this.s = s; 
    } 
    public int getHole() { 
        return s; 
    }
    
    public static void setHole(int s1) { 
        s = s1;
    }
    
    public boolean isLargeValue() { 
        return s > 10; 
    }
    
    public int area()  { 
        return s * s; 
    }
    
    public int circumference()  { 
        return s * 4; 
    }
}
