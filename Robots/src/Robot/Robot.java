package Robot;

public class Robot {

	private String nombre;
	protected int vida;
	protected int ataque;
	protected int defensa;

	/**
	 * Los setters y getters de la operacion los cuales los getters son necesarios
	 * todos y de los setters solo hace falta el del nombre por si queremos
	 * cambiarle el nombre a cualquier robot que creemos y de la vida no
	 * necesitasmos ya que siempre sera 100 a no ser que le ataquen y le resten la
	 * vida y el ataque y la defensa siempre seran un numero aleatorio que sera
	 * cambiado constantemente por un math.random...
	 * 
	 * @return devuelve el nombre o los puntos de cualquier atributo.
	 */

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Robot [nombre=" + nombre + "\n" + ", vida=" + vida + "\n" + ", ataque=" + ataque + "\n" + ", defensa="
				+ defensa + "]";
	}

	public Robot(String nombre) {

		this.nombre = nombre;
		this.vida = 100;
		this.ataque = (int) (Math.random() * 21);
		this.defensa = (int) (Math.random() * 101);
	}


	// if reducido para preguntas pequeñas.
	/* turno=(turno==0)?1:0 */
}
