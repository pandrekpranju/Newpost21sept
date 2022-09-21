package JavaC;

public class StringOperations {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		double d1=123.00;
		double d2=228.98;
		String s="Pranjali";
		String s1="Pandrekar ";
		String s2="hellowordmad";  
		String s3="hello";  
		
		System.out.println(a);
		System.out.println("****String Concatenation");
		System.out.println(a+b);//100+200=300
		System.out.println(a+d1);//100+123.00=223.0
		System.out.println(a+s);//100Pranjali
		System.out.println(s+s);//PranjaliPranjali
        System.out.println(s.concat(s1));//PranjaliPandrekar
		System.out.println(s.concat(s1.concat(s2).concat(s3)));//PranjaliPandrekarhellohello
		System.out.println(s+s1+a);//PranjaliPandrekar100
		System.out.println(d1+s+s3+a);//123.0Pranjalihello100
		System.out.println(s+a+s3+s2);//Pranjali100hellohello
		System.out.println(s3.concat("e"));//helloe
		
	    
        System.out.println("******String comparision*******");
        System.out.println(s.compareTo(s1));//Returns postive number if String S is greater than String S1 and it will return cou t from r to a character
        System.out.println(s2.compareTo(s3));//Returns 0 if both the strings are equal
        
        System.out.println("******String contains*******");
        System.out.println(s.contains(s3));//Returns false as String s and String s3 are not equal
        System.out.println(s2.contains(s3));//Returns false as String s2 and String s3 are equal
        System.out.println(s1.contentEquals(s3));
        System.out.println(s.equals(s2));//Returns false value as s and s2 are not equal
        
        
        System.out.println(s.charAt(3));//N  is at 3 position
        System.out.println(s.hashCode());
        
        System.out.println("*******String Length************");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        
        System.out.println(s1.startsWith("P"));//returns boolean if the condition is met
        System.out.println(s3.substring(2));//Prints from llo  from 2 index String s3="hello"
        System.out.println(s.substring(1, 5));//prints from 1 to 5 index charter from string s
        
        System.out.println("String operations");
        System.out.println(s.equals("pankas"));//false
		System.out.println(s.valueOf(s));//Pranjali
		System.out.println(s.toString());//Pranjali
		System.out.println(s.replace("Pranjali", "Rani"));//Rani
		System.out.println(s);//Pranjali
		System.out.println(s.indexOf('x'));//-1 negative value if the char is not available
		System.out.println(s.lastIndexOf('r'));//returns positive number when char r is present String s=pranjali
        
	}

}
