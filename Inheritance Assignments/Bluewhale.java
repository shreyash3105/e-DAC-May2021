/*1.Create two classes named Mammals and MarineAnimals.
        Create another class named BlueWhale which inherits both the
        above classes. Now, create a function in each of these classes
        which prints "I am mammal", "I am a marine animal" and "I
        belong to both the categories: Mammals as well as Marine
        Animals" respectively. Now, create an object for each of the
        above class and try calling
        1 - function of Mammals by the object of Mammal
        2 - function of MarineAnimal by the object of MarineAnimal
        3 - function of BlueWhale by the object of BlueWhale
        4 - function of each of its parent by the object of BlueWhale*/
class Mammals {
    void f1(){System.out.println("I am mammal");
    }
}
class MarineAnimals extends Mammals{
void f2(){System.out.println("I am Marine Animal");
}
}
class Bluewhale extends MarineAnimals{
void f3(){System.out.println("I belong to both categories: Mammals as well as Marine Animals");
}
public static void main(String[]args){
Mammals obj = new Mammals();
obj.f1();
MarineAnimals obj1 = new MarineAnimals();
obj1.f2();
Bluewhale obj2 = new Bluewhale();
obj2.f3();
obj2.f1();
obj2.f2();
}
}
