public class Dog {
    String name;
    int age;
    String color;
    int whale;

    public Dog(String name,int age,String color,int whale){
        this.name = name;
        this.age = age;
        this.color = color;
        this.whale = whale;
    }
    public Dog(){

    }

    @Override
    public String toString() {
        return "Dog\n" +
                "name: " + name + "\n" +
                " age: " + age +"\n"+
                " color: " + color + "\n" +
                " whale: " + whale;
    }
}
