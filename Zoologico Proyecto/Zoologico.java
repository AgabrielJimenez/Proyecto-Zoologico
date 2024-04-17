/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologicomain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author SIMAN
 */
class Zoologico {

    private List<Animal> animales;
    private Map<String, String> habitats;

    public Zoologico() {
        this.animales = new ArrayList<>();
        this.habitats = new HashMap<>();
        // Datos precargados
        habitats.put("Savannah", "Espacio abierto con pasto y árboles");
        habitats.put("Selva", "Área con vegetación densa y húmeda");
        habitats.put("Acuario", "Espacio acuático para animales marinos");
    }

    public void agregarAnimal(String nombre, String especie, int edad, String habitat) {
        animales.add(new Animal(nombre, especie, edad, habitat));
    }

    public String listarAnimales() {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : animales) {
            sb.append(animal.toString()).append("\n");
        }
        return sb.toString();
    }

    public String obtenerDescripcionHabitat(String habitat) {
        return habitats.getOrDefault(habitat, "Hábitat desconocido");
    }
}
