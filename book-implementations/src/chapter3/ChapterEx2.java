package chapter3;

public class ChapterEx2 {
    public static void main(String[] args) {
        //Suppose Dinosaurs need 0.4kg of food per 1kg of their body weight

        double dinoWeight = 152.12;
        double calculateFood =  dinoWeight * 0.4;

        System.out.println("The dinosaur's weight is " + dinoWeight + " and it needs " + calculateFood
        + "kg worth of food");
    }
}
