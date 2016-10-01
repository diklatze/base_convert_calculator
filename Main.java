package numberconvertor_better;
import numberconvertor_better.Constant;
import numberconvertor_better.CheckInput;;


public class Main {
	public static void main(String[] args) {
		
		int number = 0;	
		
	 	number = CheckInput.checkInput();
	
		Calc bin_base = new Calc();
		Calc oct_base = new Calc();
		Calc hex_base = new Calc();

		System.out.print(number + " in binary: ");
		bin_base.printResult(bin_base.cal(Constant.BIN_BASE, number));
		System.out.println();

		System.out.print(number + " in octal: ");
		oct_base.printResult(oct_base.cal(Constant.OCT_BASE, number));
		System.out.println();
		

		System.out.print(number + " in hex: ");
		hex_base.printResult(hex_base.cal(Constant.HEX_BASE, number));			
		System.out.println();
	}

}
