
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Person p = new Person("小明", 12);
		Student s = new Student("小红", 20, 99);
		// TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
		Student ps = new PrimaryStudent("小军", 9, 100, 5);
		System.out.println(ps.getScore());
		PrimaryStudent sb=new PrimaryStudent("崔明哲",10,60,2);

		System.out.println(sb.getGrade());
		System.out.println(sb.getName());
	}

}
