package org.ripadbaisor.hostelry.restaurants.management;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RestaurantManager {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static void addRestaurant(String name2, String location2, String schedule2, int score2) {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del restaurante:");
        String location = JOptionPane.showInputDialog("Ingrese la localización del restaurante:");
        String schedule = JOptionPane.showInputDialog("Ingrese el horario del restaurante:");
        int score = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la puntuación del restaurante (entre 0 y 10):"));
        addRestaurant(name, location, schedule, score);
    }

}