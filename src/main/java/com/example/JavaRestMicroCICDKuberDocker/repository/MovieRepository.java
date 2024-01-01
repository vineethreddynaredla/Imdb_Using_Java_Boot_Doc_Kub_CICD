package com.example.JavaRestMicroCICDKuberDocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaRestMicroCICDKuberDocker.Model.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
