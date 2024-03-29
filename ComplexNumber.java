class Complex {
    int re,im;

    // Constructor
    Complex(int r, int i){
        re = r;
        im = i;
    }

    void print() {
        System.out.println(re + "+i" + im);
    }

    void add(Complex C){
        re = re + C.re;
        im = im + C.im;
    }
}

class ComplexNumber {
    public static void main (String []args) {
        Complex c1 = new Complex(10,20);
        Complex c2 = new Complex(20,10);

        c1.print();
        c2.print();

        // Called on object c1
        c1.add(c2);
        c1.print();
    }
}

