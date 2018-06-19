package com.rest.api.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.api.model.Aquario;
import com.rest.api.repository.Aquarios;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/aquarios")
public class AquarioResource {

	@Autowired
	private Aquarios aquarios;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Aquario>> listar() {
		return new ResponseEntity<List<Aquario>>(aquarios.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@RequestBody Aquario aquario){
		aquario = aquarios.save(aquario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(aquario.getCodigo()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarId(@PathVariable("id") 
		long id){
		
		Aquario aquario = aquarios.findById(id);
		
		if (aquario == null){
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(aquario);
		
	}
	
}
