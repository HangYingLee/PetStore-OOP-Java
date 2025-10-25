package petstore;

public class Rabbit extends Pet{
	private String coatColor;
	
	public void setCoatColor(String newCoatColor) {
		coatColor = newCoatColor;
	}
	
	public String getCoatColor() {
		return coatColor;
	}

	public String speak() {
		return "I am a rabbit.";
	}

}
