package com.itranswarp.sample;

import com.itranswarp.world.Person;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("小明");
		System.out.println(p1.hello());
	}

}

// javac -d ./bin  .\src\com\itranswarp\sample\Main.java .\src\com\itranswarp\world\Person.java
// java -cp bin com.itranswarp.sample.Main