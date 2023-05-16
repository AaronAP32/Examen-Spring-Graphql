package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.Entities.Libro;
import com.example.demo.Repository.LibroRepository;

@Controller
public class LibroController {
	
	@Autowired
	private LibroRepository librepo;
	
	@QueryMapping
	private List<Libro> ListarLibro(){
		return librepo.findAll();
	}
	
	

}
