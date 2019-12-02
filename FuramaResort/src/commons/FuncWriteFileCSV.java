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
//the line number to skip for star reading
    private static final int NUM_OF_LINE_SKIP = 1;

    //header villa.csv
    private static String[] headerRecordVilla = new String[]{"id", "name", "areaUsed", "rentalCost", "maxNumberOfPeaple", "typeRent",
            "roomStandard", "convenientDescription", "areaPool", "numberOfFloors"};

    //function write file villa to file csv
    public static void writeVillaToFIleCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
                CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,CSVWriter.DEFAULT_LINE_END)){
                 csvWriter.writeNext(headerRecordVilla);

            for (Villa villa : arrayList){
                csvWriter.writeNext( new String[] {
                    villa.getId(),villa.getName(),
                            String.valueOf(villa.getAreaUsed()),
                            String.valueOf(villa.getRentalCost()),
                            String.valueOf(villa.getMaxNumberOfPeaple()),
                            villa.getTypeRent(),villa.getRoomStandard(),villa.getConvenientDescription(),
                            String.valueOf(villa.getAreaPool()),
                            String.valueOf(villa.getNumberOfFloors())});
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }


    }
    //function get list villa from file CSV
    public static ArrayList<Villa> getVillaFromCSV(){
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)){
            try{
                Writer writer = new FileWriter(pathVilla);

            }catch (IOException e){
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
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return (ArrayList<Villa>) CsvToBean.parse();
    }

    public static ArrayList<Customer> getCustomerFromCSV(){
        
    };
}
