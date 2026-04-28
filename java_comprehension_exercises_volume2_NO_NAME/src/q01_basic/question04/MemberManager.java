package q01_basic.question04;

class MemberManager {
	public static void showAllMember(Member[] information) {
		for (Member i : information) {
			i.showMember();

		}

	}

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {

	}

	//TODO showAllMembersメソッドを実装する

}
