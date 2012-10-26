package decorator;

public class I18NText extends Text{

	private Text text;

	public String getText() {
		return convertTextTo(getLanguage());
	}

	private String convertTextTo(String language) {
		return null;
	}
	
	private String getLanguage() {
		return "en_ES";
	}
}
