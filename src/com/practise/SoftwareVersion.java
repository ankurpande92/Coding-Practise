package com.practise;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SoftwareVersion {

	public List<String> processFile(ArrayList<String> inputData){
		
		//create list of all out dated softwares
		List<String> list = new ArrayList<String>();
		Map<String, String> map = new HashMap<>();
		for (String string : inputData) {
			String[] str = string.split(", ");
		
			//check map with same software with same version name
			if (map.containsKey(str[2]) && map.containsValue(str[3])){
					list.add(str[2]);	
			}else{
				// add entry to map if already not present
				map.put(str[2], str[3]);
			}				
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		
		SoftwareVersion ver = new SoftwareVersion();
		ArrayList<String> inputData = new ArrayList<String>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                    inputData.add(line);
            }
            List<String> result = ver.processFile(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for (String string : result) {
            	output.print(string + ",");
			}
            
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
		
		

	}

}
