
public class ChineseCoin {
	public static void main(String args[]) {
        Coin coinObj= new Coin(1, 2);
        System.out.println("The hole is: " + coinObj.getHoleObj().getHole()); 
    
        System.out.println("The radius is: " + coinObj.getCoin()); 
    
        System.out.println( "The Chinese Coin is Normal: " + coinObj.isNormal() );
    }

}
