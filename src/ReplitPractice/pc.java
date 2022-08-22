package ReplitPractice;

import java.util.Scanner;

public class pc {
    public static void main(String[] args) {







                Scanner input = new Scanner(System.in);

                System.out.println("Select screen size:");
                double screenSize = input.nextDouble();
                double price = 0.0;
                if (screenSize == 13.3){
                    price += 200;
                } else if (screenSize == 15.0){
                    price += 300;
                } else if (screenSize == 17.3){
                    price += 400;
                }


                System.out.println("Select CPU type:");
                input.nextLine();
                String cpuType = input.nextLine();
                switch (cpuType){
                    case "i3":
                        price += 150;
                        break;
                    case "i5":
                        price += 250;
                        break;
                    case "i7":
                        price += 350;
                        break;
                }

                System.out.println("Select RAM size:");
                int ramSize = input.nextInt();
                if (ramSize % 4 == 0){
                    int numberOfRams = ramSize / 4 ;
                    price += numberOfRams * 50;
                }

                System.out.println("Select storage type:");
                input.nextLine();
                String storageType = input.nextLine();

                System.out.println("Select storage size:");
                int storageSize = input.nextInt();
                switch(storageType){
                    case "HDD":
                        int hddGb = storageSize / 500;
                        price += hddGb * 50;
                        break;
                    case "SSD":
                        int ssdGb = storageSize / 500;
                        price += ssdGb * 100;
                        break;
                }

                System.out.println("Select screen resolution:");
                input.nextLine();
                String screenResol = input.nextLine();
                switch(screenResol){
                    case "FULLHD":
                        price += 100;
                        break;
                    case "4K":
                        price += 200;
                        break;
                }

                System.out.println("Final price is: $"+price);

            }
        }






