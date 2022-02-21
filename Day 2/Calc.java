public class Calc {
	public static void main(String[] args){
//for(int i=0;i<args.length;i++){
	int firstOperand=Integer.parseInt(args[0]);
	char operator= args[1].charAt(0);
	int secondOperand=Integer.parseInt(args[2]);
  switch(operator) {
    case '+'  : { System.out.println(firstOperand+" + "+secondOperand+" equal "+ (firstOperand + secondOperand)); break; }
    case '-'  : { System.out.println(firstOperand+" + "+secondOperand+" equal "+ (firstOperand - secondOperand)); break; }
    case '/'  : { System.out.println(firstOperand+" + "+secondOperand+" equal "+ (firstOperand / secondOperand)); break; }
    case '*'  : { System.out.println(firstOperand+" + "+secondOperand+" equal "+ (firstOperand * secondOperand)); break; }
    case '%'  : { System.out.println(firstOperand+" + "+secondOperand+" equal "+ (firstOperand % secondOperand)); break; }
    default  : { System.out.println("error"); break; }
	}
//}
	}
}
