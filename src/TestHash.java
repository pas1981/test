import java.util.HashMap;
import java.util.Map;

public class TestHash {

	public static void main(String[] args) {
		Map<Object, Object> mapa = new HashMap<Object, Object>();
		My zu = new My();
		zu.setQ(2);
		mapa.put(zu, zu);
		zu = new My();
		zu.setQ(2);
		mapa.put(zu, zu);
		System.out.println("z");
	}

}

class My {
	private int q;

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			My my = (My) obj;
			return my.getQ() == this.q;
		} catch (Exception e) {
			return false;
		}
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}
}