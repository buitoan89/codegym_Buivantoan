package controllers;

import commons.FuncWriteFileCSV;
import commons.FuncValidation;
import models.Customer;
import models.Services;
import models.SortName;
import models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner sc;

    public static void DisplayMainMenu() {
        sc = new Scanner(System.in);
        System.out.println("1. Add New Service" + "\n" +
                "2. Show Sevice" + "\n" +
                "3. Add New Customer" + "\n" +
                "4. Show information Customer" + "\n" +
                "5. Add New Booking Resort"+ "\n" +
                "6. Exit" + "\n" +
                "Please select one funtion below");
        switch (sc.nextLine()) {
            case "1":
                AddNewService();
                break;
            case "2":
                ShowSevice();
                break;
            case "3":
                AddNewCustomer();
                break;
            case "4":
                ShowInforCustomer();
                break;
            case: "5"
                    addNewBookingResort();break;
            case "6":
                System.exit(0);
            default:
                System.out.println("Error. Back to menu");
                backMainMenu();
        }
    }

    public static void ShowSevice() {

        System.out.println("\n.................");
        System.out.println("1. Show all Villa" + "\n" +
                "2. Show all House" + "\n" +
                "3. Show all Room" + "\n" +
                "4. Back to Menu" + "\n" +
                "5. Exit" + "\n" +
                "Please select one funtion below");
        switch (sc.nextLine()) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRoom();
                break;
            case "4":
                backMainMenu();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Error. Back to menu");
                backMainMenu();


        }
    }

    public static void AddNewCustomer() {
        System.out.println("\n.....................");
        Customer customer = new Customer();
        //customer.setId(UUID.randomUUID().toString().replace("-",""));
        customer.setId(UUID.randomUUID().toString().replace("-", ""));

        System.out.println("Enter name customer:");
        ((Customer) customer).setNameCustomer(sc.nextLine());
        while (!FuncValidation.CheckName(customer.getNameCustomer())) {
            System.out.println("Name service is invalid please try agiant!");
            System.out.println("Enter name customer");
            customer.setNameCustomer(sc.nextLine());
        }
        // gender customer

        System.out.println(" Enter gender customer:(male/female/unknow)");
        ((Customer) customer).setGender(sc.nextLine());

        while (!FuncValidation.CheckValedGender(customer.getGender())) {
            System.out.println("Gender is invalid please try agiant!");
            System.out.println("Enter gender customer");
            customer.setGender(sc.nextLine());
        }

        System.out.println("Enter id card customer");
        ((Customer) customer).setIdCart(sc.nextInt());

        System.out.println("Enter phone number:");
        ((Customer) customer).setPhoneNumber(sc.nextInt());
        sc.nextLine();
        // mail customer

        System.out.println("Enter mail customer:");
        ((Customer) customer).setEmail(sc.nextLine());

        while (!FuncValidation.CheckMail(customer.getEmail())) {
            System.out.println("Email is invalid please try agiant!");
            System.out.println("Enter mail customer");
            customer.setEmail(sc.nextLine());
        }

        System.out.println("Enter type customer:");
        ((Customer) customer).setTypeCustomer(sc.nextLine());

        System.out.println("Enter adress customer:");
        ((Customer) customer).setAdress(sc.nextLine());
        // birthday

        System.out.println("Enter birthday customer: (dd/mm/yy)");
        ((Customer) customer).setBirthday(sc.nextLine());

        while (!FuncValidation.checkBirthday(customer.getBirthday())) {
            System.out.println("Birthday is invalid please try agiant!");
            System.out.println("Enter birthday customer");
            customer.setBirthday(sc.nextLine());
        }

        ArrayList<Customer> listCustomer = FuncWriteFileCSV.getCustomerFromCSV();
        //sau khi thuc hien xong thi thuc hien them vao danh sach lish villa do
        listCustomer.add((Customer) customer);
        //sau do luu vao file villa.csv
        FuncWriteFileCSV.writeCustomerToFIleCSV(listCustomer);
        System.out.println("\nAdd Customer: " + customer.getNameCustomer() + " Customerfull!!");
        sc.nextLine();
        backMainMenu();
    }

    public static void ShowInforCustomer() {
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.getCustomerFromCSV();
        for (Customer customer : listCustomer) {
            System.out.println("\n-------");
            System.out.println(customer.toString());
            System.out.println("\n--------");
        }

    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n--------------");
            System.out.println(villa.showInfor());
            System.out.println("\n--------------");

        }

    }

    private static void showAllHouse() {
    }

    private static void showAllRoom() {
    }


    public static void backMainMenu() {

        System.out.println("\n Enter to contine...");
        sc.nextLine();
        System.out.println("\n....................");
        DisplayMainMenu();
    }

    public static void AddNewService() {

        System.out.println("\n.....................");

        System.out.println("1. Add New Villa" + "\n" +
                "2. Add New House" + "\n" +
                "3. Add New Room" + "\n" +
                "4. Back to Menu" + "\n" +
                "5. Exit" + "\n" +
                "Please select one funtion below");
        switch (sc.nextLine()) {
            case "1":
                AddNewVilla();
                break;
            case "2":
                AddNewHouse();
                break;
            case "3":
                AddNewRoom();
                break;
            case "4":
                backMainMenu();
            case "5":
                System.exit(0);
            default:
                System.out.println("Error. Back to menu");
                backMainMenu();
        }
    }

    //goi lai doi tuong service
    private static Services addService(Services services) {
        String content = "";
        String errMes = "";
        services.setId(UUID.randomUUID().toString().replace("-", ""));
        //   sc.nextLine();
        //Enter name sevice
        System.out.println("Enter name sevice: ");
        services.setName(sc.nextLine());
        while (!FuncValidation.CheckName(services.getName())) {
            System.out.println("Name service is invalid please try agiant!");
            System.out.println("Enter name service");
            services.setName(sc.nextLine());

        }
        //Enter name areaueds


        System.out.println("Enter Area used: ");
        services.setAreaUsed(sc.nextDouble());
        while (services.getAreaUsed() < 30) {
            content = "Enter area used";
            errMes = "Area used is inviled(Area > 30,Area must be double). please try agiant!";
            System.out.println(errMes);
            services.setAreaUsed(FuncValidation.CheckValedNumberDouble(content, errMes));

        }

        //Enter rent cost

        System.out.println("Enter Rent Cost: ");
        services.setRentalCost(sc.nextFloat());
        while (services.getRentalCost() <= 0) {
            content = "Enter rent cost";
            errMes = "Rent cost are positive numbers . please try agiant!";
            System.out.println(errMes);
            services.setRentalCost(FuncValidation.CheckValedNumberDouble(content, errMes));

        }
        //Enter Max number of people
        System.out.println("Enter Max number of people: ");
        services.setMaxNumberOfPeaple(sc.nextInt());
        while (services.getMaxNumberOfPeaple() < 0 || services.getMaxNumberOfPeaple() > 20) {
            System.out.println(errMes);
            services.setRentalCost(FuncValidation.CheckValedNumberInterger(content, errMes));
        }
        sc.nextLine();//pass Enter
        //Enter type Rent
        System.out.println("Enter type Rent: ");
        services.setTypeRent(sc.nextLine());

        return services;
    }

    private static void AddNewVilla() {
        String content = "";
        String errMes = "";

        //villa lay cac thuoc tinh cua service
        Services villa = new Villa();
        villa = addService(villa);

        //Enter Room Standard
        System.out.println("Enter Room Standard: ");
        ((Villa) villa).setRoomStandard(sc.nextLine());
        //     sc.nextLine();
        //Enter Description
        System.out.println("Enter Conveninent Description: ");
        ((Villa) villa).setConvenientDescription(sc.nextLine());
        //Enter number of Floor
        content = "Enter number of Floor";
        errMes = "Floor used is inviled(Floor > 0,Floor must Integer). please try agiant!";

        while (((Villa) villa).getNumberOfFloors() < 0) {
            System.out.println(errMes);
            ((Villa) villa).setNumberOfFloors(FuncValidation.CheckValedNumberInterger(content, errMes));

        }
        System.out.println("Enter number of Floor: ");
        ((Villa) villa).setNumberOfFloors(sc.nextInt());
        //cach khac phuc issue ko luu duoc nhieu vila trong file
        //tao ra mang arraylist va add mang do
        //truoc khi thuc hien vao file chung ta lay ra toan bo danh sach
        //cac villa trong file villa ra list villa
        ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
        //sau khi thuc hien xong thi thuc hien them vao danh sach lish villa do
        listVilla.add((Villa) villa);
        //sau do luu vao file villa.csv
        FuncWriteFileCSV.writeVillaToFIleCSV(listVilla);
        System.out.println("\nAdd Villa: " + villa.getName() + " Servicefull!!");
        sc.nextLine();
        backMainMenu();


    }
    private static void addNewBookingResort(){
        ArrayList<Customer> listCustomers = FuncWriteFileCSV.getCustomerFromCSV();
        //Sap xep alpha B theo ten
        listCustomers.sort(new SortName());
        int i = 1;
        for (Customer customer : listCustomers) {
            System.out.println("\n---------------------------------------------");
            System.out.println("No: " + i);
            System.out.println(customer.toString());
            System.out.println("\n---------------------------------------------");
            i++;
        }
        System.out.println("Choose Customer Booking");
        Customer customer = new Customer();
        customer = listCustomers.get(sc.nextInt() - 1);
        System.out.println("\n1.Booking Villa." +
                "\n2.Booking House." +
                "\n3.Booking Room.");
        System.out.println("Choose Services Booking");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                i = 1;
                ArrayList<Villa> listVillas = FuncWriteFileCSV.getVillaFromCSV();
                for (Villa villa : listVillas) {
                    System.out.println("\n---------------------------------------------");
                    System.out.println("No: " + i);
                    System.out.println(villa.showInfor());
                    System.out.println("\n---------------------------------------------");
                    i++;
                }
                System.out.println("Choose Villa Booking");
                Villa villa = listVillas.get(sc.nextInt() - 1);
                customer.setServices(villa);
                break;
            case 2:
//                i = 1;
//                ArrayList<House> listHouses = FuncWriteAndReadFileCSV.getHouseFromCSV();
//                for (House house : listHouses) {
//                    System.out.println("\n---------------------------------------------");
//                    System.out.println("No: " + i);
//                    System.out.println(house.showInfor());
//                    System.out.println("\n---------------------------------------------");
//                    i++;
//                }
                System.out.println("Choose House Booking");
//                House house = listHouses.get(ScannerUtils.scanner.nextInt() - 1);
//                customer.setServices(house);
                break;
            case 3:
//                i = 1;
//                ArrayList<Room> listRooms = FuncWriteAndReadFileCSV.getRoomFromCSV();
//                for (Room room : listRooms) {
//                    System.out.println("\n---------------------------------------------");
//                    System.out.println("No: " + i);
//                    System.out.println(room.showInfor());
//                    System.out.println("\n---------------------------------------------");
//                    i++;
//                }
                System.out.println("Choose Room Booking");
//                Room room = listRooms.get(ScannerUtils.scanner.nextInt() - 1);
//                customer.setServices(room);
                break;
            default:
                backMainMenu();
                break;
        }


        ArrayList<Customer> listBooking = FuncWriteFileCSV.getBookingFromCSV();
        listBooking.add(customer);
            FuncWriteFileCSV.writeBookingToFIleCSV(listBooking);
        System.out.println("\nAdd Booking for : " + customer.getNameCustomer() + " Successfully !!!");
        sc.nextLine();
        backMainMenu();
    }


    private static void AddNewHouse() {

    }

    private static void AddNewRoom() {
    }

}
