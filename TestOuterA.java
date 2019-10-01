package chap3;
//(2)
class OuterA{
    int outerAttribute1 =5;
    static int outerAttribute2 = 10;
    
    void outerMethod1(){
        System.out.println("OuterA:outerMethod1()");
    }
    
    static void outerMethod2(){
        System.out.println("OuterA:outerMethod2()");
    }
    
    static class StaticInner{
        int staticInnerAttribute1 = 15;
        static int staticInnerAttribte2 = 20;
        
        void staticInnerMethod1(){
            System.out.println(staticInnerAttribute1 +","+ staticInnerAttribte2);
            System.out.println("outerAttribute2");
        }
        static void staticInnerMethod2(){
            outerMethod2();
        }
    }//rnd class StaticInner
    
    
    
}//end class OuterA

//(1)
public class TestOuterA {
    
    public static void main(String[] args) {
        OuterA.StaticInner innerObj = new OuterA.StaticInner();
        innerObj.staticInnerMethod1();             //call non-static method
        OuterA.StaticInner.staticInnerMethod2();   //call static method 
    }
    
}//end class
