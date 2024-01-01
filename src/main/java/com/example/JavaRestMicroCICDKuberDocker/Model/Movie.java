package com.example.JavaRestMicroCICDKuberDocker.Model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
//In the context of your Movie class, you may encounter issues with serialization due to Hibernate proxies when the entity is being serialized to JSON. 
//To handle this, you can use the @JsonIgnoreProperties annotation on the class to ignore specific properties during serialization. 
//Specifically, you can ignore the hibernateLazyInitializer property, which is commonly the cause of these issues.
public class Movie {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String director;
	
	@ElementCollection
	private List<String> actors = new  ArrayList<>();
	
}
