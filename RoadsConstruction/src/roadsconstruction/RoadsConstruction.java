/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roadsconstruction;

import java.util.Scanner;

/**
 *
 * @author damia
 */
public class RoadsConstruction {

    //instantiated variables
    static int[] totalRoads = new int[3];
    static String[] headings = {"Cape Town", "Johannesburg", "Port Elizabeth"};
    static String subHeading = "Roads Constructed";

    public static void main(String[] args) {

        userCapture();

        report();

    }

    //capture user input
    public static void userCapture() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of roads constructed for Cape Town: ");
        int CPT = input.nextInt();
        System.out.println("Enter the number of roads constructed for Jhannesburg: ");
        int JHB = input.nextInt();
        System.out.println("Enter the number of roads constructed for Port Elizabeth: ");
        int PE = input.nextInt();

        //assign values into array
        totalRoads[0] = CPT;
        totalRoads[1] = JHB;
        totalRoads[2] = PE;

    }

    //find maximum value and return the index position
    public static int getMax() {

        //set max to be the first value in data array
        
        int index = 0;

        //iterate through the array to find the maximum value
        for (int col = 0; col < totalRoads.length; col++) {

            if (totalRoads[col] < totalRoads[col + 1]) {

                index++;

            }

        }

        return index;

    }

    //display report in requested output
    public static void report() {
        String asterix = "*************************************";
        String header = "ROAD CONSTRUCTION REPORT";

        System.out.println(asterix);
        System.out.println(header);
        System.out.println(asterix);

        String sub = String.format("%-15s %-10s ", "", subHeading);
        System.out.println(sub);

        String output = "";
        for (int i = 0; i < totalRoads.length; i++) {
            // Format the array data 
            output += String.format("%-15s %-10d \n",
                    headings[i], totalRoads[i]);
        }

        // Print the report content
        System.out.println(output);
        System.out.println("\nCITY WITH THE MOST ROAD CONSTRUCTION :" + headings[getMax()]);
        System.out.println(asterix);

    }

}
