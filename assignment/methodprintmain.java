class print {
    void printdetails(String name,int age){
        System.out.println("name :"+name+ " age:"+age);
        
    }
    void printdetails(int age,String name){
        System.out.println("age :"+age+ " name:"+name);
        
    }
}

public class methodprintmain {
    public static void main(String[] args) {
        print p=new print();
        p.printdetails("jonh",25);
        p.printdetails(25,"doe");
        
    }
}
    