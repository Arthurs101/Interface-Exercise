/******************************************************************
Media.java
Autor: Adrian Fulladolsa Palma y Arturo Heberto Argueta Avila
Última modificación: 2021-11-09
Interfaz para objetos que pueden tomar fotos y mostrar videos.
******************************************************************/
interface Media {
	
	//Metodo abstracto que representa el dispositivo tomando una fotografia
	public String tomarFotos();	
	
	//Metodo abstracto que representa el dispositivo mostrando un video
	public String playVideo();
}