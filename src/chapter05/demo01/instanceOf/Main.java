package chapter05.demo01.instanceOf;

public class Main {
	public static void main(String[] args) {
	    IBase base = new Base();
	    IBase sub = new Sub();

	    typeof(base);
	    typeof(sub);
	}

	public static void typeof(Object object) {
	    if (object instanceof Sub) {
	        ((Sub) object).print();
	    } else if (object instanceof Base) {
	        ((Base) object).print();
	    }
	}
}
