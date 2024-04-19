import javax.swing.JOptionPane;

import org.ripadbaisor.hostelry.restaurants.management.RestaurantManager;
import org.ripadbaisor.hostelry.restaurants.util.Menu;

public class App {
    public static void main(String[] args) {
        int option;
        do {
            option = Menu.showMenu();
            try {
                switch (option) {
                    case 1:
                        RestaurantManager.addRestaurant();
                        break;
                    case 2:
                        RestaurantManager.updateRestaurant();
                        break;
                    case 3:
                        RestaurantManager.showRestaurants();
                        break;
                    case 4:
                        RestaurantManager.deleteRestaurants();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elige una opción válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número entero válido");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error: Valor nulo.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error: Argumento ilegal");
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Error: Índice fuera de límites");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            }
        } while (option != 5);
    }
}