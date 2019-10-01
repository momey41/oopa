package chap4;

import java.util.Scanner;



public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.println("name is "+name);
        
        System.out.print("Enter age :");
        int age = sc.nextInt();
        if(age<= 11){
            System.out.println("วัยเด็ก");
        }else if (age <=20){
            System.out.println("วัยรุ่น");
        }else if (age <=40){
            System.out.println("วัยผู้ใหญ่");
        }else if (age <=60){
            System.out.println("วัยกลางคน");
        }else
            System.out.println("วัยสูงอายุ");
      
    
        System.out.print("Please enter your salary :");
        int salary = sc.nextInt();
        
        System.out.print("Please enter your degree :");
        int degree = sc.nextInt();
         switch (degree){
        case 1:
            System.out.println("Please enter your degree:ปริญญาตรี");
            break;
        case 2:
            System.out.println("Please enter your degree:ปริญญาโท");
            break;
        case 3:
            System.out.println("Please enter your degree:ปริญญาเอก");
            break;
        default:
            System.out.println("Please enter your degree:ไม่ระบุ");
            break;
    }
        System.out.print("Exployee name:"+name);
        System.out.println(",age:"+age+",salary:"+salary);
    }
}
        
        
     
