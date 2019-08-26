package se.lexicon;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // String[] cars={"Volvo","Saab 900,"Audi 54", "Tesla Model 3"};
        String[] cars = new String[4];

        cars[0] = "Volvo 740";
        cars[1] = "Saab 900";
        cars[2] = "Audi 54";
        cars[3] = "Tesla Model 3";

        System.out.println("Hello GitHub");
        System.out.println("Here is my first update to my repo");
        System.out.println("------------Cars List---------------------");
/*
        for (int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
    }
    */
for(String aCar:cars) {
    System.out.println(aCar);
}
    }//End Main
}// End of App
