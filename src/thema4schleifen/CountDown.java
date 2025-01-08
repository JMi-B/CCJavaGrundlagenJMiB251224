package thema4schleifen;

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int countdown  = 10;
		while(countdown > 0){
		
		System.out.println("Noch " + countdown + " Sekunden...");
		countdown --;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
 System.out.println("Start!");
}
	}
