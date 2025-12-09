class Addition {

    int c;       
    //  WITH INPUT & WITHOUT OUTPUT
    void add(int x, int y) {   
        c = x + y;             
        System.out.println("C = " + c);
    }
}

class method2 {
    public static void main(String[] args) {

        Addition ref = new Addition();  

        int a = 10;   
        int b = 20;  

        ref.add(a, b);   
    }
}