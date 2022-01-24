package arts;

public abstract class Art {
	protected String title;
	protected String author;
	protected String description;
	
	public Art(String title, String author, String description) {
		super();
		this.title = title;
		this.author = author;
		this.description = description;
	}

	protected abstract void viewArt();
	
	protected String displayArtField() {
		return String.format("title: %s author: %s description: %s ", title, author, description);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
