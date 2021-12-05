package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class SIMPTABLE extends OPTABLE
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
            String[] ABC = text.split("\\s");

            for (int i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            {
                if (ABC[i].equals("LDX")) {
                    SIMPTABLE LDX = new SIMPTABLE();
                    System.out.println(A.get("LDX")+"           "+LDX);
                }
                else if (ABC[i].equals("LDCH")) {
                    SIMPTABLE LDCH = new SIMPTABLE();
                    System.out.println(A.get("LDCH")+"           "+LDCH);
                } else if (ABC[i].equals("STCH")) {
                    SIMPTABLE STCH = new SIMPTABLE();
                    System.out.println(A.get("STCH")+"           "+STCH);
                } else if (ABC[i].equals("TIX")) {
                    SIMPTABLE TIX = new SIMPTABLE();
                    System.out.println(A.get("TIX")+"           "+TIX);
                } else if (ABC[i].equals("JLT")) {
                    SIMPTABLE JLT = new SIMPTABLE();
                    System.out.println(A.get("JLT")+"           "+JLT);
                } else if (ABC[i].equals("JGT")) {
                    SIMPTABLE JGT = new SIMPTABLE();
                    System.out.println(A.get("JGT")+"           "+JGT);
                } else if (ABC[i].equals("JEQ")) {
                    SIMPTABLE JEQ = new SIMPTABLE();
                    System.out.println(A.get("JEQ")+"           "+JEQ);
                } else if (ABC[i].equals("DIV")) {
                    SIMPTABLE DIV = new SIMPTABLE();
                    System.out.println(A.get("DIV")+"           "+DIV);
                } else if (ABC[i].equals("MUL")) {
                    SIMPTABLE MUL = new SIMPTABLE();
                    System.out.println(A.get("MUL")+"           "+MUL);
                } else if (ABC[i].equals("SUB")) {
                    SIMPTABLE SUB = new SIMPTABLE();
                    System.out.println(A.get("SUB")+"           "+SUB);
                } else if (ABC[i].equals("ADD")) {
                    SIMPTABLE ADD = new SIMPTABLE();
                    System.out.println(A.get("ADD")+"           "+ADD);
                }
            }
        }
    }
}