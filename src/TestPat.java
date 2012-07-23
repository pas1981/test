import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPat {

	public static void main(String[] args) {
		// Pattern p =
		// Pattern.compile("([a-zA-z0-9[@#$%]](?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%])(?=.*[0-9]).{6,20})");
		// Pattern p = Pattern.compile("([\\w[@#$%]]{6,7})(([\\w[@#$%]])++)");
		// Pattern p =
		// Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%])[a-zA-Z0-9[@#$%]]{6,8}");
		// Matcher m = p.matcher("asdsS@3");
		// System.out.println(m.matches());
		// m = p.matcher("zssdfusdyfuihyuisdZ");
		// System.out.println(m.matches());
		// m = p.matcher("aa!Yw@2");
		// System.out.println(m.matches());
		Pattern p = Pattern
				.compile("[()a-zA-Z\u0430-\u044F\u0410-\u042F- ]*");
		Matcher m = p.matcher("asd-sπ");
		System.out.println(m.matches());
		m = p.matcher("ÔÌ„Ô˚‚- 2");
		System.out.println(m.matches());
		m = p.matcher("sdf");
		System.out.println(m.matches());

	}

}
