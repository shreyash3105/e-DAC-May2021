// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
// value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
public class Students {
    String name;
    int roll_no;
    void parameters(String n , int r){
        this.name = n;
        this.roll_no = r;
    }
    void display(){
        System.out.println("Student Name :" + name + "\nStudent Roll no :" + roll_no);
    }
    public static void main(String[] args) {
        Students obj = new Students();
            obj.parameters("John", 2);
            obj.display();
    }
}
