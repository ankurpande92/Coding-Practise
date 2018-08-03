package com.practise;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class MinAvgMarkForEachStudent {
    public static int processData(ArrayList<String> array) {
    	  /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
		TreeMap<String, String> treeMap = new TreeMap<>();
		for (String string : array) {
			String[] str = string.split(", ");
		
			// Check TreeMap has already entry for same StudentID
			if (treeMap.containsKey(str[0])){
				String  value = treeMap.get(str[0]);	
				value +=" "+ str[2];
				treeMap.put(str[0], value);
			}else{
				// Add new entry to TreeMap with for StudentId
				treeMap.put(str[0], str[2]);
			}				
		}
		
		//get the first entry for Treeset which lowestId for Student
		String resultSet = treeMap.firstEntry().getValue();
		String[] marksList =  resultSet.split(" ");
		
		//calculate average 
		int avgMarks = 0;
		for (String eachMark : marksList) {
			avgMarks += Integer.parseInt(eachMark);
		}
    	return avgMarks/marksList.length;//Return Avg of lowest StudentId
    }
    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                    inputData.add(line);
            }
            //call ProcessData Function 
            int retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
