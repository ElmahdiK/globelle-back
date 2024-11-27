package com.globelle.back.model;

public enum Categories {
    MANICURE("Manicure"),
    HAIRDRESSER("Hairdresser"),
    BARBER("Barber"),
    EPILATION("Epilation"),
    MAKEUP("Makeup"),
    SPA_MASSAGE("Spa & Massage"),
    LASHES_BROWS("Lashes & Brows");

    private final String text;

    Categories(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}