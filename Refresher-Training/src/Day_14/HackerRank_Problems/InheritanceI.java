package Day_14.HackerRank_Problems;

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}

public class InheritanceI {
    public static void main(String[] args) {
        Bird br = new Bird();
        br.fly();
        br.walk();
        br.sing();
    }
}
