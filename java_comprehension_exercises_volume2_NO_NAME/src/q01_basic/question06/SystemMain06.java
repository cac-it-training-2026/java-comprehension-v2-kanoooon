package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ConsoleReader cr = new ConsoleReader();

		int inputId;
		String inputPassword;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		try {
			System.out.println("input id>>");
			inputId = cr.inputNumber();

			System.out.println("input password>>");
			inputPassword = cr.inputString();

		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;

		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		finally {
		}

		Member member = new Member(inputId, inputPassword, name, age, rank);

		member.showMember();

	}

}