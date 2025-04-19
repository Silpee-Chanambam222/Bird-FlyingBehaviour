public class Bird {
    private String name;
    private String color;
    private int weight;

    public Bird(String name, String color, int weight) {
        this.name = name;
        this.color=color;
        this.weight=weight;
    }

    public void eat() {
        System.out.println(name + "is eating.");
    }
    public void fly() {
        System.out.println(name + "is flying.");
    }
    public String getName() {
        return name;
    }
}

public class Crow extends Bird {
    public Crow(String name, String color, int weight) {
        super(name, color, weight);
    }

    public void saySomething() {
        System.out.println(getName() + "says: Caw Caw!");
    }
}

public class Sparrow extends Bird {
    public Sparrow(String name, String color, String weight) {
        super(name, color, weight);
    }

    public void saySomething() {
        System.out.println(getName() + "says: Chrip Chrip!");
    }
}

public class Main {
    public static void main(String[]args) {
        Crow crow = new Crow("Blackie", "Black, 2");
        Sparrow sparrow = new sparrow("Tiny", "Brown", 1);

        crow.eat();
        crow.fly();
        crow.saySomething();

        sparrow.eat();
        sparrow.fly();
        sparrow.saySomething();
    }
}

public interface FlyingBehaviour {
    void fly();
}

public class PigeonSparrowFlyingBehaviour implements Flyingbehaviour {
    @Override
    public void fly() {
        System.out.println("Flies in a flock with quick flaps.");
    }
}

public class CrowEagleFlyingBehaviour implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Flie high with steady wing beats.");
    }
}

public class NoFlyingBehaviour implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}

public class Bird {
    private String name;
    private String color;
    private int weight;
    protected FlyingBehaviour flyingBehaviour;

    public Bird(String name, String color, int weight) {
        this.name = name;
        this.color=color;
        this.weight=weight
    }
    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
    public void performly() {
        if (flyingBehaviour != null) {
            flyingBehaviour.fly();
        }
        else {
            System.out.println(name +" has no flying behaviour set.");
        }
    }
    public void eat() {
        System.out.println(name + "is eating.");
    }
    public Sting getNAme() {
        return name;
    }
}

public class Crow extends Bird {
    public Crow(String name, String color, int weight) {
        super(name, color, weight);
        setFlyingBehaviour(new CrowEagleFlyingBehaviour());
    }
    public void saySomething() {
        System.out.println(getName() +" says: Caw Caw!");
    }
}

public class Sparrow extends Bird {
    public Sparrow(String name, String color, int weight) {
        super(name, color, weight);
        setFlyingBehaviour(new PigeonSparrowFlyingBehaviour());
    }
    public void saySomething() {
        System.out.println(getName() +" says: Chrip Chrip!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird crow = new Crow("Blackie","Black", 2);
        Bird sparrow = new Sparrow("Tiny", "Brown", 1);

        crow.eat();
        crow.performFly();
        ((Crow) crow).saySomething();

        sparrow.eat();
        sparrow.performFly();
        ((sparrow) sparrow).saySomething();
    }
}