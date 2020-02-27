package q1_3;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class DataAnalyzerTester {

    private PrintStream printStream;


    /**
     * Constructs a DataAnalyzerTest object that creates a a file and printStream object.
     * File is created at the same location of execution.
     * Exits the program if the file is failed to be created.
     *
     * @param filename String value for the file name.
     */
    public DataAnalyzerTester(String filename) {
        try {
            printStream = new PrintStream(new File(filename + ".txt"));
        } catch (IOException e) {
            System.out.println("ERROR | File creation failed | " + e.getMessage());
            System.exit(1);
        }
    }

    /**
     * Writes to file with the message.
     *
     * @param message String to be printed in file.
     */
    public void printToFile(String message) {
        printStream.println(message);
    }

    /**
     * Writes message to both console and file.
     *
     * @param message String to be printed.
     */
    public void printToFileAndConsole(String message) {
        printStream.println(message);
        System.out.println(message);
    }

    /***
     * Closes file created during construction of the object.
     */
    public void closeFile() {
        printStream.close();
    }


    public static void main(String[] args) throws IOException {
        //File Creation
        DataAnalyzerTester dataAnalyzerTester = null;
        if (args[0] != null) {
            dataAnalyzerTester = new DataAnalyzerTester(args[0]);
        } else {
            System.out.println("ERROR | File name was not provided.");
            System.exit(1);
        }

        //Getting numbers from user input
        Scanner scanner = new Scanner(System.in);
        int newInt;
        LinkedList<Integer> numlist = new LinkedList<>();
        System.out.println("Enter \"q\" to start calculation.");
        System.out.print("Enter Integer: ");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                newInt = scanner.nextInt();
                dataAnalyzerTester.printToFile(String.valueOf(newInt));
                numlist.add(newInt);
            } else if (scanner.next().equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Invalid entry. Try again.");
            }
            System.out.print("Enter Integer: ");
        }


        if (numlist.size() < 1) {
            System.out.println("ERROR | No numbers were provided by user.");
            System.exit(1);
        }

        System.out.println("\nStating calculation...\n");

        //Number calculation and printing section
        DataAnalyzer dataAnalyzer = new DataAnalyzer(numlist);
        dataAnalyzerTester.printToFileAndConsole("Min number is: " + dataAnalyzer.min());
        dataAnalyzerTester.printToFileAndConsole("Max number is: " + dataAnalyzer.max());
        dataAnalyzerTester.printToFileAndConsole("Average is: " + dataAnalyzer.average());

        //File Closure
        dataAnalyzerTester.closeFile();
    }
}
