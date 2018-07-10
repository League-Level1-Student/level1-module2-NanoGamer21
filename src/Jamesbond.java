
public class Jamesbond {
	public static void main(String[] args) {
		Vault111 name = new Vault111();
		Jamesbond Bond = new Jamesbond();
		int y=Bond.findCode(name);
		System.out.println(y);
			
		}
	int findCode(Vault111 v) {
		for (int i = 0; i < 1_000_000; i++) {
			boolean code = v.tryCode(i);
			if (code) {
				return i;
			}
		}
		return -1;
	}

}
