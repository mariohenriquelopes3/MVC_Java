package dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Home;

public class HomeDAO {

	public static List<Home> findAll() {
		final List<Home> lista = new ArrayList<Home>();
		lista.add(new Home("1"));
		lista.add(new Home("2"));
		lista.add(new Home("3"));
		return lista;
	}

}
