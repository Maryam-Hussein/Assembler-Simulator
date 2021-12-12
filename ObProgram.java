package com.company;
import java.io.*;

public class ObProgram
{
    static void printFive() throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\IdeaProjects\\EC 241 - Project\\Object Code.txt"));
        File file = new File("ObProgram.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        //////////////////////////////////////////////////////////////////////////////////////////////////

        String text;
        text = bufferedReader.readLine();
        String Location =  text.substring(5);
        System.out.println("H^"+text.substring(0,4)+"^"+Location+"^");
        while ((text = bufferedReader.readLine()) != null)
        {
            String[] ABC = text.split("\\s");
                System.out.print("T^" + ABC[0] + "^");
                System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("E^"+Location);
    }
}