package org.ripadbaisor.hostelry.restaurants.management;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RestaurantManager {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static void addRestaurant(String name2, String location2, String schedule2, int score2) {
        String name = JOptionPane.showInputDialog("Ingrese el nagetName del restaurante:");
        String location = JOptionPane.showInputDialog("Ingrese la localización del restaurante:");
        String schedule = JOptionPane.showInputDialog("Ingrese el horario del restaurante:");
        int score = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la puntuación del restaurante (entre 0 y 10):"));
        addRestaurant(name, location, schedule, score);
    }

    public static void updateRestaurant() {
        if (restaurants.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurants almacenados para editar.");
            return;
        }

        String[] namesRestaurants = new String[restaurants.size()];
        for (int i = 0; i < restaurants.size(); i++) {
            namesRestaurants[i] = restaurants.get(i).getName();
        }

        String restaurantSelected = (String) JOptionPane.showInputDialog(null, "Selecciona el restaurante a editar:", "Editar Restaurante", JOptionPane.QUESTION_MESSAGE, null, namesRestaurants, namesRestaurants[0]);
        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).getName().equals(restaurantSelected)) {
                String newName = JOptionPane.showInputDialog("Ingrese el nuevo nagetName del restaurante:");
                String newLocation = JOptionPane.showInputDialog("Ingrese la nueva localización del restaurante:");
                String newSchedule = JOptionPane.showInputDialog("Ingrese el nuevo horario del restaurante:");
                int newScore = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva puntuación del restaurante (entre 0 y 10):"));

                Restaurant restaurant = restaurants.get(i);
                restaurant.setName(newName);
                restaurant.setLocation(newLocation);
                restaurant.setSchedule(newSchedule);
                restaurant.setScore(newScore);

                JOptionPane.showMessageDialog(null, "Restaurante editado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el restaurante SelectedrestaurantSelected.");
    }

}