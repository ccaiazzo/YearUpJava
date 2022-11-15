abstract class Animal {
    abstract public void greeting();
}

interface petName {
    String getPetName();
    void setPetName(String name);
    void setPetName(String firstName, String lastName);
}

class Cat extends Animal implements petName {
    private String name = "";

    @Override
    public void greeting() {
        System.out.println("Meow");
    }

    @Override
    public String getPetName() {
        return this.name;
    }

    @Override
    public void setPetName(String name) {
        this.name = name;
    }

    @Override
    public void setPetName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }
}

class Dog extends Animal implements petName {
    private String name = "";

    @Override
    public void greeting() {
        System.out.println("Woof");
    }

    @Override
    public String getPetName() {
        return this.name;
    }

    @Override
    public void setPetName(String name) {
        this.name = name;
    }

    @Override
    public void setPetName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }
}

class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Wooooooof");
    }
}

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        cat.greeting();
        System.out.println(cat.getPetName());
        cat.setPetName("Ren");
        System.out.println(cat.getPetName());
        cat.setPetName("Ren", "Stimpy");
        System.out.println(cat.getPetName());

        Dog dog = new Dog();
        dog.greeting();
        dog.setPetName("Honey");
        System.out.println(dog.getPetName());

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new BigDog();

        animal1.greeting();
        animal2.greeting();
        animal3.greeting();

        BigDog bigDog = new BigDog();
        bigDog.setPetName("Rocky");

        System.out.println("The name is " + bigDog.getPetName());
    }
}
