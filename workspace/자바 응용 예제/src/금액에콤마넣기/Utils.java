package 금액에콤마넣기;

import java.text.DecimalFormat;

public class Utils {
	/*
	 * 입력 받은 금액에 천 단위 마디 콤마 넣기 함수 구현
	 */
	public static String toNumberFormat(long totalAmount) {
		
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(totalAmount);
	}
}
