package org.ripadbaisor.hostelry.restaurants.management;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RestaurantManager {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static String askMessage(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public static int askNumber(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(message);
                return Integer.parseInt(input);
        }
    }

    public static void addRestaurant(String name, String location, String schedule, float score) {
        Restaurant restaurant = new Restaurant(name, location, schedule, score);
        restaurants.add(restaurant);
        JOptionPane.showMessageDialog(null, "Restaurante añadido correctamente.");
    }

    public static void addRestaurant() {
        String name = askMessage("Ingrese el nombre del restaurante:");
        String location = askMessage("Ingrese la localización del restaurante:");
        String schedule = askMessage("Ingrese el horario del restaurante:");
        float score = askNumber("Ingrese la puntuación del restaurante (entre 0 y 10):");


        addRestaurant(name, location, schedule, score);
    }

}