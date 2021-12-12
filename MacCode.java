package com.company;
import java.io.*;
import java.util.HashMap;

public class MacCode {
    static void printFour() throws Exception {
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

        HashMap<String, String> B = new HashMap<String, String>(); // B is name of Hash map of ASCII Code (Binary)
        B.put("A", "01000001");
        B.put("B", "01000010");
        B.put("C", "01000011");
        B.put("D", "01000100");

        /////////////////////////////////////////////////////////////////////////////////////////////////


        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\IdeaProjects\\EC 241 - Project\\src\\com\\company\\input.txt"));
        File file = new File("Machine Code.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        ////////////////////////////////////////////////////////////////////////////////////////////////

        String text;
        int LOC = 0;
        while ((text = bufferedReader.readLine()) != null) {
            String[] ABC = text.split("\\s");
            int x = 1;
            for (int i = 1; i < ABC.length; i++) // ABC is name of Array of Strings --> input.txt
            {
                for (int j = 1; j < ABC.length; j++) //Nested Loop  "flag X"
                {
                    if (ABC[j].equals(",X")) x = 1;
                    else x = 0;
                }

                for (int j = 1; j < ABC.length; j++) //Nested Loop to set LOC
                {
                    if (ABC[j].equals("START")) // Program won't run without word "START"
                    {
                        for (int k = 1; k < ABC.length; k++)
                            try {
                                LOC = Integer.parseInt(ABC[k]);
                                LOC -=3;
                            }catch (NumberFormatException ignored){}
                    }
                }

                /////////////////////////////////////////////////////////////////////////////////////////////////

                for (int j = 1; j < ABC.length; j++) //Nested Loop to set LOC
                {
                    if (ABC[j].equals("START")) // Program won't run without word "START"
                    {
                        for (int k = 1; k < ABC.length; k++)
                            try {
                                LOC = Integer.parseInt(ABC[k]);
                            }catch (NumberFormatException ignored){}
                    }
                }


                if (ABC[i].equals("LDX")) {
                    LOC += 3;
                    String LDX = A.get("LDX") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(LDX, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(LDX, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("LDCH")) {
                    LOC += 3;
                    String LDCH = A.get("LDCH") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(LDCH, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(LDCH, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("STCH")) {
                    LOC += 3;
                    String STCH = A.get("STCH") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(STCH, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(STCH, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("TIX")) {
                    LOC += 3;
                    String TIX = A.get("TIX") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(TIX, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(TIX, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("JLT")) {
                    LOC += 3;
                    String JLT = A.get("JLT") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(JLT, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(JLT, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("JGT")) {
                    LOC += 3;
                    String JGT = A.get("JGT") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(JGT, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(JGT, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("JEQ")) {
                    LOC += 3;
                    String JEQ = A.get("JEQ") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(JEQ, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(JEQ, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("DIV")) {
                    LOC += 3;
                    String DIV = A.get("DIV") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(DIV, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(DIV, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("MUL")) {
                    LOC += 3;
                    String MUL = A.get("MUL") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(MUL, 16)));
                    bufferedWriter.write(Integer.parseInt(MUL, 16));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("SUB")) {
                    LOC += 3;
                    String SUB = A.get("SUB") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(SUB, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(SUB, 16)));
                    bufferedWriter.newLine();
                } else if (ABC[i].equals("ADD")) {
                    LOC += 3;
                    String ADD = A.get("ADD") + x + Integer.toHexString(LOC);
                    System.out.println(Integer.toBinaryString(Integer.parseInt(ADD, 16)));
                    bufferedWriter.write(Integer.toBinaryString(Integer.parseInt(ADD, 16)));
                    bufferedWriter.newLine();
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
                                System.out.println(Integer.toBinaryString(number));
                                bufferedWriter.write(Integer.toBinaryString(number));
                                bufferedWriter.newLine();
                            }
                    }
                }
                else if(ABC[i].equals("BYTE"))
                {
                    for (int b = 1; b < ABC.length; b++) //Nested Loop for ASCII Code
                    {
                        if (ABC[b].equals("A")){System.out.printf(B.get("A"));bufferedWriter.write(B.get("A"));LOC++;}
                        else if (ABC[b].equals("B")){System.out.printf(B.get("B"));bufferedWriter.write(B.get("B"));LOC++;}
                        else if (ABC[b].equals("C")){System.out.printf(B.get("C"));bufferedWriter.write(B.get("C"));LOC++;}
                        else if (ABC[b].equals("D")){System.out.printf(B.get("D"));bufferedWriter.write(B.get("D"));LOC++;}
                    }System.out.println(" ");
                    bufferedWriter.newLine();
                }
                else if(ABC[i].equals("RESB")){LOC++;}
                else if(ABC[i].equals("RESW")){LOC+=3;}
            }
        }
        bufferedWriter.close();
    }
}