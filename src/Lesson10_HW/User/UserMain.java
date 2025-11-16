package Lesson10_HW.User;

import java.util.Scanner;

public class UserMain implements Cloneable {
    private int idUser;
    private String name;
    private String surName;
    private int age;
    private String job;
    private Car car;
    private Apartment apartment;

    public UserMain(int idUser,String name, String surName, int age, String job, Car car, Apartment apartment){
        this.idUser = idUser;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.job = job;
        this.car = car;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "\nUser: " +
                "\n\tName: " + name  +
                "\n\tsurName: " + surName +
                "\n\tage: " + age +
                "\n\tjob: "+ job +
                "\n\tcar: " + car +
                "\n\tapartment: " + apartment;
    }

    @Override
    public int hashCode() {
        return age*99;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){return true;}
        if (obj == null || obj.getClass() != this.getClass()) {return false;}
        UserMain user = (UserMain) obj;
        return idUser == user.idUser && name.equals(user.name) && surName.equals(user.surName) && age == user.age
                && job.equals(user.job) && car.equals(user.car) && apartment.equals(user.apartment);
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public Car getCar() {
        return car;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    public UserMain clone() {
        try {
            UserMain clone = (UserMain) super.clone();
            clone.car = (Car) car.clone();
            clone.apartment = (Apartment) apartment.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public UserMain cloneSuper() {
        try {
            UserMain clone = (UserMain) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
