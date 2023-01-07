package Robot;

import java.util.concurrent.TimeUnit;

public class Robot {

	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;

	/**
	 * Los setters y getters de la operacion los cuales los getters son necesarios
	 * todos y de los setters solo hace falta el del nombre por si queremos
	 * cambiarle el nombre a cualquier robot que creemos y ded la vida no
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
		this.ataque = (int) (Math.random() * 20);
		this.defensa = (int) (Math.random() * 100);
	}

	/**
	 * Primero elegimos mediante un numero aleatorio entre 1 y 2 que robot ataca
	 * primero, una vez decidido comienza el combate de tal manera que siempre y
	 * cuando el ataque sea superior a la defensa se le resta ese valor a vida del
	 * robot que es atacado, en el caso de ser inferior, este "bloquea" el ataque.
	 * la defensa ha sido reducida a un numero aleatorio que como mucho sea 20, para
	 * que el combate sea mas frenetico y mas veloz. Ademas tenemos un booleano que
	 * nos ayuda para cuamdo se termine el combate, siempre salga por pantalla lo
	 * mismo
	 *
	 * 
	 * @param robot2 parametro de ayuda que sirve para coger al segundo robot
	 * @throws InterruptedException
	 */
	public void Pelear(Robot robot2) throws InterruptedException {
//		Elegimos de manera aleatoria que robot ataca primero(si es 1 ataca this y si es 2 ataca el otro robot).
		int robotqueataca = (int) Math.random();
		if (robotqueataca == 0) {
			while (this.vida > 0 && robot2.vida > 0) {
				TimeUnit.SECONDS.sleep(2);
				if (this.ataque > robot2.defensa) {
					robot2.vida -= this.ataque;
				}
				this.ataque = (int) (Math.random() * 20);
				this.defensa = (int) (Math.random() * 20);
				TimeUnit.SECONDS.sleep(2);
				if (robot2.ataque > this.defensa) {
					this.vida -= robot2.ataque;
				}
				robot2.ataque = (int) (Math.random() * 20);
				robot2.defensa = (int) (Math.random() * 20);
			}
		} else if (robotqueataca == 1) {

			while (this.vida > 0 && robot2.vida > 0) {
				TimeUnit.SECONDS.sleep(2);
				if (robot2.ataque > this.defensa) {
					this.vida -= robot2.ataque;

				}
				robot2.ataque = (int) (Math.random() * 20);
				robot2.defensa = (int) (Math.random() * 20);

				TimeUnit.SECONDS.sleep(2);
				if (this.ataque > robot2.defensa) {
					robot2.vida -= this.ataque;

				}
				this.ataque = (int) (Math.random() * 20);
				this.defensa = (int) (Math.random() * 20);
			}
		}
	}
}
