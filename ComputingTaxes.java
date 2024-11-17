
package computing.taxes;

import java.util.Scanner;


public class ComputingTaxes {

  
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.print("Please enter your income amount :");
        int income=input.nextInt();
        System.out.println("Please enter your tax filing :"+
                "\n enter 1 for single."+
                "\n enter 2 for maried jointly."+
                "\nenter 3 for maried Seperataly"+
                "\nenter 4 for Houshold filing.");
        int status=input.nextInt();
        double tax ;
        if(status==1){
            if(income>=0 ) if(income <=8350){
                tax = income *10/ 100d;
                System.out.println("Your payable tax for " +income+ "  money in singal group  is : "+tax);
            } else if(income>=835&&income<=33950){
                    tax = income*15/100d;
            System.out.println("Your payable tax for  " +income+ "  money in singal group  is : "+tax);
            }else if(income>=33951&&income<=82250){
                    tax = income*25/100d;
                    System.out.println("Your payable tax for  " +income+ "  money in singal group  is : "+tax);
            }else if(income>=82251&&income<=171550){
                    tax = income*28/100d;
                    System.out.println("Your payable tax for   " +income+ "   mony in singal group  is : "+tax);
            }else if(income>=171551&&income<=372950){
                    tax = income*33/100d;
                    System.out.println("Your payable tax for  " +income+ "  money in singal group  is : "+tax);
            }else if(income >= 372952){
                tax = income*35/100d;
                  System.out.println("Your payable tax for  " +income+ "  money in singal group  is : "+tax);
     
            
            }
        }
                 else if(status==2){
            if(income>=0 && income <=16700){
                tax = income *10/ 100d;
                System.out.println("Your payable tax for " +income+ "  mony in maried filing jointly group  is : "+tax);
            } else if(income>=16701 &&income<=67900){
                    tax = income*15/100d;
            System.out.println("Your payable tax for  " +income+ "  mony in maried filing jointly group  is : "+tax);
            }else if(income>=67901 &&income<=137950){
                    tax = income*25/100d;
                    System.out.println("Your payable tax for  " +income+ "  mony in maried filing jointly group  is : "+tax);
            }else if(income>=137951&&income<=208850){
                    tax = income*28/100d;
                    System.out.println("Your payable tax for   " +income+ "   mony in maried filing jointly group  is : "+tax);
            }else if(income>=208851 &&income<=372950){
                    tax = income*33/100d;
                    System.out.println("Your payable tax for  " +income+ "  mony in maried filing jointly group  is : "+tax);
            }else if(income > 372951){
                tax = income*35/100d;
        System.out.println("Your payable tax for  " +income+ "  mony in maried filing jointly group  is : "+tax);
    
       
            }
            }
         
        
                 else if(status==3){
            if(income>=0 && income <=8350){
                tax = income *10/ 100d;
                System.out.println("Your payable tax for " +income+ "  mony in maried filing separately group  is : "+tax);
            } else if(income>=8351 &&income<=33950){
                    tax = income*15/100d;
            System.out.println("Your payable tax for  " +income+ "  mony in  maried filing separately group  is : "+tax);
            }else if(income>=33951 &&income<=68525){
                    tax = income*25/100d;
                    System.out.println("Your payable tax for  " +income+ "  mony in  maried filing separately group  is : "+tax);
            }else if(income>=68525&&income<=104425){
                    tax = income*28/100d;
                    System.out.println("Your payable tax for   " +income+ "   mony in   maried filing separately  is : "+tax);
            }else if(income>=104426 &&income<=186475){
                    tax = income*33/100d;
                    System.out.println("Your payable tax for  " +income+ "  mony in   maried filing separately  is : "+tax);
            }else if(income > 186476){
                tax = income*35/100d;
        System.out.println("Your payable tax for  " +income+ "  mony in  maried filing separately group  is : "+tax);
    
       
}
            }
         else if(status==4){
            if(income>=0 && income <=11950){
                tax = income *10/ 100d;
                System.out.println("Your payable tax for " +income+ "  mony in Head of household group  is : "+tax);
            } else if(income>=11951 &&income<=45500){
                    tax = income*15/100d;
            System.out.println("Your payable tax for  " +income+ "  mony in Head of household group  is : "+tax);
            }else if(income>=45501 &&income<=117450){
                    tax = income*25/100d;
                    System.out.println("Your payable tax for  " +income+ "  mony in  Head of household group  is : "+tax);
            }else if(income>=117451&&income<=190200){
                    tax = income*28/100d;
                    System.out.println("Your payable tax for   " +income+ "   mony in   Head of household  is : "+tax);
            }else if(income>=190201 &&income<=372950){
                    tax = income*33/100d;
                    System.out.println("Your payable tax for  " +income+ "  mony in   Head of household  is : "+tax);
            }else if(income > 372951){
                tax = income*35/100d;
        System.out.println("Your payable tax for  " +income+ "  mony in  Head of households group  is : "+tax);
            }
         }
    }
}
    

    