//design a class fraction having data members num and denum.define no argument constructor,one argument constructor,
//two argument constructor and a copy constuctor to set the values to numerator and denominator to different object.

import java.util.*;
class Fraction{
	int num, denum;
	Fraction(){
		num=1;
		denum=1;
	}
	Fraction(float num){
		this.num=num;
		int denum=1;
	}
	Fraction(float num, float denum){
		this.num=num;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		this.denum=denum;
	}
	Fraction(Fraction f){
		num=f.num;
		denum=f.denum;
	}
	void show(){
		System.out.println("The numerator is: "+num);
		System.out.println("The denominator is: "+denum);
		System.out.println("The fraction is: "+num+"/"+denum);
	}
	Fraction add(Fraction ob1){
		Fraction ob2 = new Fraction();
		ob2.num=(this.num*ob1.denum)+(ob1.num*this.denum);
		ob2.denum=(this.denum*ob1.denum);
		reduce();
		
	}
	Fraction subtract(Fraction ob3){
		Fraction ob4 = new Fraction();
		ob4.num=(this.num*ob3.denum)-(ob3.num*this.denum);
		ob4.denum=(this.denum*ob3.denum);
		reduce();
	}
	Fraction multiply(Fraction ob5){
		Fraction ob6 = new Fraction();
		ob6.num=(this.num*ob5.num);
		ob6.denum=(this.num*ob5.denum);
		reduce();
		
	}
	Fraction div(Fraction ob7){
		Fraction ob8 = new Fraction();
		ob8.num=(this.num*ob7.denum);
		ob8.denum=(this.denum*ob7.num);
		reduce();
	}
	
	public int compare(Fraction ob9) {
       
        int thisNum = this.num * ob9.denum;
        int otherNum = ob9.num * this.denum;

        if (thisNum < otherNum) {
            return -1; 
        } else if (thisNum > otherNum) {
            return 1;  
        } else {
            return 0; 
        }
    }
	
	public String mixed(Fraction ob10) {
        int wholePart = this.num / ob10.denum;
        int remainder = ob10.num % this.denum;
        if (remainder == 0) {
            return Integer.toString(wholePart);
        }
        return wholePart + " " + Math.abs(remainder) + "/" + ob10.denum;
    }
	
	public void reduce(Fraction ob11) {
        int gcd = gcd(Math.abs(this.num), Math.abs(ob11.denum));
        num /= gcd;
        denum /= gcd;
      
        if (denum < 0) {
            num = -num;
            denum = -denum;
        }
    }
	
	private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
	
}
class Q35{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		Fraction testOb = new Fraction();
	}
}
