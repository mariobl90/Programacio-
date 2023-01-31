package Start;

import Robot.Gimnasio;
import Robot.Robot;

public class Start {

	public static void main(String[] args)  {
		
		Robot Daxter = new Robot("Daxter");
		Robot Hommer = new Robot("Hommer");	
		System.out.println(Daxter);
		System.out.println(Hommer);
		Gimnasio GYMFEL=new Gimnasio();
		GYMFEL.Pelear(Hommer, Daxter);
		Robot ganador=GYMFEL.Pelear(Hommer, Daxter);
		System.out.println(ganador);
	}
}
