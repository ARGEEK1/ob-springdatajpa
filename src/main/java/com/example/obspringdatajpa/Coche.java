package com.example.obspringdatajpa;

public class Coche {

    // Atributos encapsulados (como norm general aplicaremos
    // encapsulación en todos los atributos de las clases
    // para que a través de metodos getter y setter, podamos controlar
    // como se modifican los valores de estos atributos).
    private Long id;
    private String manufacturer;
    private String model;
    private Integer year;

    // Constructores
    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer year) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    // To String
    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
