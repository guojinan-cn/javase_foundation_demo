package chapter07.demo01.noGeneric;

public class NoGeneric {
	private Object object;  //定义一个通用类型成员
	
	public NoGeneric(Object object) {
		this.object = object;
	}
	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
	public void showType() {
		System.out.println("实际类型是: " + object.getClass().getName());
	}
}
