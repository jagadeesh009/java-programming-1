
/*Print the sum, difference and product of two complex numbers by creating a class named
'Complex' with separate methods for each operation whose real and imaginary parts are
entered by user.*/

import java.util.Scanner;
class Complex{
    int real;
    int imaginary;
    public Complex(int r, int i){
        real = r;
        imaginary = i;
    }
   
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imaginary+b.imaginary));
    }
    
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imaginary-b.imaginary));
    }
    
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imaginary*b.imaginary)),((a.real*b.imaginary)+(a.imaginary*b.real)));
    }
   
    public void printComplex(){
        if(real == 0 && imaginary!=0){
            System.out.println(imaginary+"i");
        }
        else if(imaginary == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imaginary+"i");
        }
    }

}

class Result{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        
        Complex c = new Complex(r1, i1);
        Complex d = new Complex(r2, i2);
      
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
       
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
