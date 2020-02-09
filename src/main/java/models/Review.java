package models;

public class Review {
	private long id;
	private String title;
	private String image;
	private String reviewScore;
	private String content;
	private String synopsis;
	
	
	public Review(long id, String title, String image, String reviewScore, String content, String synopsis) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.reviewScore = reviewScore;
		this.content = content;
		this.synopsis = synopsis;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(String reviewScore) {
		this.reviewScore = reviewScore;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
}
