package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Objects;

public class ObjCode<LDX> // Object code in HEX System
{
    static void printThree() throws Exception
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
            String[] ABC = text.split("\\s");
            int x = 0;
            for (int i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            {


                    do {
                    if (ABC[i].equals("LDX")) {
                        SIMPTABLE LDX = new SIMPTABLE();
                        System.out.println(A.get("LDX") + x + LDX);
                    } else if (ABC[i].equals("LDCH")) {
                        SIMPTABLE LDCH = new SIMPTABLE();
                        System.out.println(A.get("LDCH") + x + LDCH);
                    } else if (ABC[i].equals("STCH")) {
                        SIMPTABLE STCH = new SIMPTABLE();
                        System.out.println(A.get("STCH") + x + STCH);
                    } else if (ABC[i].equals("TIX")) {
                        SIMPTABLE TIX = new SIMPTABLE();
                        System.out.println(A.get("TIX") + x + TIX);
                    } else if (ABC[i].equals("JLT")) {
                        SIMPTABLE JLT = new SIMPTABLE();
                        System.out.println(A.get("JLT") + x + JLT);
                    } else if (ABC[i].equals("JGT")) {
                        SIMPTABLE JGT = new SIMPTABLE();
                        System.out.println(A.get("JGT") + x + JGT);
                    } else if (ABC[i].equals("JEQ")) {
                        SIMPTABLE JEQ = new SIMPTABLE();
                        System.out.println(A.get("JEQ") + x + JEQ);
                    } else if (ABC[i].equals("DIV")) {
                        SIMPTABLE DIV = new SIMPTABLE();
                        System.out.println(A.get("DIV") + x + DIV);
                    } else if (ABC[i].equals("MUL")) {
                        SIMPTABLE MUL = new SIMPTABLE();
                        System.out.println(A.get("MUL") + x + MUL);
                    } else if (ABC[i].equals("SUB")) {
                        SIMPTABLE SUB = new SIMPTABLE();
                        System.out.println(A.get("SUB") + x + SUB);
                    } else if (ABC[i].equals("ADD")) {
                        SIMPTABLE ADD = new SIMPTABLE();
                        System.out.println(A.get("ADD") + x + ADD);
                    }
                }while (ABC[i].equals(",X"));
            }
        }
    }


    static void printFour() throws Exception
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
            String[] ABC = text.split("\\s");
            int x = 1;
            for (int i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            {


                do {
                    if (ABC[i].equals("LDX")) {
                        SIMPTABLE LDX = new SIMPTABLE();
                        System.out.println(A.get("LDX") + x + LDX);
                    } else if (ABC[i].equals("LDCH")) {
                        SIMPTABLE LDCH = new SIMPTABLE();
                        System.out.println(A.get("LDCH") + x + LDCH);
                    } else if (ABC[i].equals("STCH")) {
                        SIMPTABLE STCH = new SIMPTABLE();
                        System.out.println(A.get("STCH") + x + STCH);
                    } else if (ABC[i].equals("TIX")) {
                        SIMPTABLE TIX = new SIMPTABLE();
                        System.out.println(A.get("TIX") + x + TIX);
                    } else if (ABC[i].equals("JLT")) {
                        SIMPTABLE JLT = new SIMPTABLE();
                        System.out.println(A.get("JLT") + x + JLT);
                    } else if (ABC[i].equals("JGT")) {
                        SIMPTABLE JGT = new SIMPTABLE();
                        System.out.println(A.get("JGT") + x + JGT);
                    } else if (ABC[i].equals("JEQ")) {
                        SIMPTABLE JEQ = new SIMPTABLE();
                        System.out.println(A.get("JEQ") + x + JEQ);
                    } else if (ABC[i].equals("DIV")) {
                        SIMPTABLE DIV = new SIMPTABLE();
                        System.out.println(A.get("DIV") + x + DIV);
                    } else if (ABC[i].equals("MUL")) {
                        SIMPTABLE MUL = new SIMPTABLE();
                        System.out.println(A.get("MUL") + x + MUL);
                    } else if (ABC[i].equals("SUB")) {
                        SIMPTABLE SUB = new SIMPTABLE();
                        System.out.println(A.get("SUB") + x + SUB);
                    } else if (ABC[i].equals("ADD")) {
                        SIMPTABLE ADD = new SIMPTABLE();
                        System.out.println(A.get("ADD") + x + ADD);
                    }
                }while (!ABC[i].equals(",X"));
            }
        }
    }
}
