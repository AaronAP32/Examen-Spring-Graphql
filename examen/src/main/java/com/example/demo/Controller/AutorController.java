package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.Entities.Autor;
import com.example.demo.Repository.AutorRepository;

@Controller
public class AutorController {
	
	@Autowired
	private AutorRepository autorrepo;
	
	
	@QueryMapping
	public List<Autor> ListarAutor(){
		return autorrepo.findAll();
	}

}
