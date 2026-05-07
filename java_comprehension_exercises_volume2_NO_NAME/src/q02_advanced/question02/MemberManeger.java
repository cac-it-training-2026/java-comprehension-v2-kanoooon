package q02_advanced.question02;

import java.util.List;

public class MemberManeger {
	private MemberManeger() {

	}

	public static void showAllMember(List<Member> members) {
		for (Member m : members) {
			m.showMember();

		}

	}

	public void updatePassword(List<Member> members, int id, String password) {
		boolean found = false;

		for (Member m : members) {
			if (m.getId() == id) {
				m.setPassword(password);
				found = true;
				break;

			}
		}

		if (!found) {
			System.out.println("該当者は見つかりませんでした。");
		}
	}
}
