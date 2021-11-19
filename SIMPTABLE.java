package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class SIMPTABLE
{

    static void printTwo() throws Exception
    {
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
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\IdeaProjects\\EC 241 - Assmbler\\src\\com\\company\\input.txt"));
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            String ABC[] = text.split("\\s");
            int i;
            for (i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            {
                String LouctionCounter = new String();
                LouctionCounter = ABC[5];

                //LouctionCounter += 3;
                if (ABC[i].equals("LDX")) {
                    System.out.println(A.get("LDX"));
                    //LouctionCounter += 3;
                } else if (ABC[i].equals("LDCH")) {
                    System.out.println(A.get("LDCH"));
                    //LouctionCounter += 3;
                } else if (ABC[i].equals("STCH")) {
                    System.out.println(A.get("STCH"));
                   // LouctionCounter += 3;
                } else if (ABC[i].equals("TIX")) {
                    System.out.println(A.get("TIX"));
                   // LouctionCounter += 3;
                } else if (ABC[i].equals("JLT")) {
                    System.out.println(A.get("JLT"));
                  //  LouctionCounter += 3;
                } else if (ABC[i].equals("JGT")) {
                    System.out.println(A.get("JGT"));
                    //LouctionCounter += 3;
                } else if (ABC[i].equals("JEQ")) {
                    System.out.println(A.get("JEQ"));
                   // LouctionCounter += 3;
                } else if (ABC[i].equals("DIV")) {
                    System.out.println(A.get("DIV"));
                   // LouctionCounter += 3;
                } else if (ABC[i].equals("MUL")) {
                    System.out.println(A.get("MUL"));
                   // LouctionCounter += 3;
                } else if (ABC[i].equals("SUB")) {
                    System.out.println(A.get("SUB"));
                   // LouctionCounter += 3;
                } else if (ABC[i].equals("ADD")) {
                    System.out.println(A.get("ADD"));
                   // LouctionCounter += 3;
                }
            }
        }
    }

}
