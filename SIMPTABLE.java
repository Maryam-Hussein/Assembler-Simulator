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
        while ((text = bufferedReader.readLine()) != null)
        {

            String ABC[] = text.split("\\s");
            int i;
            String x = ABC[5];
            Integer LouctionCounter = Integer.valueOf(x);

            for (i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            {

                if (ABC[i].equals("LDX")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("LDX")+"           "+LouctionCounter);
                }
                else if (ABC[i].equals("LDCH")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("LDCH")+"           "+LouctionCounter);
                } else if (ABC[i].equals("STCH")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("STCH")+"           "+LouctionCounter);
                } else if (ABC[i].equals("TIX")) {
                   LouctionCounter+=3;
                    System.out.println(A.get("TIX")+"           "+LouctionCounter);
                } else if (ABC[i].equals("JLT")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("JLT")+"           "+LouctionCounter);
                } else if (ABC[i].equals("JGT")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("JGT")+"           "+LouctionCounter);
                } else if (ABC[i].equals("JEQ")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("JEQ")+"           "+LouctionCounter);
                } else if (ABC[i].equals("DIV")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("DIV")+"           "+LouctionCounter);
                } else if (ABC[i].equals("MUL")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("MUL"));
                } else if (ABC[i].equals("SUB")) {
                    LouctionCounter+=3;
                    System.out.println(A.get("SUB")+"           "+LouctionCounter);
                } else if (ABC[i].equals("ADD")) {
                    LouctionCounter += 3;
                    System.out.println(A.get("ADD")+"           "+LouctionCounter);
                }
            }
        }
    }

}
