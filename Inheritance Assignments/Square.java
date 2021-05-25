/*5.Create a class named Shape with a function that prints "This is a
shape". Create another class named Polygon inheriting the Shape
class with the same function that prints "Polygon is a shape".
Create two other classes named Rectangle and Triangle having
the same function which prints "Rectangle is a polygon" and
"Triangle is a polygon" respectively. Again, make another class
named Square having the same function which prints "Square is a rectangle".
Now, try calling the function by the object of each of these classes.*/
class Shape {
    void f1(){
        System.out.println("This is a shape");
    }
}
class Polygon extends Shape{
    void f1(){
        System.out.println("Polygon is a shape");
    }
}
class Rectangle extends Shape{
    void f1(){
        System.out.println("Rectangle is a polygon");
    }
}
class Triangle extends Shape{
    void f1(){
        System.out.println("Triangle is a polygon");
    }
}
class Square extends Shape{
    void f1(){
        System.out.println("Square is a Rectangle");
    }
    public static void main(String[]args){
        Shape obj=new Shape();
        Polygon obj1=new Polygon();
        Rectangle obj2=new Rectangle();
        Triangle obj3=new Triangle();
        Square obj4 = new Square();
        obj.f1();
        obj1.f1();
        obj2.f1();
        obj3.f1();
        obj4.f1();
    }
}