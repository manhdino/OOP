public class ComplexNumber {
    // Cộng 2 số phức :

    public double img;         // Phần ảo
    public double real;       // Phần thực

    // Phương thức khởi tạo :

    public ComplexNumber(double img,double real){
        this.img = img;
        this.real = real;
    }

    // Các phương thức khác :

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.6,6.5);
        ComplexNumber b = new ComplexNumber(4.6,6.7);
        ComplexNumber c ;
        c = SumOfComplex(a,b);
        System.out.println(c.real);
    }

    public static ComplexNumber SumOfComplex(ComplexNumber a,ComplexNumber b){
        ComplexNumber c  = new ComplexNumber(0.0,0.0);
        c.real = a.real + b.real;
        c.img = a.img + b.img;
        return (c);
    }
}
