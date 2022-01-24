package arts;

public class Painting extends Art {
	private String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description );
		this.paintType = paintType;
	}
	
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	@Override
	protected void viewArt() {
		System.out.printf("%s Paint Type: %s\n", displayArtField(), paintType);
	}
}