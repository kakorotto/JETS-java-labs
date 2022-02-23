public class newIPind{ 
	public static void main (String[] args) {
		String str =args[0];
		int indexpoint ;
			//if(str.length() == 4){
		for (int i=0; i<4; i++){
			if (i < 3) {
				indexpoint = str.indexOf('.');
				System.out.println(str.substring(0,indexpoint));
				str=str.substring(indexpoint + 1);
			}
			else {
				System.out.println(str);
			}
		}
			//}
			// else {
			//	System.out.println("not valid");
//		}
	}
}
