package waarest.waarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// @AllArgsConstructor
// @NoArgsConstructor
final public class Post {

  private int id;
  private String title;
  private String content;
  private String author;

  public Post(int id, String title, String content, String author){
    this.id = id;
    this.title = title;
    this.content = content;
    this.author = author;
  }

	
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getAuthor() {
		return author;
	}
}
