package com.unu.WebProject.models;

import java.util.*;

import com.unu.WebProject.beans.*;

public class AutoresModel {

	public List<Autor> LISTA_AUTORES() {

		ArrayList<Autor> autores = new ArrayList<Autor>();
		autores.add(new Autor(1, "Garcia Marquez", "Colombiano"));
		autores.add(new Autor(2, "Borges", "Argentino"));
		autores.add(new Autor(3, "Allende", "Chileno"));

		return autores;
	}

}
