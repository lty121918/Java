package test;

import java.util.Scanner;

public class Email {
	String email = "";

	public void input() {//���뷽��
		Scanner input = new Scanner(System.in);
		System.out.println("��������������֤�Ƿ�Ϸ�");
		email = input.nextLine();
	}

	public void judge() {//�ж������Ƿ�Ϸ�����
		int i = 0;
	
		// ���ҽ���Ψһ��@
		if (email.indexOf("@") == email.lastIndexOf("@")
				&& email.indexOf("@") != -1) {
			System.out.println("���ҽ���һ��@�Ϸ�");
			i++;
		} else {
			System.out.println("���ҽ���һ��@���Ϸ�");
		}

		// ���ҽ���Ψһ��.
		if (email.indexOf(".") == email.lastIndexOf(".")
				&& email.indexOf(".") != -1) {

			System.out.println("���ҽ���һ��.�Ϸ�");
			i++;
		} else {
			System.out.println("���ҽ���һ��.���Ϸ�");
		}
		// ��������@sina.com��β
		if (email.endsWith("@sina.com")) {
			System.out.println("�����β�Ϸ�");
			i++;
		} else {
			System.out.println("�����β���Ϸ�");
		}
		// @��.֮ǰ ��@��.��������
		if (email.indexOf("@") > email.indexOf(".")
				|| email.indexOf(".") - email.indexOf("@") <= 1
				|| email.indexOf(".") == -1 || email.indexOf("@") == -1) {
			System.out.println("@��.֮ǰ ��@��.�������ڲ��Ϸ�");
		} else {
			System.out.println("@��.֮ǰ ��@��.�������ںϷ�");
			i++;
		}

		// @��.�����ǵ�һλ .���������һλ
		if (email.indexOf("@") == 0 || email.indexOf(".") == 0
				|| email.indexOf(".") == email.length() - 1) {
			System.out.println("@��.�����ǵ�һλ  .���������һλ���Ϸ�");
		} else {
			System.out.println("@��.�����ǵ�һλ  .���������һλ�Ϸ�");
			i++;
		}
		if (i == 5) {
			System.out.println("����Ϸ�");
		} else {
			System.out.println("���䲻�Ϸ�");
		}

	}
}
