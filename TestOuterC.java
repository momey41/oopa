package chap3;

class OuterC {

    int outerAttribute1 = 5;
    static int outerAttribute2 = 10;

    void outerMethod1() {
        System.out.println("OuterC:outerMethod1()");
    }

    static void outerMethod2() {
        System.out.println("OuterC:outerMethod2()");
    }

    void outerMethod3(final int x, boolean y, final int z) {
        class Locallnner {
            void showDetails() {
                System.out.println(x+","+z);
                System.out.println(outerAttribute1 + "," + outerAttribute2);
                outerMethod1();
                outerMethod2();
            }
        }//rnd class StaticInner
        if(y){
            new Locallnner().showDetails();
        }else{
            outerMethod1();
        }
    }//end class OuterB
}
//(1)

public class TestOuterC {

    public static void main(String[] args) {
        OuterC outObj = new OuterC();
        outObj.outerMethod3(11, true, 33);
    }

}//end class

