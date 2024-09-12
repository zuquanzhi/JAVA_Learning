
public class Person {

	// TODO

	String name;
	static int count =0;
	public Person(String name) {
		this.name = name;
		count ++;
	}

	public static int getCount(){
		return count;
	}

}
