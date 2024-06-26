package org.ripadbaisor.hostelry.restaurants.management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;


public class RestaurantManager {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static void addRestaurant() {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del restaurante:");
        String location = JOptionPane.showInputDialog("Ingrese la localización del restaurante:");
        String schedule = JOptionPane.showInputDialog("Ingrese el horario del restaurante:");
        int score = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la puntuación del restaurante (entre 0 y 10):"));
        addRestaurant(name, location, schedule, score);
    }

    public static void updateRestaurant() {
        if (restaurants.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurantes almacenados para editar.");
            return;
        }

        String[] namesRestaurants = new String[restaurants.size()];
        for (int i = 0; i < restaurants.size(); i++) {
            namesRestaurants[i] = restaurants.get(i).getName();
        }

        String restaurantSelected = (String) JOptionPane.showInputDialog(null, "Selecciona el restaurante a editar:", "Editar Restaurante", JOptionPane.QUESTION_MESSAGE, null, namesRestaurants, namesRestaurants[0]);
        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).getName().equals(restaurantSelected)) {
                String newName = JOptionPane.showInputDialog("Ingrese el nuevo nombre del restaurante:");
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
        JOptionPane.showMessageDialog(null, "No se encontró el restaurante seleccionado.");
    }


    public static void showRestaurants() {
        if (restaurants.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurantes almacenados.");
            return;
        }

        Collections.sort(restaurants, Comparator.comparing(Restaurant::getScore).reversed());

        String message = "Lista de restaurants:\n";
        for (Restaurant restaurant : restaurants) {
            message += "Nombre: " + restaurant.getName() + "\n";
            message += "Localización: " + restaurant.getLocation() + "\n";
            message += "Horario: " + restaurant.getSchedule() + "\n";
            message += "Puntuación: " + restaurant.getScore() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static void deleteRestaurants() {
        if (restaurants.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurantes almacenados para eliminar.");
            return;
        }

        String[] namesRestaurants = new String[restaurants.size()];
        for (int i = 0; i < restaurants.size(); i++) {
            namesRestaurants[i] = restaurants.get(i).getName();
        }

        String restaurantSelected = (String) JOptionPane.showInputDialog(null, "Selecciona el restaurante a eliminar:", "Eliminar Restaurante", JOptionPane.QUESTION_MESSAGE, null, namesRestaurants, namesRestaurants[0]);
        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).getName().equals(restaurantSelected)) {
                restaurants.remove(i);
                JOptionPane.showMessageDialog(null, "Restaurante eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el restaurante seleccionado.");
    }


    private static void addRestaurant(String name, String location, String schedule, float score) {
        Restaurant restaurant = new Restaurant(name, location, schedule, score);
        restaurants.add(restaurant);
    }

    public static List<Restaurant> getRestaurants() {
        return restaurants;
    }

}