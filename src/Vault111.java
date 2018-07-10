import java.util.Random;

public class Vault111 {
	int secretcode1;
Vault111(){
	Random randy = new Random();
	secretcode1 =randy.nextInt(1_000_001);
	
}
	boolean tryCode(int secretcode1) {
		if (this.secretcode1 == secretcode1) {
			return true;
		} else {
			return false;

		}

	}

	

}