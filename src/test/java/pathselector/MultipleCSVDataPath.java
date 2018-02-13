package pathselector;

public class MultipleCSVDataPath {
	public static String requiredLanguageMenuPath = "//div[@id='gt-tl-gms']";
	public static String requiredLanguagePath="//div[@id='gt-tl-gms-menu']/table/tbody/tr/td[6]/div[@id='goog-menuitem-group-6']/div[7]/div[@class='goog-menuitem-content' and contains(text(),'Spanish')]";
	public static String path_input = "//textarea[@id='source']";
	public static String path_output = "//span[@id='result_box']";
	public static String path_translateButton = "//input[@class='jfk-button jfk-button-action']";
	public static final String path_csvDataSheet="src//test//java//com//qa//project//ddm//data//words.csv";
}
