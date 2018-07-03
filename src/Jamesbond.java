
public class Jamesbond {
boolean findCode(Vault111 v) {
for(int i=0;i<1_000_000;i++) {
v.tryCode(i);	 
if (i== v) {
	return true;
 }
 else {
	 return false;
 }
}
}
	
}
