package Robot;

public class Start {

	public static void main(String[] args)  {
		
		Robot Daxter = new Robot("Daxter");
		Robot Hommer = new Robot("Hommer");	
		System.out.println(Daxter);
		System.out.println(Hommer);
		Gimnasio.Pelear(Hommer, Daxter);
		Robot ganador=Gimnasio.Pelear(Hommer, Daxter);
		System.out.println(ganador);
	}
}
