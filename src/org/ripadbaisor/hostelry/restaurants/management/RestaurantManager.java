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

}