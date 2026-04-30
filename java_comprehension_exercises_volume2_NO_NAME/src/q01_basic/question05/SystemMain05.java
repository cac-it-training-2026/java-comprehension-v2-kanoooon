package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember human1 = new NonMember("Sato Kensuke", "the item");
		Member human2 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);

		members[0] = human1;
		members[1] = human2;

		MemberManeger.showAllMembers(members);
		human1.buyItem();
		human2.buyItem();

	}

}
