package com.example.obspringdatajpa;

import javax.persistence.*;

@Entity
public class Coche {

    // Atributos encapsulados (como norm general aplicaremos
    // encapsulación en todos los atributos de las clases
    // para que a través de metodos getter y setter, podamos controlar
    // como se modifican los valores de estos atributos).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacturer;
    private String model;
    private Integer anio;

    // Constructores
    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer anio) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.anio = anio;
    }

    // Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    // To String
    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", anio=" + anio +
                '}';
    }
}
