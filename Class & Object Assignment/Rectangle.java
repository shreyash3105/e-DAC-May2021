/*5. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor.*/
class Parameters {
    
    int length;
    int breadth;
    void Area(int l, int b)
    {
    length=l;
    breadth=b;
    }
    
    void display()
    {
       int area=length*breadth;
        System.out.println("Area of Rectangle is =" +area);
        }
}

    public  class Rectangle {
        public static void main(String[] args) {
            Parameters obj = new Parameters();
            obj.Area(4,5);
            obj.display();
            Parameters obj2 = new Parameters();
            obj2.Area(5,8);
            obj2.display();
         }
    }
