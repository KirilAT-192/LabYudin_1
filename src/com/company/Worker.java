package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Worker {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String gender;
    private LocalDateTime date;

    public Worker(String surname, String name, String patronymic, String position, String gender, LocalDateTime date) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.gender = gender;
        this.setDate(date);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        if (date.getYear() <= LocalDateTime.now().getYear()) {
            this.date = date;
        }
    }

    public static Worker generate(){
        Random r = new Random();
        return new Worker(Dictionary.getSurnames()[r.nextInt(Dictionary.getSurnames().length)],
                Dictionary.getNames()[r.nextInt(Dictionary.getNames().length)],
                Dictionary.getPatronymics()[r.nextInt(Dictionary.getPatronymics().length)],
                Dictionary.getPositions()[r.nextInt(Dictionary.getPositions().length)],
                Dictionary.getGenders()[r.nextInt(Dictionary.getGenders().length)],
                LocalDateTime.of(r.nextInt(15)+2006, r.nextInt(12)+1, r.nextInt(28)+1, 0, 0));
    }

    @Override
    public String toString() {
        return "\n\nРаботник{\n" +
                "\nФамилия: " + surname +
                "\nИмя: " + name +
                "\nОтчество: " + patronymic +
                "\nДолжность: " + position +
                "\nПол: " + gender +
                "\nДата приёма на работу: " + date.format(DateTimeFormatter.ofPattern("d.M.y")) +
                "\n}";
    }
}
