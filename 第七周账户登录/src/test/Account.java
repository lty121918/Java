package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
	String name = "";
	String pwd = " ";
	String checkpwd = "";

	public void inputName() {//�����û�������

		Scanner scan = new Scanner(System.in);
	
		while (name.length() <= 6) {
			System.out.print("����������û���:");
			name = scan.nextLine();
			if (name.length() > 6) {
				break;
			} else {
				System.out.println("��������û�������Ҫ������λ");
			}
		}
	}

	public void inputPwd() {//�������벢��֤����
		Pattern p = Pattern.compile("[a-z]");// ������ʽ
		Matcher m = p.matcher(pwd);
		Scanner scan = new Scanner(System.in);
		while (pwd.length() <= 8 || m.matches() == false) {
			System.out.print("�������������:");
			pwd = scan.next();
			if (pwd.length() > 8) {
				break;
			} else {
				System.out.println("����������볤��Ҫ���ڰ�λ��ֻ���Ǵ���ĸ����");

			}
		}

	}

	public void inputCheckpwd() {//ȷ�����뷽��

		Scanner scan = new Scanner(System.in);

		while (pwd.equals(checkpwd) == false) {
			System.out.print("ȷ���������:");
			checkpwd = scan.next();
			if (pwd.equals(checkpwd) == true) {
				System.out.print("ע��ɹ�");
				break;
			} else if (pwd.equals(checkpwd) == false) {
				System.out.print("�������벻��ͬ������������,");

			}
		}

	}
}
