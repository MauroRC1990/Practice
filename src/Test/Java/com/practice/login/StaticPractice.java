package Test.Java.com.practice.login;

public class StaticPractice {
    public static void main(String[] args) {
        System.out.println("Value of variable in class " + Person.age);
        System.out.println("Value of variable in class " + Animal.age);
        System.out.println("Value of variable in class " + Alien.age);

        Person.increaseAge();
        Person pirulo = new Person();
        System.out.println("Pirulo is " + pirulo.getNumberValue() + " years old");
        System.out.println("Pirulo is a " + pirulo.getRace());
        Person pedro = new Person();
        System.out.println("Pedro is " + pedro.getNumberValue() + " years old");
        System.out.println("Pedro is a " + pedro.getRace());

        Animal.increaseAge();
        Animal firulais = new Animal();
        System.out.println("Firulais is " + firulais.getNumberValue() + " years old");
        System.out.println("Firulais is a " + firulais.getMotionType());
        Animal stampy = new Animal();
        System.out.println("Stampy is " + stampy.getNumberValue() + " years old");
        System.out.println("Stampy is a " + stampy.getMotionType());

        Alien.increaseAge();
        Alien xenomorph = new Alien();
        System.out.println("Xenomorph is " + xenomorph.getNumberValue() + " years old");
        System.out.println("Xenomorph is a " + xenomorph.getRace());
        Alien.race = "Hivemind";
        Alien zerg = new Alien();
        System.out.println("The Zerg are " + zerg.getNumberValue() + " years old");
        System.out.println("The Zerg are a " + zerg.getRace());
    }
}
