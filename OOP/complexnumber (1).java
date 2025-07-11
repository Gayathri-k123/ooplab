import java.util.Scanner;
class complex{
	double real;
	double  imaginary;
	
	complex(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	complex add(complex other){
		double realpart=this.real+other.real;
		double imaginarypart=this.imaginary+other.imaginary;
		return new complex(realpart,imaginarypart);
	}
	complex multiply(complex other){
		double realpart=(this.real*other.real)-(this.imaginary*other.imaginary);
		double imaginarypart=(this.real*other.imaginary)-(other.real*this.imaginary);
		return new complex(realpart,imaginarypart);
	}
}
public class complexnumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		

		System.out.println("enter real part of first complex");
		double real1=sc.nextDouble();
		System.out.println("enter imaginary part of first complex");
                double imaginary1=sc.nextDouble();

		System.out.println("enter real part of second complex");
                double real2=sc.nextDouble();
                System.out.println("enter imaginary part of second complex");
                double imaginary2=sc.nextDouble();

		complex c1=new complex(real1,imaginary1);
		complex c2=new complex(real2,imaginary2);

		complex sum=c1.add(c2);
		System.out.println("sum of two complex number");
		System.out.println(sum.real + "+" + sum.imaginary);
		
		complex mul=c1.multiply(c2);
                System.out.println("product of two complex number");
                System.out.println(mul.real + "+" + mul.imaginary);

		sc.close();
}
}
