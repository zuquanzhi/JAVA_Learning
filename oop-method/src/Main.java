/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Person ming = new Person();
		ming.setName("小明");
		System.out.println(ming.getName());
		// FIXME: 给Person增加getAge/setAge方法:
		ming.setAge(12);
		System.out.println(ming.getAge());

	}

}
