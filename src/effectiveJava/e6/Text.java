package effectiveJava.e6;

import java.util.EnumSet;
import java.util.Set;

//位域
public class Text {
	
	public static final int STYLE_BOLD = 1 << 0;  //1
	public static final int STYLE_ITALIC = 1 << 1; //2
	public static final int STYLE_UNDERLINE = 1 << 2; //4
	public static final int STYLE_STRIKETHROUGH = 1 << 3; //8
	
	public void applyStyles(int style){
		System.out.println(style);
	}
	
	public static void main(String[] args) {
		Text t = new Text();
//		t.applyStyles(STYLE_ITALIC | STYLE_UNDERLINE);
		t.applyStyles2(EnumSet.of(Style.ITATIC,Style.UNDERLINE));
	}
	
	public enum Style{
		BOLD, ITATIC,UNDERLINE,STRIKETHROUGH;
	}
	public void applyStyles2(Set<Style> style){
		System.out.println(style.size());
	}
}
