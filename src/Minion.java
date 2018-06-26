
public class Minion {
	private String Name;
	private int Eyes;
	private String Color;
	private String Master;
	
	Minion(String Name, int Eyes,String Color,String Master){
		
		this.Name=Name;
		this.Eyes=Eyes;
		this.Color=Color;
		this.Master=Master;
		
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public int getEyes() {
		return this.Eyes;
	}
	public void seteyes(int Eyes) {
		this.Eyes=Eyes;
	}
	public String getColor() {
		return this.Color;
	}
	public void setColor(String Color) {
		this.Color=Color;
	}
	public String getMaster() {
		return this.Master;
	}
	public void setMaster(String Master) {
		this.Master=Master;
	}
	}

