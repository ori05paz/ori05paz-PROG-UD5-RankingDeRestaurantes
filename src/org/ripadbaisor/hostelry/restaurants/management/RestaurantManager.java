package org.ripadbaisor.hostelry.restaurants.management;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RestaurantManager {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();


    public static void addRestaurant(String name, String location, String schedule, int score) {
        Restaurant restaurante = new Restaurant(name, location, schedule, score);
        restaurants.add(restaurante);
        JOptionPane.showMessageDialog(null, "Restaurante añadido correctamente.");
    }
}