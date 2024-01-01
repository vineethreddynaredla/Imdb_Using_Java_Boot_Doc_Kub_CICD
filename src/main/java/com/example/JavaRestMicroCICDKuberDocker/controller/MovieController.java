package com.example.JavaRestMicroCICDKuberDocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaRestMicroCICDKuberDocker.Model.Movie;
import com.example.JavaRestMicroCICDKuberDocker.service.MovieService;

@RestController
@RequestMapping("/Movies")
public class MovieController {

	@Autowired
	private MovieService ms;
	@GetMapping("/{id}")
	public ResponseEntity<Movie> getMovie(@PathVariable Long id) throws Exception{
		Movie mve;
			mve = ms.lookUp(id);
		return ResponseEntity.ok(mve);
	}
	@PostMapping
	public ResponseEntity<Movie> createMovie(@RequestBody Movie mve) {
		Movie movie = ms.create(mve);
		return ResponseEntity.ok(movie);
	}
	@PutMapping("{id}")
	public void updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
		ms.update(id, movie);
	}
	@DeleteMapping("{id}")
	public void deleteMovie(@PathVariable Long id) {
		ms.deleteMovie(id);
	}
	
}
