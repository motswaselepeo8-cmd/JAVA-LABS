public class Question8{

static class Animal {
    public void speak() {
        System.out.println("The animal roars loudly!");

    }
}

static class Cat extends Animal {
    @Override
    public void speak() { 
        System.out.println("The cat meows.");
    }
}

public static void main(String[] args) {
    Animal animal = new Animal();
    animal.speak();

    Cat cat = new Cat();
    cat.speak(); 
}

}
