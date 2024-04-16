package com.eb.dessert.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.dessert.exception.MenuResource;
import com.eb.dessert.model.Menu;
import com.eb.dessert.repository.MenuRepository;



@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	
	MenuRepository repo;
	@Override
	public Menu createMenu(Menu m) {
		
		return repo.save(m);
	}

	@Override
	public Menu updateMenu(Menu m) {
		Optional<Menu>menu=repo.findById(m.getId());
		if(menu.isPresent())
		{
			Menu updateMenu = menu.get();
			updateMenu.setId(m.getId());
			updateMenu.setItemName(m.getItemName());
			updateMenu.setQty(m.getQty());
			updateMenu.setPrice(m.getPrice());
			updateMenu.setUsername(m.getUsername());
			updateMenu.setPassword(m.getPassword());
			repo.save(updateMenu);
			return updateMenu;
		}
		else
		{
			throw new MenuResource ("Searching id is not available");
		}
	}

	@Override
	public List<Menu> getALLMenu() {
		
		return repo.findAll();
	}

	@Override
	public Menu getMenuById(int id) {
		Optional<Menu>menu = repo.findById(id);
		if(menu.isPresent())
		{
			return menu.get();
		}
		else
		{
			throw new MenuResource ("Searching id is not available");
		}
		
	}

	@Override
	public String deleteMenu(int id) {
		
		Optional <Menu>menu = repo.findById(id);
		if(menu.isPresent())
		{
			repo.delete(menu.get());
		}
		else
		{
			throw new MenuResource ("Searching id is not available");
		}
		return "id deleted";
	}

	

}
