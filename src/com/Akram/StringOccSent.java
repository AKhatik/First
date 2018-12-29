package com.Akram;

public class StringOccSent {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s1="This is a Table and this table is wooden".toLowerCase();
			String arr[]=s1.split(" ");
			String verifiedString="";
			for(int i=0;i<arr.length;i++)
			{	
				String word1=arr[i];
				int cnt=1;
				if(!verifiedString.contains(word1)) {
						for(int j=i+1;j<arr.length;j++) {
							String word2=arr[j];
							
					if(word1.equalsIgnoreCase(word2)) {
						cnt++;
					}
				}
						verifiedString = verifiedString+" "+word1+" ";
						System.out.println(word1+" ==> "+cnt);
				}
			}
		}
	}