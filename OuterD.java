package chap3;
class printer{
    void print(){
        System.out.println("printer : print()");
    }
}//end class printer

public class OuterD {
    static void printReport(printer pnt){
        pnt.print();
    }//end meth
    
    public static void main(String[] args) {
        printReport(new printer(){
            void print(){
                System.out.println("Ano 1");
            }
        });    
        printReport(new printer(){
            void print(){
                System.out.println("Ano 2");
            }
        });    
    }//end main
    
}//end class OuterD
