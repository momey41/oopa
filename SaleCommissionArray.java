package chap4;
import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommissionArray {

    static void showmenu() {

        System.out.print("------Menu------ \n");
        System.out.print("1 : Sale Information Entry \n");
        System.out.print("2 : commission Summary \n");
        System.out.print("0 : End \n");

    }
    
    public static void main(String[] args) {

        showmenu();
        int count=0;
        double sumsale=0;
        double sumcom=0;
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        
        ArrayList<Saleman> saleList = new ArrayList();
        do {
            System.out.print("Please Enter Menu [0-2] :  ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print(" Enter ID :  ");
                    String id = sc.next();
  
                    System.out.print(" Enter Name :  ");
                    String name = sc.next();
                    
                    System.out.print(" Enter Surname :  ");
                    String surname = sc.next();
                    
                    System.out.print(" Enter Sale Class :  ");
                    int saleClass = sc.nextInt();
                    
                    System.out.print(" Enter Sale Total :  ");
                    double saleTotal = sc.nextDouble();
                    count++;
            
                    Saleman mo = new Saleman();
                    mo.setID(id);
                    mo.setName(name);
                    mo.setSurname(surname);
                    mo.setSaleClass(saleClass);
                    mo.setSaleTotal(saleTotal);
                    saleList.add(mo);
                    break;
                         
                case 2 :
                    System.out.println("\n***Show Data***");
                    for(int i=0;i<saleList.size();i++){
                        Saleman sale = saleList.get(i);
                        System.out.print("Id : "+sale.getID());
                        System.out.print("\tName : "+sale.getName());
                        System.out.print("\tSurname : "+sale.getSurname());
                        System.out.print("\tSale class : "+sale.getSaleClass());
                        System.out.print("\tSale total : "+sale.getSaleTotal());
                        sumsale=sumsale+sale.getSaleTotal();
                        if(sale.getSaleTotal()<10000){
                            switch (sale.getSaleClass()) {
                                case 1:
                                    System.out.println("\tCommission : "+sale.getSaleTotal()*0.05);
                                    sumcom=sumcom+sale.getSaleTotal()*0.05;
                                    break;
                                case 2:
                                    System.out.println("\tCommission : "+sale.getSaleTotal()*0.15);
                                    sumcom=sumcom+sale.getSaleTotal()*0.15;
                                    break;
                                case 3:
                                    System.out.println("\tCommission : "+sale.getSaleTotal()*0.25);
                                    sumcom=sumcom+sale.getSaleTotal()*0.25;
                                    break;
                                default:
                                    break;
                            }
                        }
                        else{
                            switch (sale.getSaleClass()) {
                                case 1:
                                    System.out.println("\tCommission : "+sale.getSaleTotal()*0.10);
                                    sumcom=sumcom+sale.getSaleTotal()*0.10;
                                    break;
                                case 2:
                                    System.out.println("\tCommission : "+sale.getSaleTotal()*0.20);
                                    sumcom=sumcom+sale.getSaleTotal()*0.20;
                                    break;
                                case 3:
                                    System.out.println("\tCommission : "+sale.getSaleTotal()*0.30);
                                    sumcom=sumcom+sale.getSaleTotal()*0.30;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    System.out.println("\n***Summary***");
                    System.out.println("Sale Count : "+count);
                    System.out.println("Sale Total :"+sumsale+" baht");
                    System.out.println("Commission Total : "+sumcom+" baht");
                break;
                  
                default:
                    break;
            }

        } while (menu != 0);
    }

}
