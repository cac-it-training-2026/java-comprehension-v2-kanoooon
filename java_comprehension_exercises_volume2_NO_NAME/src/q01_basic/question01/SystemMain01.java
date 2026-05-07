package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("---SHOW DATA---");

		Member member1 = new Member();
		member1.setName("Miura Manabu");
		member1.setAge(24);
		member1.setRank(1);

		member1.showMember();

		Member member2 = new Member();
		member2.setName("Sato Kensuke");
		member2.setAge(36);
		member2.setRank(2);

		member2.showMember();

	}

}
