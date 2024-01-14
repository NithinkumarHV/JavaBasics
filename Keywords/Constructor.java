class ConstructorExamples {
    int x,y;

    ConstructorExamples(){
        this.x = 1;
        this.y = 2;
    }

    ConstructorExamples(int x, int y){
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(x + " " + y);
    }
}

class Constructor {
    public static void main(String []args) {
        ConstructorExamples obj = new ConstructorExamples(10,20);
        obj.print();
    }
}