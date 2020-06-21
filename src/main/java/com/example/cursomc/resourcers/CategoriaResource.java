package com.example.cursomc.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursomc.domain.Categoria;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {

		@RequestMapping(method = RequestMethod.GET)
		public List<Categoria> listar () {
			
			Categoria cat1 = new Categoria (1,"Informartica");
			Categoria cat2 = new Categoria (2,"Escritorio");
			
			List<Categoria> list = new ArrayList<>();
			list.add(cat1);
			list.add(cat2);
			
			
			
			return list;
		}
}
