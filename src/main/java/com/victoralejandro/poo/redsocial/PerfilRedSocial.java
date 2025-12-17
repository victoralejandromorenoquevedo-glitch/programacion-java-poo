package com.victoralejandro.poo.redsocial;

import java.util.ArrayList;

public class PerfilRedSocial {
	private String nombreUsuario;
	private String nombreVisible;
	private String biografia;
	private String ciudad;
	private int numeroSeguidores;
	private int numeroPublicaciones;
	private EstadoPerfil estadoActual;
	private boolean cuentaVerificada;
	private ArrayList <Publicaciones> listaPublicaciones;

	public void mostrarInformacion() {
		System.out.println(nombreUsuario + nombreVisible + biografia + ciudad + numeroSeguidores + numeroPublicaciones
				+ estadoActual + cuentaVerificada);
	}

	public void anadirSeguidores(int nuevosSeguidores) {
		this.numeroSeguidores += nuevosSeguidores;
	}
	
	public void estadoPerfil(EstadoPerfil estadoActual, EstadoPerfil estado){
		if (estado == estado.ACTIVADA) {
			estadoActual = estado.ACTIVADA; 
		}else if (estado == estado.DESACTIVADA) {
			estadoActual = estado.DESACTIVADA; 
		}else {
			estadoActual = estado.BLOQUEADA; 
		}
	}
	
	public void cuentaVerificada (boolean cuentaVerfificada) {
		if (cuentaVerificada) {
			cuentaVerificada = true;
		}else {
			cuentaVerificada = false;
		}
	}
	
	public void crearPublicacion (String texto) {
		Publicaciones publicacion = new Publicaciones(texto);
		this.listaPublicaciones.add(publicacion);
	}
	
}