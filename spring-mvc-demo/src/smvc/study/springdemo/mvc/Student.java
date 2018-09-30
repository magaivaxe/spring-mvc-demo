package smvc.study.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	// Fields
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	private String [] systems;
	// Dictionary to countries
	private LinkedHashMap<String, String> countryOptions;
	// Dictionary to languages
	private LinkedHashMap<String, String> languageOptions;
	// LinkedHashMap to CheckBoxes
	private LinkedHashMap<String, String> systemOptions;
	
	// Constructors
	public Student() {
		//
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("CA", "Canada");
		
		languageOptions = new LinkedHashMap<>();
		languageOptions.put("Java", " Java ");
		languageOptions.put("C#", " C# ");
		languageOptions.put("PHP", " PHP ");
		languageOptions.put("Ruby", " Ruby ");
		languageOptions.put("Javascript", " Javascript ");
		
		systemOptions = new LinkedHashMap<>();
		systemOptions.put("Windows", " Windows ");
		systemOptions.put("Linux", " Linux ");
		systemOptions.put("MacOS", " MacOS ");
	}
	// Getters and Setters
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}
	public String[] getSystems() {
		return systems;
	}
	public void setSystems(String[] systems) {
		this.systems = systems;
	}
	public LinkedHashMap<String, String> getSystemOptions() {
		return systemOptions;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
	
}
