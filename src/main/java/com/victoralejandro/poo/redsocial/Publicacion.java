package com.victoralejandro.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
	private String texto;
	private LocalTime hora;
	private int numeroLikes;

	public Publicacion(String texto) {
		this.texto = texto;
		this.hora = LocalTime.now();
		this.numeroLikes = 0;
	}

	public void mostrar() {
		System.out.println(texto + hora + numeroLikes);
	}

	public void darMeGusta() {
		numeroLikes += 1;
	}

	public int numeroLikes() {
		return numeroLikes;
	}
}