package Week5.Exercise;

import java.util.Scanner;

public class HarapanKitaHospital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String destinationRoom = "";

        System.out.print("SpO2 (%): ");
        double spo2 = input.nextDouble();
        System.out.print("Sisa bed ICU: ");
        int sisaBedICU = input.nextInt();
        System.out.print("Systolic blood pressure (mmHg): ");
        int systolic = input.nextInt();
        System.out.print("Fully conscious? (true/false): ");
        boolean isConscious = input.nextBoolean();
        System.out.print("Body temperature (C): ");
        double temperature = input.nextDouble();
        System.out.print("Has comorbidities? (true/false): ");
        boolean hasComorbidity = input.nextBoolean();
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Respiratory rate (breaths/min): ");
        int respiratoryRate = input.nextInt();

        if(spo2<85 && sisaBedICU>0){
            destinationRoom = "ICU";
        }else if(spo2<85 && sisaBedICU==0){
            destinationRoom = "UGD_VENTILATOR_MOBIL";
        }else if((spo2>=85 && spo2<90) || systolic<90 || systolic>180 || !isConscious){
            destinationRoom = "RESUSITASI_UGD";
        }else if(((spo2>=90 && spo2<95) || temperature>39) && hasComorbidity && age>=65){
            destinationRoom = "HCU_ISOLASI";
        }else if((spo2>=90 && spo2<95) || respiratoryRate>24){
            destinationRoom = "RAWAT_INAP_UMUM";
        }else{
            destinationRoom = "RAWAT_JALAN";
        }
        System.out.println(destinationRoom);
    }
}
    
