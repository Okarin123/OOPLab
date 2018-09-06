import java.util.regex.*; 

class word_calc { 

	public static void main (String args[]) { 

		Pattern pat; 
		Matcher mat; 
		
		int count=1;
		int count2=0;

		pat = Pattern.compile("[^a-zA-Z0-9]"); 
		String str[]=pat.split("amogh is an id8iot tp43 1hello,  > ,");
		mat=pat.matcher("amogh is an id8iot tp43 1hello,  > ,");
		while(mat.find()){
			count++;
			System.out.print("\t" + mat.start());
		}
		for(int i=0;i<str.length;i++){
			Pattern patt=Pattern.compile("[0-9]");
			Matcher matt=patt.matcher(str[i]);
			if(matt.find())
				count2++;
		}
		System.out.print("\ncount : "+count);
		System.out.print("\ncount : "+count2);
		}
}


		
