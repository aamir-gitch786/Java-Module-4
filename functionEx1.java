



class functionEx1 {  

 public static void main(String args[]){  
	 int count=9,start=1,number=5;
	 for(int i=1;i<=9;i++)
	 { 
		 for(int j=1;j<=9;j++)
		 {
			 if(i==start || j==start || i==count || j == count)
			 {
				System.out.printf("%d",number);
				number--;
			 }
			 else
			 {
				 System.out.print(" ");
			 }
			 
		 }
		 System.out.println();
		 start++;count--;
	 }
	 
}  
}