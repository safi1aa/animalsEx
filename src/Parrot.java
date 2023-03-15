public class Parrot {
    String name;
    int age;
    String color;
    int whole;

    public Parrot(String name, int age,String color,int whole){
        this.name = name;
        this.age = age;
        this.color = color;
        this.whole = whole;

    }
    public Parrot(){

    }

    @Override
    public String toString() {
        return "Parrot\n" +
                "name: " + name + "\n" +
                " age: " + age +
                " color: " + color + "\n" +
                " whole: " + whole;
    }
}
