package com.example.JavaRestMicroCICDKuberDocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaRestMicroCICDKuberDocker.Model.Movie;
import com.example.JavaRestMicroCICDKuberDocker.exception.MovieNotFoundException;
import com.example.JavaRestMicroCICDKuberDocker.repository.MovieRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional 
public class MovieService {
	@Autowired
	private MovieRepository mr;
	
	public Movie create(Movie movie) {
		if(movie == null) {
			throw new RuntimeException("Movie Not Found");
		}
		return mr.save(movie);
	}
	public Movie lookUp(Long id) throws Exception{
		Movie mve;
		if(id == null) {
			throw new MovieNotFoundException("Id Not Found");
		}
		if(mr.existsById(id)) {
			mve = mr.getReferenceById(id);
		}else {
			throw new MovieNotFoundException("Not Found");
		}
		return mve;
	}
	public void update(Long id, Movie update) {
		if(id == null || update == null) {
			throw new RuntimeException("Invalid");
		}
		if(mr.existsById(id)) {
			Movie movie = mr.getReferenceById(id);
			movie.setName(update.getName());
			movie.setDirector(update.getDirector());
			movie.setActors(update.getActors());
			mr.save(movie);
		}else {
			throw new RuntimeException("Not Found");
		}
		
	}
	public void deleteMovie(Long id) {
		if(id == null) {
			throw new RuntimeException("Id Or Movie Not Found");
		}
		if(mr.existsById(id)) {
			mr.deleteById(id);
		} else {
			throw new RuntimeException("Not Found");
		}
		
	}
}
