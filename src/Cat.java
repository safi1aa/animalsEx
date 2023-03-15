public class Cat {
    String name;
    int whale;
    String color;
    int age;

    public Cat (String name,int whale,String color,int age){
        this.name = name;
        this.whale = whale;
        this.color = color;
        this.age = age;
    }
    public Cat (){

    }

    @Override
    public String toString() {
        return "Cat\n" +
                "name: " + name + "\n" +
                " whale: " + whale +"\n"+
                " color: " + color + "\n" +
                " age: " + age;
    }
}
