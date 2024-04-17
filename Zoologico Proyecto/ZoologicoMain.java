/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoologicomain;

import javax.swing.JOptionPane;

/**
 *
 * @author SIMAN
 */
public class ZoologicoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

       
        zoologico.agregarAnimal("León", "Panthera leo", 5, "Savannah");
        zoologico.agregarAnimal("Oso perezoso", "Bradypus variegatus", 7, "Selva");
        zoologico.agregarAnimal("Ajolote", "Ambystoma mexicanum Ajolote oro", 2, "Acuario");

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "----- Menú Principal -----\n"
                    + "1. Agregar animal\n"
                    + "2. Listar animales\n"
                    + "3. Obtener descripción de hábitat\n"
                    + "0. Salir\n"
                    + "Seleccione una opción:"));

            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre del animal:");
                    String especie = JOptionPane.showInputDialog("Especie del animal:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del animal:"));
                    String habitat = JOptionPane.showInputDialog("Habitat del animal:");
                    zoologico.agregarAnimal(nombre, especie, edad, habitat);
                    JOptionPane.showMessageDialog(null, "Animal agregado correctamente.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Lista de animales:\n" + zoologico.listarAnimales());
                    break;
                case 3:
                    String habitatConsulta = JOptionPane.showInputDialog("Ingrese el nombre del hábitat:");
                    String descripcionHabitat = zoologico.obtenerDescripcionHabitat(habitatConsulta);
                    JOptionPane.showMessageDialog(null, "Descripción del hábitat:\n" + descripcionHabitat);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
