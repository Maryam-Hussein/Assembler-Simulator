package com.company;
import java.util.HashMap;

public class SearchOnString
{
    // Hash map act as database
    HashMap<String, String> A= new HashMap<String,String>(); // A is name of Hash map
    public void instructionSIC()
    {
        A.put("LDX", "04");
        A.put("LDCH","50");
        A.put("STCH","54");
        A.put("TIX","2C");
        A.put("JLT","38");
        A.put("JGT","34");
        A.put("JEQ","30");
        A.put("DIV","24");
        A.put("MUL","20");
        A.put("SUB","1C");
        A.put("ADD","18");
    }
        //Method Search for String and print the OPTABLE

        HashMap<String, String> getInstructionSIC(String text)
        {
        text = text.toUpperCase();
        if (A.containsKey(text))
        return A;

        return null;
        }



}

