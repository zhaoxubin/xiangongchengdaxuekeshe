class Test1{
     Test1(){
        System.out.println("hello");
    }
}
public class My extends Test1{
    public static void main(String[] args) {
       new My();
       new Test1();
    }
}
