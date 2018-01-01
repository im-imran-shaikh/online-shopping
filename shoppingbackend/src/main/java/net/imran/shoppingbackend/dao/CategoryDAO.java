package net.imran.shoppingbackend.dao;

import java.util.List;

import net.imran.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category>list();
	Category get(int id);
}
