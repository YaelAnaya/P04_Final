/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yael.ao.p04;

import javax.swing.*;
/**
 * Esta clase modela cualquier estado perteneciente a una nación.
 * */
public class State implements Comparable<State> {
    private String name;
    private String capital;
    private ImageIcon coatOfArms;
    private int territorialExtension;
    private int fundationYear;

    public State(String name, String capital, int fundationYear, int territorialExtension, ImageIcon coatOfArms) {
        this.name = name;
        this.capital = capital;
        this.coatOfArms = coatOfArms;
        this.territorialExtension = territorialExtension;
        this.fundationYear = fundationYear;
    }

    /**
     * Getters de los atributos de la clase.
     * */

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public ImageIcon getCoatOfArms() {
        return coatOfArms;
    }

    public int getTerritorialExtension() {
        return territorialExtension;
    }

    public int getFundationYear() {
        return fundationYear;
    }

    /**
     * Este método devuelve una cadena de texto con los datos del estado, utilizando
     * etiquetas pertenecientes al lenguaje HTML.
     * */

    public String toString() {
        return ("<html>"
                + "Estado: " + name + "<br>"
                + "Capital: " + capital + "<br>"
                + "Año de su Fundación: " + fundationYear + "<br>"
                + "Extensión territorial: " + territorialExtension + " km<sup>2</sup> <br>"
                + "</html>");
    }

    /**
     * Este método compara dos estados por el nombre.
     * */
    @Override
    public int compareTo(State o) {
        return this.name.compareTo(o.name);
    }
}
