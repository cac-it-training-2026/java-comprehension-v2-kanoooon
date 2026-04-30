package q01_basic.question05;

public class NonMember extends AbstMember {

	/**
	 * 
	 */
	String name;
	String item;

	/**
	 * @param name
	 */

	/**
	 * @param name
	 * @param item
	 */
	public NonMember(String name, String item) {
		this.name = name;
		this.item = item;
	}

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		String name = "Sato Kensuke";
		String item = "the item";

		System.out.println("---BUY ITEM---");
		System.out.println("" + name + " purchased  " + item + " at a fixed price");

	}

	@Override
	public void showMember() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("***MEMBER DATA*****");
		System.out.println("" + name + " is a non-member");
	}

}
