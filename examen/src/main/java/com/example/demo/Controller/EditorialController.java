package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.Entities.Editorial;
import com.example.demo.Repository.EditorialRepository;

@Controller
public class EditorialController {
	
	@Autowired
	private EditorialRepository edirepo;
	
	@QueryMapping
	private List<Editorial> ListarEditorial(){
		return edirepo.findAll();
	}

}
