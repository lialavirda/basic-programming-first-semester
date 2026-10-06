package Week5.Exercise;

public class Tax {
    public static void main(String[] args) {
        double income = 150000000;
        double tax;
        
       if(income<=0){
            tax=0;
        }else if(income>=0 && income<=60000000){
            tax=0.05*income;
        }else if(income>60000000 && income<=250000000){
            tax=(0.05*60000000)+(0.15*(income-60000000));
        }else if(income>250000000 && income<=500000000){
            tax=(0.05*60000000)+(0.15*250000000)+(0.25*(income-250000000));
        }else{
            tax=(0.05*60000000)+(0.15*250000000)+(0.25*500000000)+(0.3*(income-500000000));
        }
        System.out.println("PPh 21: Rp " + tax); 
    }
}