package com.Akram;

public class HalfDiamonds {
		int star,row;
		void patteren() {
			for(row=1;row<=7;row++) {
				for (star=1;star<=row;star++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(row=6;row>0;row--) {
				for(star=1;star<=row;star++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			HalfDiamonds t1=new HalfDiamonds();
			t1.patteren();
		}
	}