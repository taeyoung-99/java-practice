package chapter3;

public class Project {
    public static void main(String[] args) {
        /*
        Assuming that the dino needs to eat 5% of it's
        body weight daily
         */
        double dinoWeight = 2508.23; // In kg
        double calcFood = dinoWeight * 0.05;

        int numFeeding = 2;

        System.out.println("Our " + dinoWeight + "kg dinosaur needs to eat " +
                calcFood + "kg daily, which means we need to serve " + (calcFood / numFeeding)
                + "kg per feeding.");
    }
}
