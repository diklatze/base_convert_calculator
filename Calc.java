package numberconvertor_better;

public class Calc {

	char[] cal(int base, int number) {
		
		double number_len_calc = Math.log(number) / Math.log(base);
		int number_len = (int) number_len_calc+1;		
		char[] result = new char[number_len];

		for (int k = 0; k < number_len; k++) {
			int temp = number % base;
			
			if (temp >=0 & temp <10){
			result[k] = (char)(temp+'0');
			}
			else {result[k] = (char)(temp+87);
			}
			number = number / base;
		}
		
		return result;
	}
		
		
	void printResult(char[] result) {
		for (int j = result.length-1; j > -1; j--) {
			System.out.print(result[j]);
		}

	}
}
