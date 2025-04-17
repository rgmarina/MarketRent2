package com.example.marketrent.models;

public enum ProductCategory {
    ELECTRONICS("Электроника"),
    FURNITURE("Мебель"),
    CLOTHING("Одежда"),
    VEHICLES("Транспорт"),
    REAL_ESTATE("Недвижимость"),
    SERVICES("Услуги"),
    JOBS("Работа"),
    FOR_HOME("Для дома"),
    FOR_CHILDREN("Детские товары"),
    SPORT("Спорт"),
    HOBBY("Хобби");

    private final String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}