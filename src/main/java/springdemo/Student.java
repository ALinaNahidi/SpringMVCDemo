package springdemo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private List<String> operatingSystems;

    private Map<String, String> listOfCountries;
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


    public Map<String, String> getListOfCountries() {
        return listOfCountries;
    }

    public void setListOfCountries(Map<String, String> listOfCountries) {
        this.listOfCountries = listOfCountries;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
