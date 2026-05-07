package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する

		Member mb1 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member mb2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		mb1.showMember();
		mb2.showMember();

	}

}
