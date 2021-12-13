package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
public class OPTABLE
{
    void printOne() throws Exception {
        // Hash map act as database
        HashMap<String, String> A = new HashMap<String, String>(); // A is name of Hash map
        A.put("LDX", "04");
        A.put("LDCH", "50");
        A.put("STCH", "54");
        A.put("TIX", "2C");
        A.put("JLT", "38");
        A.put("JGT", "34");
        A.put("JEQ", "30");
        A.put("DIV", "24");
        A.put("MUL", "20");
        A.put("SUB", "1C");
        A.put("ADD", "18");


        /////////////////////////////////////////////////////////////////////////////////////////////////

        // BufferedReader is better from FileReader (fast,store ata in new place,take more code..)
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\IdeaProjects\\EC 241 - Assmbler\\src\\com\\company\\input.txt"));
        String text; //place to store the assembly program in BufferedReader
        while ((text = bufferedReader.readLine()) != null) { // loop to check every line is readied
            String ABC[] = text.split("\\s"); // Array to split text
            int i;
            for (i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            { // For loop to store every word in ABC[] according to space

                //if Conditions to search in instruction
                if (ABC[i].equals("LDX")) {
                    System.out.println(ABC[i] + "                " + A.get("LDX"));
                } else if (ABC[i].equals("LDCH")) {
                    System.out.println(ABC[i] + "               " + A.get("LDCH"));
                } else if (ABC[i].equals("STCH")) {
                    System.out.println(ABC[i] + "               " + A.get("STCH"));
                } else if (ABC[i].equals("TIX")) {
                    System.out.println(ABC[i] + "                " + A.get("TIX"));
                } else if (ABC[i].equals("JLT")) {
                    System.out.println(ABC[i] + "                " + A.get("JLT"));
                } else if (ABC[i].equals("JGT")) {
                    System.out.println(ABC[i] + "                " + A.get("JGT"));
                } else if (ABC[i].equals("JEQ")) {
                    System.out.println(ABC[i] + "                " + A.get("JEQ"));
                } else if (ABC[i].equals("DIV")) {
                    System.out.println(ABC[i] + "                " + A.get("DIV"));
                } else if (ABC[i].equals("MUL")) {
                    System.out.println(ABC[i] + "                " + A.get("MUL"));
                } else if (ABC[i].equals("SUB")) {
                    System.out.println(ABC[i] + "                " + A.get("SUB"));
                } else if (ABC[i].equals("ADD")) {
                    System.out.println(ABC[i] + "                " + A.get("ADD"));
                }
            }
        }
    }
}