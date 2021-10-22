package com.company;

public class Dictionary {
    private static String[] manufacturers = {
            "Apple",
            "Samsung",
            "Xiaomi",
            "Meizu",
            "LG",
            "Lenovo",
            "Sony"
    };

    public static String[] getManufacturers() {
        return manufacturers;
    }

    public static void setManufacturers(String[] manufacturers) {
        Dictionary.manufacturers = manufacturers;
    }

    private static String[] surnames = {
            "Иванов",
            "Крюкова",
            "Воробьёв",
            "Дудник",
            "Медведев"
    };

    public static String[] getSurnames() {
        return surnames;
    }

    public static void setSurnames(String[] surnames) {
        Dictionary.surnames = surnames;
    }

    private static String[] names = {
            "Александр",
            "Ольга",
            "Иван",
            "Андрей",
            "Дмитрий"
    };

    public static String[] getNames() {
        return names;
    }

    public static void setNames(String[] names) {
        Dictionary.names = names;
    }

    private static String[] patronymics = {
            "Александрович",
            "Петровна",
            "Леонидович",
            "Романович",
            "Анатольевич"
    };

    public static String[] getPatronymics() {
        return patronymics;
    }

    public static void setPatronymics(String[] patronymics) {
        Dictionary.patronymics = patronymics;
    }

    private static String[] positions = {
            "Астроном",
            "Программист",
            "Дзюдоист",
            "Инженер",
            "Таксист"
    };

    public static String[] getPositions() {
        return positions;
    }

    public static void setPositions(String[] positions) {
        Dictionary.positions = positions;
    }

    private static String[] genders = {
            "Мужской",
            "Женский"
    };

    public static String[] getGenders() {
        return genders;
    }

    public static void setGenders(String[] genders) {
        Dictionary.genders = genders;
    }
}