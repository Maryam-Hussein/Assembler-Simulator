package com.company;
import java.io.*;
public class ObProgram
{
    static void printFive() throws Exception {

        // BufferedReader is better from FileReader (fast,store ata in new place,take more code..)
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\IdeaProjects\\EC 241 - Project\\Object Code.txt"));

        String text;
        text = bufferedReader.readLine();
        String Location = text.substring(5);
        String text2 =text;

        System.out.print("H^" + text.substring(0, 4) + "^" + Location + "^");

        String []CFD=text2.split("\\s");
        for(int i=0;i<CFD.length;i++)
        {
            String Location2 = text2.substring(5);
            int m = Integer.parseInt(String.valueOf(CFD.length));
            Integer.toHexString(m);
            System.out.print(m);
        }

        System.out.println(" ");
        System.out.print("T^" + Location + "^");

        while ((text = bufferedReader.readLine()) != null) {

            String[] ABC = text.split("\\s");
            System.out.print(ABC[0] + "^");
            int count = 0;
            count++;
            if (count == 10)
            {
                count = 0;
                System.out.println("T");
                System.out.print(ABC[0] + "^");
            }


        }
        System.out.println(" ");
        System.out.println("E^" + Location);
    }
}