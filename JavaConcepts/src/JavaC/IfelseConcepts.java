package JavaC;

public class IfelseConcepts {

	public static void main(String[] args) {
		int p=122;
		int q=12;
		if(p<q){
			System.out.println("P is lesser then q");
		}
		else {
			System.out.println("p is greater than q");
		}


		if(p==q) {
			System.out.println("p is equal to q");
		}
		else {
			System.out.println("P is not equal to q");
		}


		//Nested if
		int n1=12;
		int n2=454;
		int n3=100;
		if(n1>n2 && n1>n3){//false and true=false

			System.out.println("n1 is the greatest");

		}else if(n2>n1 && n2>n3){

			System.out.println("n2 is the greatest");

		}else{

			System.out.println("n3 is the greatest");
		}

	}

}
