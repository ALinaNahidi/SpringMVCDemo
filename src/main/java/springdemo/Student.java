package springdemo;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private ArrayList<String> operatingSystems;

    private LinkedHashMap<String, String> listOfCountries;
    public Student() {
        listOfCountries = new LinkedHashMap<>();
        listOfCountries.put("IN","india");
        listOfCountries.put("BR","brazil");
        listOfCountries.put("SUD","saudi");
        listOfCountries.put("DUB","dubai");
        listOfCountries.put("TUR","turkey");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LinkedHashMap<String, String> getListOfCountries() {
        return listOfCountries;
    }

    public void setListOfCountries(LinkedHashMap<String, String> listOfCountries) {
        this.listOfCountries = listOfCountries;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public ArrayList<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(ArrayList<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
