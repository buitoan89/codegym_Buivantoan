package commons;

import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Customer;
import models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    //path file villa.csv
    private static final String pathVilla = "src/data/Villa.csv";
    //path file customer.csv
    private static final String pathCustomer = "src/data/Customer.csv";
    //path file booking.csv
    private static final String pathFileBooking = "src/data/FileBooking.csv";
    //the line number to skip for star reading
    private static final int NUM_OF_LINE_SKIP = 1;

    //header villa.csv
    private static String[] headerRecordVilla = new String[]{"id", "name", "areaUsed", "rentalCost", "maxNumberOfPeaple", "typeRent",
            "roomStandard", "convenientDescription", "areaPool", "numberOfFloors"};
    //header customer.csv
    private static String[] headerRecordCustomer = new String[]{"id", "nameCustomer", "birthday", "render", "idCart",
            "phoneNumber", "email", "typeCustomer", "adress"};
    //header booking.csv
    private static String[] headerRecordBooking = new String[]{
            "id", "name", "areaUsed", "rentalCost", "maxNumberOfPeaple", "typeRent",
            "id", "nameCustomer", "birthday", "render", "idCart",
            "phoneNumber", "email", "typeCustomer", "adress"};

    //function write file villa to file csv
    public static void writeVillaToFIleCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);

            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getName(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentalCost()),
                        String.valueOf(villa.getMaxNumberOfPeaple()),
                        villa.getTypeRent(), villa.getRoomStandard(), villa.getConvenientDescription(),
                        String.valueOf(villa.getAreaPool()),
                        String.valueOf(villa.getNumberOfFloors())});
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }

    //function get list villa from file CSV
    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        //tao ra mot dong mapping den class villa
        // lay cac thuoc tinh cua villa
        //cai lap voi header record villa
        //tao ra mot danh sach CsvToBean
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> CsvToBean = null;
        try {
            //tao file xu ly anh xa den villa , xu ly tach , " ra khoi mang chi co mot dong
            CsvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return (ArrayList<Villa>) CsvToBean.parse();
    }

    //function write file customer to file csv
    public static void writeCustomerToFIleCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);

            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getId(), customer.getNameCustomer(),
                        String.valueOf(customer.getBirthday()), customer.getGender(),
                        String.valueOf(customer.getIdCard()), String.valueOf(customer.getPhoneNumber()),
                        customer.getEmail(), String.valueOf(customer.getTypeCustomer()),
                        String.valueOf(customer.getAdress()),
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }

    //    function get list customer to csv
    public static ArrayList<Customer> getCustomerFromCSV() {
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }

        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> CsvToBean = null;
        try {
            //tao file xu ly anh xa den villa , xu ly tach , " ra khoi mang chi co mot dong
            CsvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return (ArrayList<Customer>) CsvToBean.parse();
    }


    //function writer and get booking
    public static void writeBookingToFIleCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathFileBooking);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {

            csvWriter.writeNext(headerRecordBooking);

            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getId(), customer.getNameCustomer(),
                        String.valueOf(customer.getBirthday()), customer.getGender(),
                        String.valueOf(customer.getIdCard()), String.valueOf(customer.getPhoneNumber()),
                        customer.getEmail(), String.valueOf(customer.getTypeCustomer()),
                        String.valueOf(customer.getAdress()),
                        customer.getServices().getId(), customer.getServices().getName(),
                        String.valueOf(customer.getServices().getAreaUsed()),
                        String.valueOf(customer.getServices().getRentalCost()),
                        String.valueOf(customer.getServices().getMaxNumberOfPeaple()),
                        String.valueOf(customer.getServices().getTypeRent())
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }

    //    function get list booking to csv
    public static ArrayList<Customer> getBookingFromCSV() {
        Path path = Paths.get(pathFileBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> CsvToBean = null;
        try {
            //tao file xu ly anh xa den villa , xu ly tach , " ra khoi mang chi co mot dong
            CsvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return (ArrayList<Customer>) CsvToBean.parse();
    }


}
