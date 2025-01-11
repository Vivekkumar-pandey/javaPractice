//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        Abc ab1=new Abc("vivek",20);
        System.out.println(ab1.name+"  "+ab1.id);
        Abc ab2=new Abc();
        System.out.println(ab2.name+"  "+ab2.id);

        Abc ab3=new Abc(ab1);
        System.out.println(ab3.name+"  "+ab3.id);

    }
}

class Abc{

    String name;
    int id;
    Abc(){
        System.out.println("no argument constructor calling");
    };
    Abc(String name,int id){
        System.out.println("normal constructor calling");
        this.name=name;
        this.id=id;

    }
    //for copy constructor

    Abc(Abc ab){
        System.out.println("copy constructor calling...");
        this.name=ab.name;
        this.id=ab.id;
    }
}