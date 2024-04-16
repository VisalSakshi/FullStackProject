package com.eb.dessert.service;

import java.util.List;

import com.eb.dessert.model.Menu;



public interface MenuService {
	Menu createMenu(Menu m);
	Menu updateMenu(Menu m);
	List<Menu>getALLMenu();
	String deleteMenu(int id);
	Menu getMenuById(int id);
}
