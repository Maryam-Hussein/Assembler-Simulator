/*
* EC 241 - System Programming
* Welcome to our first Assembler ;)
* This work by:-
          NAME                             ID
    Abadeer Zaref Ishak 		        201900460
    Ayda Mohammed Ali 	   		        201901425
    Maryam Abd EL-Monaim Mohamed	    201900466
    Mohab Mohamed Ahmad 		        201902309
    Sohib Khaled Abd El Maged	        201901116
* For more help connect us via Email :)
* 2019****@pua.edu.eg
*/
package com.company;
public class Main
{
    public static void main(String[] args) throws Exception {


        System.out.println("------------------------------------");
        System.out.println("OPTABLE                             ");
        System.out.println("------------------------------------");
        OPTABLE optable = new OPTABLE();
        optable.printOne();


        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println("SIMPTABLE                             ");
        System.out.println("------------------------------------");
        SIMPTABLE simptable = new SIMPTABLE();
        simptable.printTwo();


        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println("ObjCode 'By hexadecimal'            ");
        System.out.println("------------------------------------");
        ObjCode obj = new ObjCode();
        obj.printThree();


        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println("Machine Code                        ");
        System.out.println("------------------------------------");
        MacCode macCode = new MacCode();
        macCode.printFour();



        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println("ObProgram                           ");
        System.out.println("------------------------------------");
        ObProgram obProgram = new ObProgram();
        obProgram.printFive();
    }
}
