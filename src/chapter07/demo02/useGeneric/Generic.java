package chapter07.demo02.useGeneric;

public class Generic<T> {
	private T object;
	
	public Generic(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	public void showType() {
		System.out.println("实际类型是: " + object.getClass().getName());
	}
}
