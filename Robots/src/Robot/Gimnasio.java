package Robot;

public class Gimnasio {

	/**
	 * Primero elegimos mediante un numero aleatorio entre 1 y 2 que robot ataca
	 * primero, una vez decidido comienza el combate de tal manera que siempre y
	 * cuando el ataque sea superior a la defensa se le resta ese valor a vida del
	 * robot que es atacado, en el caso de ser inferior, este "bloquea" el ataque.
	 * la defensa ha sido reducida a un numero aleatorio que como mucho sea 20, para
	 * que el combate sea mas frenetico y mas veloz.
	 * 
	 * @param robot2 parametro de ayuda que sirve para coger al segundo robot
	 * @throws InterruptedException
	 */
	public static Robot Pelear(Robot robot2, Robot robot1) {
//		Elegimos de manera aleatoria que robot ataca primero(si es 1 ataca this y si es 2 ataca el otro robot).
		int robotqueataca = (int) (Math.random() * 2);
		if (robotqueataca == 0) {
			while (robot1.vida > 0 && robot2.vida > 0) {

				if (robot1.ataque > robot2.defensa) {
					robot2.vida -= robot1.ataque;
				}
				robot1.ataque = (int) (Math.random() * 21);
				robot1.defensa = (int) (Math.random() * 21);

				if (robot2.ataque > robot1.defensa) {
					robot1.vida -= robot2.ataque;
				}
				robot2.ataque = (int) (Math.random() * 21);
				robot2.defensa = (int) (Math.random() * 21);
			}
		} else if (robotqueataca == 1) {

			while (robot1.vida > 0 && robot2.vida > 0) {

				if (robot2.ataque > robot1.defensa) {
					robot1.vida -= robot2.ataque;

				}
				robot2.ataque = (int) (Math.random() * 21);
				robot2.defensa = (int) (Math.random() * 21);

				if (robot1.ataque > robot2.defensa) {
					robot2.vida -= robot1.ataque;

				}
				robot1.ataque = (int) (Math.random() * 21);
				robot1.defensa = (int) (Math.random() * 21);
			}
		}
		if (robot1.vida < 0) {
			return robot2;
		} else
			return robot1;
	}
}
