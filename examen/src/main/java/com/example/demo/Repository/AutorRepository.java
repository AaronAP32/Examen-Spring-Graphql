package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
