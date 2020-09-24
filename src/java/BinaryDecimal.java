// 2진수 값을 10진수로 변환하여 출력하기
package java;

public class BinaryDecimal {

	public static void main(String[] args) {
		// int i, j = 0;
		// for(i = 0; i < 8; i++) j += i;
		// System.out.printf("%d, %d", i, j);

		int dec, p;
		int[] s = { 0, 0, 0, 0, 1, 1, 0, 0 };
		p = 0;
		dec = 0;

		for (; p < 8; p++) {
			double k = Math.pow(2, 7 - p);
			dec = dec + (int) (k * s[p]);
		}
		if (s[0] == 0) {
			System.out.printf("%d", dec);
		} else {
			dec = 128 - dec;
			System.out.printf("%d", dec);
		}
	}

}
