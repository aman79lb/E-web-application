
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;              // Sales_Display_program

public class Read_Json_File {   ///C:\\Users\\pankaj\\Desktop\\test.txt
    public static void main(String[] args) {
        // Read the JSON data from file
        List<Sale> sales = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ACER\\Desktop\\16feb\\sales_data.json"))) {
            Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyyy hh:mm:ss a").create();
            Sale[] salesArray = gson.fromJson(reader, Sale[].class);
            Collections.addAll(sales, salesArray);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Sort the sales data by date
        Collections.sort(sales);

        // Display the sales data date-wise
        String currentDate = "";
        for (Sale sale : sales) {
            String saleDate = sale.getDate().substring(0, 10);
            if (!saleDate.equals(currentDate)) {
                System.out.println("Date: " + saleDate);
                System.out.println("---------------");
                currentDate = saleDate;
            }
            System.out.println(sale);
        }
    }
}





/*

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Read_Json_File {
    public static void main(String[] args) throws IOException {
        // Read JSON data from file
        ObjectMapper objectMapper = new ObjectMapper();
        List<Sale> sales = objectMapper.readValue(new File("data.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Sale.class));

        // Sort the list by date
        sales.sort(Comparator.comparing(Sale::getDate));

        // Display the content date-wise
        for (Sale sale : sales) {
            System.out.println("Date: " + sale.getDate());
            System.out.println("Employee Number: " + sale.getEmpNo());
            System.out.println("Name: " + sale.getName());
            System.out.println("City: " + sale.getCity());
            System.out.println("Product: " + sale.getProduct());
            System.out.println("Price: " + sale.getPrice());
            System.out.println("Quantity: " + sale.getPiece());
            System.out.println("Total: " + sale.getTotal());
            System.out.println();
        }
    }
}

*/