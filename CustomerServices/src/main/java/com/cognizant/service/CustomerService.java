package com.cognizant.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.CustomerJPA;
import com.cognizant.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;

import ch.qos.logback.core.net.ObjectWriter;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerJPA customer;
	
	public List<Customer> getAlldata()
	{
		
		return customer.findAll();
	}
	public List<String> getAllNameAndCity()
	{
		List<Customer> list=customer.findAll();
		
		return list.stream().map(cust->cust.getContactFirstName()+" "+cust.getCity()).toList();
	}
	public void hello()
	{
		File file =new File("C:\\Users\\91790\\Documents\\worldcities.csv");
		String d="C:\\Users\\91790\\Documents\\sd.json";
			 try (CSVReader reader = new CSVReader(new FileReader(file))) {
		            List<String[]> csvData = reader.readAll();

		            if (!csvData.isEmpty()) {
		                String[] headers = csvData.get(0);
		                List<Map<String, String>> jsonData =convertToMapList(csvData, headers);

		                ObjectMapper mapper = new ObjectMapper();
		                mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(d), jsonData);

		                System.out.println("Conversion completed. JSON data written to " + d);
		            } else {
		                System.out.println("CSV file is empty.");
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
	}
	
	private static List<Map<String, String>> convertToMapList(List<String[]> data, String[] headers) {
        List<Map<String, String>> jsonData = new ArrayList<>();

        for (int i = 1; i < data.size(); i++) {
            String[] row = data.get(i);
            Map<String, String> rowData = new LinkedHashMap<>();

            for (int j = 0; j < headers.length; j++) {
                rowData.put(headers[j], row[j]);
            }

            jsonData.add(rowData);
        }

        return jsonData;
    }
	

}
