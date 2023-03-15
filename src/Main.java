public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Fish fish = new Fish("pike",8,"fresh water",2550);
        System.out.println(fish);
        System.out.println("__________________");
        Parrot parrot = new Parrot("cockatiel",1,"white",100);
        System.out.println(parrot);
        System.out.println("___________________");
        Cat cat = new Cat("bibi",3,"white",2);
        System.out.println(cat);
        System.out.println("____________________");
        Dog dog = new Dog("milk",4,"white",4);
        System.out.println(dog);
        System.out.println("_____________________");
    }
}