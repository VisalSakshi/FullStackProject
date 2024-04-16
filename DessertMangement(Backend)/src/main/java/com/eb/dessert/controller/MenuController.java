package com.eb.dessert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eb.dessert.model.Menu;
import com.eb.dessert.service.MenuService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "menu")
public class MenuController {
	@Autowired
	MenuService service;
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Menu createMenu(@RequestBody Menu menu) {
	
		return service.createMenu(menu);
		
	}
	@PutMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Menu updateMenu(@PathVariable ("id")int id,@RequestBody Menu m) {
		m.setId(id);
		return service.updateMenu(m);
		
	}
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<Menu> getAllMenu() 
	{
		return service.getALLMenu();
	}
	@DeleteMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)

	public String deleteMenu (@PathVariable("id")int id) 
 
	{
		return service.deleteMenu(id);
		
	}
	@GetMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Menu getMenuById(@PathVariable("id")int id)
	{
		return service.getMenuById(id);
		
	}
	
}
