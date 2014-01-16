package org.gayafoundation.plugin.regexp.data;

public class TitleBody {

	private String title;
	private String body;
	
	public TitleBody(String title, String body) {
		this.title = title;
		this.body = body;
	}

	public static TitleBody create(String title, String body) {
		return new TitleBody(title, body);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
