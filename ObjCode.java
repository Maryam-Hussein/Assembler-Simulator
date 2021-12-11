package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class ObjCode
{
    static void printThree() throws Exception {
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

        HashMap<String, String> B = new HashMap<String, String>(); // B is name of Hash map of ASCII Code (HEX)
        B.put("A", "41");
        B.put("B", "42");
        B.put("C", "43");
        B.put("D", "44");

        /////////////////////////////////////////////////////////////////////////////////////////////////


        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\IdeaProjects\\EC 241 - Assmbler\\src\\com\\company\\input.txt"));
        String text;


        while ((text = bufferedReader.readLine()) != null) {
            String[] ABC = text.split("\\s");
            int LOC =-3;
            int x = 1;
            for (int i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            {
                for (int j = 1; j < ABC.length; j++) //Nested Loop  "flag X"
                {
                    if (ABC[j].equals(",X")) x = 1;
                    else x = 0;
                }

                if (ABC[i].equals("LDX")) {
                    LOC += 3;
                    System.out.println(A.get("LDX") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("LDCH")) {
                    LOC += 3;
                    System.out.println(A.get("LDCH") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("STCH")) {
                    LOC += 3;
                    System.out.println(A.get("STCH") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("TIX")) {
                    LOC += 3;
                    System.out.println(A.get("TIX") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("JLT")) {
                    LOC += 3;
                    System.out.println(A.get("JLT") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("JGT")) {
                    LOC += 3;
                    System.out.println(A.get("JGT") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("JEQ")) {
                    LOC += 3;
                    System.out.println(A.get("JEQ") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("DIV")) {
                    LOC += 3;
                    System.out.println(A.get("DIV") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("MUL")) {
                    LOC += 3;
                    System.out.println(A.get("MUL") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("SUB")) {
                    LOC += 3;
                    System.out.println(A.get("SUB") + x + Integer.toHexString(LOC));
                } else if (ABC[i].equals("ADD")) {
                    LOC += 3;
                    System.out.println(A.get("ADD") + x + Integer.toHexString(LOC));
                }

                /////////////////////////////////////////////////////////////////////////////////////////////////

                else if(ABC[i].equals("WORD"))
                {
                    LOC+=3;
                    for (int w = 1; w < ABC.length; w++) //Nested Loop to guss the number and make obj code for it :0
                    {
                        for (int num=0;num<2000;num++)
                            if(ABC[w].equals(Integer.toString(num)))
                            {
                                int number=Integer.parseInt(String.valueOf(num));
                                System.out.println(Integer.toHexString(number));
                            }
                    }
                }
                else if(ABC[i].equals("BYTE"))
                {
                    LOC+=3;
                    for (int b = 1; b < ABC.length; b++) //Nested Loop for ASCII Code
                    {
                            if (ABC[b].equals("A")){System.out.println(B.get("A"));}
                            else if (ABC[b].equals("B")){System.out.printf(B.get("B"));}
                            else if (ABC[b].equals("C")){System.out.printf(B.get("C"));}
                            else if (ABC[b].equals("D")){System.out.println(B.get("D"));}
                    }
                }
                else if(ABC[i].equals("RESB")){LOC+=3;}
                else if(ABC[i].equals("RESW")){LOC+=3;}

            }
        }
    }
}
