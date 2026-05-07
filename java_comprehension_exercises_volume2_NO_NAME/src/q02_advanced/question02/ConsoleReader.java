package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	private BufferedReader br;

	public ConsoleReader() {
		this.br = new BufferedReader(new InputStreamReader(System.in));

	}

	public String inputString() {
		String value = null;
		try {
			value = br.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}

	public int inputNumber() {
		int value = 0;
		try {
			value = Integer.parseInt(br.readLine());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("数値を入力してください。");
		}
		return value;

	}

}
