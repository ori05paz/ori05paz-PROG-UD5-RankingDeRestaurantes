package org.ripadbaisor.hostelry.restaurants.util;

import javax.swing.JOptionPane;

public class Menu {

    
    public static int showMenu() {
        String menu = "Menú Principal\n\n" +
                    "1. Agregar restaurante\n" +
                    "2. Editar restaurante\n" +
                    "3. Mostrar restaurantes\n" +
                    "4. Eliminar restaurante\n" +
                    "Q. Salir del programa";
        String option = JOptionPane.showInputDialog(null, menu + "\n\nSelecciona una opción:");
        return Integer.parseInt(option);
    }
}

