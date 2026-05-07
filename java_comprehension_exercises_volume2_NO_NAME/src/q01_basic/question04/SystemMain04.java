package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する

		Member human1 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member human2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members[0] = human1;
		members[1] = human2;
		MemberManager.showAllMember(members);

	}

}
