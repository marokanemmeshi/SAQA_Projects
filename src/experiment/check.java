package experiment;
class Car  
{ 
    // the Bicycle class has two fields 
    public int gear; 
    public int speed; 
    // the Bicycle class has one constructor 
    public Car(double gear, double speed) 
    { 
        this.gear = (int) gear; 
        this.speed = (int) speed; 
    } 
    // the Bicycle class has three methods 
    public void speedUp(double increment) 
    { 
        speed += increment; 
    }
    public void breaking(double decrement) 
    { 
        speed -= decrement; 
    } 
    // toString() method to print info of car 
    @Override
    public String toString()  
    { 
        return("The car is in Gear no:"+gear 
                +"\n"
                + "Current Speed is:"+speed); 
    }  
} 
class audi extends Car{
    public audi(double gear, double speed) {
        super(gear, speed);
    }
}
class mercedez extends Car{
    public int modelNo;
    public mercedez(double gear, double speed) {
        super(gear, speed);
    }
}
// derived class 
class Quantum extends Car  
{ 
    // the MountainBike subclass adds one more field 
    public int seatHeight; 
  
    // the MountainBike subclass has one constructor 
    public Quantum(double gear,double speed, 
                        double startHeight) 
    { 
        // invoking base-class(Car) constructor 
        super(gear, speed); 
        seatHeight = (int) startHeight; 
    }  
    // the Quantum subclass adds one more method 
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
    // overriding toString() method 
    // of car to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nMax Capacity is: "+seatHeight); 
    } 
} 
// driver class 

public class check  
{ 
    public static void main(String args[])  
    { 
        Quantum mb = new Quantum(3, 16, 25); 
        System.out.println(mb.toString());       
    } 
}