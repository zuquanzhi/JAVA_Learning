
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Person ming = new Person();
		ming.setName("Xiao Ming");
		System.out.println(ming.getName());
		Person hong = new Person();
		// FIXME: 给Person增加重载方法setName(String, String):
		hong.setName("Xiao", "Hong");
		System.out.println(hong.getName());
	}

}
