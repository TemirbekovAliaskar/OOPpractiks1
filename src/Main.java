
public class Main {
    public static void main(String[] args) {

        String[]lessonss = {"Java","Soft Skils","English"};

        MyClass myClass = new MyClass("Jah","Khalib",30,lessonss,"Bes Barmak");
        MyClass myClass1 = new MyClass("Cristiano","Ronaldo",39,lessonss,"Kuurdak");

        MyClass myClass2 = new MyClass();
        myClass2.name = "ALi";
        myClass2.lastName = "Muhammed";
        myClass2.age = 25;
        myClass2.lesson = lessonss;
        myClass2.dish = "Pizza";

        myClass.getMyInfo();
        myClass1.getMyInfo();
        myClass2.getMyInfo();



//        Triangle triangle = new Triangle(2,4,5);
//        System.out.println(triangle.area());
    }
}