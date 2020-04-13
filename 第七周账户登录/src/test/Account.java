package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
	String name = "";
	String pwd = " ";
	String checkpwd = "";

	public void inputName() {//输入用户名方法

		Scanner scan = new Scanner(System.in);
	
		while (name.length() <= 6) {
			System.out.print("请输入你的用户名:");
			name = scan.nextLine();
			if (name.length() > 6) {
				break;
			} else {
				System.out.println("输入错误，用户名长度要大于六位");
			}
		}
	}

	public void inputPwd() {//输入密码并验证方法
		Pattern p = Pattern.compile("[a-z]");// 正则表达式
		Matcher m = p.matcher(pwd);
		Scanner scan = new Scanner(System.in);
		while (pwd.length() <= 8 || m.matches() == false) {
			System.out.print("请输入你的密码:");
			pwd = scan.next();
			if (pwd.length() > 8) {
				break;
			} else {
				System.out.println("输入错误，密码长度要大于八位且只能是纯字母密码");

			}
		}

	}

	public void inputCheckpwd() {//确认密码方法

		Scanner scan = new Scanner(System.in);

		while (pwd.equals(checkpwd) == false) {
			System.out.print("确认你的密码:");
			checkpwd = scan.next();
			if (pwd.equals(checkpwd) == true) {
				System.out.print("注册成功");
				break;
			} else if (pwd.equals(checkpwd) == false) {
				System.out.print("两次密码不相同，请重新输入,");

			}
		}

	}
}
