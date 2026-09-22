public class Question7 {
    public static void tryToDouble(int number){
        number *= 2;

        System.out.println("Inside tryToDouble: " + number);
    }

    public static void main(String[] args) {
        int myNumber = 5;
        
        tryToDouble(myNumber);
        System.out.println("After tryToDouble: " + myNumber);
    }

}
