public class Question5 {
    public static String displayInfo(String name){
        return "Hello, my name is " + name + ".";
    }
    
    public static String displayInfo(String name, int age){
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
    
    public static void main(String[] args) {
        System.out.println(displayInfo("Abigail"));
        System.out.println(displayInfo("Mark", 28));
    }
}
