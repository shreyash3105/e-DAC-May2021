/*We want to store the information of different vehicles. Create a
class named Vehicle with two data member named mileage and
price. Create its two subclasses
*Car with data members to store ownership cost, warranty (by
years), seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders,
number of gears, cooling type(air, liquid or oil), wheel
type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having
a data member to store the model type. Next, make two
subclasses Bajaj and TVS, each having a data member to store
the make-type.
Now, store and print the information of an Audi and a Ford car
(i.e. model type, ownership cost, warranty, seating capacity, fuel
type, mileage and price.) Do the same for a Bajaj and a TVS
bike.*/
class Vehicle{
    public static void main(String[]args){
        Audi obj1 = new Audi("Audi" , "A8", 12.2, 15700000, "1 year", 2, "Petrol", 20000000);
        obj1.display1();
        Ford obj2 = new Ford("Ford" , "Figo", 19.5, 1520000, "2 year", 4, "Diesel", 1900000);
        obj2.display1();
        Bajaj obj3 = new Bajaj("Bajaj", "NS200", 256000, "3 Years", 1, 6, "Liquid Cooling", 40.55, "Alloy Wheels", 12.5);
        obj3.display2();
        TVS obj4 = new TVS("TVS", "Star", 125000, "5 Years", 1, 5, "Air Cooling", 59.15, "Alloy Wheels", 15);
        obj4.display2();
    }
}
class Vehicle1{ //super class
    double mileage;
    double price;
}
class Car extends Vehicle1{
    double cost;
    int seatingCap;
    String fuelType;
}
class Bike extends Vehicle1{
    int cylinders;
    int gears;
    String cooling;
    String wheeltype;
    double fueltank;
    double mileage;
}
class Audi extends Car{ //sub class
    String name;
    String warranty;
    String modelType;
    Audi(String n, String t, double m, double p, String w, int s, String f, double c){ //Parameterised constructor
        this.name = n;
        this.warranty = w;
        this.modelType = t;
        super.mileage = m;
        super.price = p;
        super.cost = c;
        super.seatingCap = s;
        super.fuelType = f;
    }
    void display1(){ //output statement
        System.out.println("Brand Name :" + name + "\nModel Type :" + modelType + "\nOwnership Cost (Ex Showroom Price) :" + price + "\nWarranty :" +warranty+ "\nSeating Capacity :" + seatingCap + "\nFuel Type :" + fuelType + "\nMileage :" + mileage + "\nOn Road Price :" + cost);
    }
}
class Ford extends Car{
    String name;
    String warranty;
    String modelType;
    Ford(String n, String t, double m, double p, String w, int s, String f, double c){
        this.name = n;
        this.warranty = w;
        this.modelType = t;
        super.mileage = m;
        super.price = p;
        super.cost = c;
        super.seatingCap = s;
        super.fuelType = f;
    }
    void display1(){
        System.out.println("\nBrand Name :" + name + "\nModel Type :" + modelType + "\nOwnership Cost (Ex Showroom Price) :" + price + "\nWarranty :" +warranty+ "\nSeating Capacity :" + seatingCap + "\nFuel Type :" + fuelType + "\nMileage :" + mileage + "\nOn Road Price :" + cost);
    }
}
class Bajaj extends Bike{
    String name;
    String warranty;
    String modeltype;
    Bajaj(String n, String mt, double p, String w, int cyd, int g, String c,double m, String wt, double f){
        this.name = n;
        this.warranty = w;
        this.modeltype = mt;
        super. mileage = m;
        super. price = p;
        super.cylinders = cyd;
        super.gears = g;
        super.cooling = c;
        super.wheeltype = wt;
        super.fueltank = f;
    }
    void display2(){
        System.out.println("\nBrand Name :" + name + "\nModel type :" + modeltype + "\nOwnership Cost :" + price + "\nWarranty :" + warranty + "\nNo. of Cylinders :" + cylinders + "\nNo. of Gears :" + gears + "\nType of Cooling :" + cooling + "\nMileage :" + mileage + "\nWheel Type :" + wheeltype + "\nFuel Tank Capacity :" + fueltank);
    }
}
class TVS extends Bike{
    String name;
    String warranty;
    String modeltype;
    TVS(String n, String mt, double p, String w, int cyd, int g, String c,double m, String wt, double f){
        this.name = n;
        this.warranty = w;
        this.modeltype = mt;
        super. mileage = m;
        super. price = p;
        super.cylinders = cyd;
        super.gears = g;
        super.cooling = c;
        super.wheeltype = wt;
        super.fueltank = f;
    }
    void display2(){
        System.out.println("\nBrand Name :" + name + "\nModel type :" + modeltype + "\nOwnership Cost :" + price + "\nWarranty :" + warranty + "\nNo. of Cylinders :" + cylinders + "\nNo. of Gears :" + gears + "\nType of Cooling :" + cooling + "\nMileage :" + mileage + "\nWheel Type :" + wheeltype + "\nFuel Tank Capacity :" + fueltank);
    }
}
