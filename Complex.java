public class Complex{
    private int real;
    private int imag;
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex(Complex other) {
        this.real = other.real;
        this.imag = other.imag;
    }
    public void showComplex() {
        String sign = (imag < 0) ? " - " : " + ";
        int absImag = Math.abs(imag);
        System.out.println(real + sign + absImag + "i");
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real,
                           this.imag + other.imag);
    }
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real,
                           this.imag - other.imag);
    }
    public Complex multiply(Complex other) {
        int a = this.real, b = this.imag;
        int c = other.real, d = other.imag;
        int realPart = a * c - b * d;
        int imagPart = a * d + b * c;
        return new Complex(realPart, imagPart);
    }
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(3, 4);
        Complex c3 = new Complex(c2);

        System.out.print("c1 = "); c1.showComplex();
        System.out.print("c2 = "); c2.showComplex();
        System.out.print("c3 = "); c3.showComplex();

        Complex sum = c2.add(c3);
        System.out.print("c2 + c3 = "); sum.showComplex();

        Complex diff = c2.subtract(c3);
        System.out.print("c2 - c3 = "); diff.showComplex();

        Complex prod = c2.multiply(c3);
        System.out.print("c2 * c3 = "); prod.showComplex();
    }
}
