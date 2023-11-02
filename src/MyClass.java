public class MyClass {
    String  name;
    String lastName;
    int age;
    String [] lesson;

    String dish;


    public MyClass(String name,String lastName,int age,String[]lesson,String dish){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lesson = lesson;
        this.dish = dish;
    }
    public String getMyInfo(){
        System.out.println("<>   INFO  <>");
        System.out.println("NAME      :" +name);
        System.out.println("LASTNAME  :" +lastName);
        System.out.println("AGE       :" +age);
        System.out.println("TAMAK     :"+ dish);
        System.out.println("Lesson    :");
        for (String les : lesson){
            System.out.println(les);
        }
        System.out.println();

        System.out.println();

        return "";
            }

            public MyClass(){}

}
