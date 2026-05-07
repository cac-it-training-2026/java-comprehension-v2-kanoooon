package q01_basic.question05;

public class MemberManeger {
	private MemberManeger() {

	}

	public static void showAllMembers(AbstMember[] members) {
		for (int i = 0; i < members.length; i++) {
			members[i].showMember();

		}
	}

}
