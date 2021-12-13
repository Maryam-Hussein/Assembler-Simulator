package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class SIMPTABLE {
    static void printTwo() throws Exception {
        // Hash map act as database
        HashMap<String, String> A = new HashMap<String, String>(); // A is name of Hash map of instruction
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
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\IdeaProjects\\EC 241 - Project\\src\\com\\company\\input.txt"));
        String text; //place to store the assembly program in BufferedReader
        int LOC = 0; //Location Counter
        while ((text = bufferedReader.readLine()) != null) { // loop to check every line is readied
            String[] ABC = text.split("\\s"); // Array to split text
            for (int i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            { // For loop to store every word in ABC[] according to space
                for (int j = 1; j < ABC.length; j++) //Nested Loop to set LOC
                {
                    if (ABC[j].equals("START")) // Program won't run without word "START"
                    {
                        for (int k = 1; k < ABC.length; k++)
                            try {
                                LOC = Integer.parseInt(ABC[k],16);
                                LOC -=3;
                            }catch (NumberFormatException ignored){}  //to avoid error of convert String to Integer
                    }
                }

                /////////////////////////////////////////////////////////////////////////////////////////////////

                //if Conditions to search in instruction
                if (ABC[i].equals("LDX")) {
                    LOC+=3; // in SIC every instruction take '3 Byte == 1 Word'
                    System.out.println(A.get("LDX") + "           " + Integer.toHexString(LOC)); // toHexString convert Integer from decimal value to Hex
                } else if (ABC[i].equals("LDCH")) {
                    LOC += 3;
                    System.out.println(A.get("LDCH") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("STCH")) {
                    LOC += 3;
                    System.out.println(A.get("STCH") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("TIX")) {
                    LOC += 3;
                    System.out.println(A.get("TIX") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("JLT")) {
                    LOC += 3;
                    System.out.println(A.get("JLT") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("JGT")) {
                    LOC += 3;
                    System.out.println(A.get("JGT") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("JEQ")) {
                    LOC += 3;
                    System.out.println(A.get("JEQ") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("DIV")) {
                    LOC += 3;
                    System.out.println(A.get("DIV") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("MUL")) {
                    LOC += 3;
                    System.out.println(A.get("MUL") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("SUB")) {
                    LOC += 3;
                    System.out.println(A.get("SUB") + "           " + Integer.toHexString(LOC));
                } else if (ABC[i].equals("ADD")) {
                    LOC += 3;
                    System.out.println(A.get("ADD") + "           " + Integer.toHexString(LOC));
                }

                /*else if(ABC[i].equals("WORD")){LOC+=3;}
             else if(ABC[i].equals("BYTE")){LOC++;}
             else if (ABC[i].equals("RESB")){LOC+=Integer.parseInt(ABC[i+2]);}
             else if (ABC[i].equals("RESW")) {LOC+=Integer.parseInt(ABC[i+2]);}*/
            }
        }
    }
}
