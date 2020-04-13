package test;

import java.util.Scanner;

public class Email {
	String email = "";

	public void input() {//输入方法
		Scanner input = new Scanner(System.in);
		System.out.println("请输入邮箱来验证是否合法");
		email = input.nextLine();
	}

	public void judge() {//判断邮箱是否合法方法
		int i = 0;
	
		// 有且仅有唯一的@
		if (email.indexOf("@") == email.lastIndexOf("@")
				&& email.indexOf("@") != -1) {
			System.out.println("有且仅有一个@合法");
			i++;
		} else {
			System.out.println("有且仅有一个@不合法");
		}

		// 有且仅有唯一的.
		if (email.indexOf(".") == email.lastIndexOf(".")
				&& email.indexOf(".") != -1) {

			System.out.println("有且仅有一个.合法");
			i++;
		} else {
			System.out.println("有且仅有一个.不合法");
		}
		// 新浪邮箱@sina.com结尾
		if (email.endsWith("@sina.com")) {
			System.out.println("邮箱结尾合法");
			i++;
		} else {
			System.out.println("邮箱结尾不合法");
		}
		// @在.之前 且@与.不能相邻
		if (email.indexOf("@") > email.indexOf(".")
				|| email.indexOf(".") - email.indexOf("@") <= 1
				|| email.indexOf(".") == -1 || email.indexOf("@") == -1) {
			System.out.println("@在.之前 且@与.不能相邻不合法");
		} else {
			System.out.println("@在.之前 且@与.不能相邻合法");
			i++;
		}

		// @和.不能是第一位 .不能是最后一位
		if (email.indexOf("@") == 0 || email.indexOf(".") == 0
				|| email.indexOf(".") == email.length() - 1) {
			System.out.println("@和.不能是第一位  .不能是最后一位不合法");
		} else {
			System.out.println("@和.不能是第一位  .不能是最后一位合法");
			i++;
		}
		if (i == 5) {
			System.out.println("邮箱合法");
		} else {
			System.out.println("邮箱不合法");
		}

	}
}
