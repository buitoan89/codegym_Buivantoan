package views;

import controllers.MainController;
import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        Services house = new House();
//        house.showInfor();
//        Services room = new Room();
//        room.showInfor();
//        Scanner sc = new Scanner(System.in);
//
//        Services villa = new Villa();
//        villa.setId(UUID.randomUUID().toString().replace("-",""));
//        System.out.println("Enter name sevice");
//        villa.setName(sc.nextLine());
//        System.out.println("Enter Area Usered");
//        villa.setAreaUsed(sc.nextFloat());
//        System.out.println("Enter Rent Cost");
//        villa.setRentalCost(sc.nextFloat());
//        System.out.println("Enter max of number");
//        villa.setMaxNumberOfPeaple(sc.nextInt());
//        System.out.println("Enter Type Rent");
//        villa.setTypeRent(sc.nextLine());
//        System.out.println("Enter Room Standart");
//        ((Villa)villa).setRoomStandard(sc.nextLine());
//        System.out.println("Enter Convenient Description");
//        ((Villa)villa).setConvenientDescription(sc.nextLine());
//        System.out.println("Enter Area Pool");
//        ((Villa)villa).setAreaPool(sc.nextDouble());
//        System.out.println("Enter Number of Floor");
//        ((Villa)villa).getNumberOfFloors();
//        System.out.println(villa.showInfor()) ;
        MainController.DisplayMainMenu();
    }
}
