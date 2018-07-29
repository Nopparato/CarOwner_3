package homework;

class Car {
    int howlong;
    int distance;
    
    public void start(){
        System.out.println("Go!");
    }
    public void stop(){
        System.out.println("Stop!"+"\n"); 
    }
    public int drive(int howlong){
        int distance = howlong*60;
        System.out.println("My Car Passed " + distance + " Meters.");
        return distance;
    }
}
 class JamesBondCar extends Car {
    public int drive(int howlong){
    int distance = howlong*180;
    System.out.println("JamesBonds Car Passed " + distance + " Meters.");
    return distance;    
    }
}
public class CarOwner {
	public static void main(String[] args) {
		int howlong = 10;
        Car myCar = new Car();
        myCar.start();
        myCar.drive(howlong);
        myCar.stop();
        
        JamesBondCar  JamesBondCar = new JamesBondCar();
        JamesBondCar.start();
        JamesBondCar.drive(howlong);
        JamesBondCar.stop();
	}
}
