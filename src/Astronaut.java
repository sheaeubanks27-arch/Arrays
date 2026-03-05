public class Astronaut {

    public String name;
    public int eyes;

    //todo: make a constructor for astronaut class that gives the instance variables some default values
    //todo: make a printInfo method that prints the info of our instance variables

    public Astronaut(){
        name = "joe";
        eyes = 2;
    }

    public void printInfo(){
        System.out.println("This astronaut's name is "+ name + ", and he has " + eyes +" eyes");
    }
}
