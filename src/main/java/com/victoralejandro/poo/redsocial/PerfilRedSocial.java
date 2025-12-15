package com.victoralejandro.poo.redsocial;

public class PerfilRedSocial {
	private String nombreUsuario;
	private String nombreVisible;
	private String biografia;
	private String ciudad;
	private int numeroSeguidores;
	private int numeroPublicaciones;
	private EstadoPerfil estadoActual;
	private boolean cuentaVerificada;

	public void mostrarInformacion() {
		System.out.println(nombreUsuario + nombreVisible + biografia + ciudad + numeroSeguidores + numeroPublicaciones
				+ estadoActual + cuentaVerificada);
	}

	public void anadirSeguidores(int numeroSeguidores, int nuevosSeguidores) {
		this.numeroSeguidores += nuevosSeguidores;
	}
	
	public void estadoPerfil(EstadoPerfil estadoActual, EstadoPerfil estado){
		if (estado == estado.ACTIVADA) {
			estadoActual = EstadoPerfil.ACTIVADA; 
		}else if (estado == EstadoPerfil.DESACTIVADA) {
			estadoActual = EstadoPerfil.DESACTIVADA; 
		}else {
			estadoActual = EstadoPerfil.BLOQUEADA; 
		}
	}
	
	public boolean cuentaVerificada()
	
	
}