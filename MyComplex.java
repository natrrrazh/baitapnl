public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal(){
        return (real == 0);
    }

    public boolean isImaginary(){
        return (imag == 0);
    }

    public boolean equals(double real, double imag){
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another){
        return (this.real == another.real && this.imag == another.imag);
    }

    public double Magnitude(){
        return (double)(Math.sqrt(real*real + imag*imag));
    }

    public double argument(){
        return Math.atan2(imag, real);
    }

    public MyComplex addInto(MyComplex right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }

    public MyComplex add(MyComplex right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+right.real,this.imag+right.imag);
    }

    public MyComplex subtract(MyComplex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-right.real,this.imag-right.imag);
    }

    public MyComplex multiply(MyComplex right){
        this.real=(this.real*right.real - this.imag*right.imag);
        this.imag=(this.real*right.imag + this.imag*right.real);
        return this;
    }

    public MyComplex divide(MyComplex right){
        this.real=(double)((this.real*right.real + this.imag*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        this.imag-=(double)((this.imag*right.real - this.real*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        return this;
    }

    public MyComplex conjugate(){
        this.imag *= -1;
        return this;
    }

}

class TestMyComplex{
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.1, 2.2);
        MyComplex c2 = new MyComplex(3.3, 4.4);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 is real: " + c1.isReal());
        System.out.println("c1 is imaginary: " + c1.isImaginary());

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 magnitude: " + c1.Magnitude());
        System.out.println("c1 argument: " + c1.argument());
        MyComplex c3 = c1.addNew(c2);
        System.out.println("c1 + c2: " + c3);
    }
    }
