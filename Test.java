class Complex {
    int re,im;

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

class Test {
    public static void main (String []args) {
        Complex c1 = new Complex(10,20);
        Complex c2 = new Complex(20,10);

        c1.print();
        c2.print();

        c1.add(c2);
        c1.print();
    }
}

