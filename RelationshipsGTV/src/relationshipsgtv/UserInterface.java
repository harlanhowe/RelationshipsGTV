/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tareck.haykal
 */
public class UserInterface {

   // static ArrayList<String>temp=new ArrayList<String>();
    //  temp.add("Add Person" "Remove Person" "Remove Relationship Type" +"Add Relationship"+"Add Relationship Type"+"Remove Relationship"+"Display Relationsips");  
             
   
    /*public ArrayList<String>choices()
      {
          ArrayList<String>temp=new ArrayList<String>();
         temp.add("Add Person"+"Add Relationship"+"Add Relationship Type"+"Remove Relationship"+"Display Relationsips");  
               return temp; 
      }
    
    public String prompt(int a)
    {
        Scanner input =new Scanner(System.in);
        a=input.nextInt();
    
    }
    */
    public static final int CANCEL_OPTION = -1;

    
    
    
    /**
     * Displays a text-based menu and gets the user's response; returns the number
     * of the option chosen by the user, or -1 if the user cancels. The user will
     * be asked repeatedly, until a valid option is chosen.
     * @param title - a string to display at the top of the menu
     * @param options - a list of strings to display as choices
     * @param prompt - the string to display below the menu, asking the user to choose.
     * @param allowCancel - whether the user is given the option to cancel
     * @return - the number of the menu option chosen, or CANCEL_OPTION if canceling
     */
    public int displayMenuAndGetResponse(String title, ArrayList<String> options, String prompt, boolean allowCancel)
    {
        if (title != null)
            System.out.println("--------------------------------\n"+title);
        System.out.println("--------------------------------");
        for (int i=0; i<options.size(); i++)
        {
            System.out.println((i+1)+"\t"+options.get(i));
        }
        System.out.println("--------------------------------");
        boolean goodAnswer = false;
        int selection = 0;
        do
        {
            if (prompt != null)
                System.out.print(prompt);
            if (allowCancel)
                System.out.print(" (Type zero to cancel)");
            System.out.print(" ");
            
            Scanner input =new Scanner(System.in);
            
            try
            {
                selection = input.nextInt();
                if (allowCancel && selection == 0)
                    return CANCEL_OPTION;
                if (selection<1 || selection>options.size())
                    System.out.println("That number is out of range. Please try again.");
                else{
                    goodAnswer=true;
                    return selection;
                }
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("That was not a valid numeric choice. Please try again.");
            }
                    
        }while (!goodAnswer);
        return selection -1;
    }
    
    /**
     * Asks the user a question and gives a list of Strings that the user can pick from;
     * repeats questions until one of the chosen options is selected (ignoring 
     * upper/lower case). For example if prompt is "Play again?" and options are
     * {"Y","N"}, the user will see:<p>Play again? (Y,N)<p> Examples of what this
     * function might return from this call would be: "Y", "N", "y", "n". You would
     * not receive "Yes", "Maybe", "", or "m".
     * @param prompt - the message that the user sees, sans options
     * @param options - an array of possible strings the user could enter
     * @return a string that matches one of the options strings, ignoring case
     */
    public String displayStringChoiceAndGetResponse(String prompt, String[] options)
    {
        String optionList = "(";
        for (int i =0; i<options.length; i++)
        {
            optionList+= options[i];
            if (i<options.length-1)
                optionList+=", ";
        }
        optionList+=")";
        System.out.print(prompt+" "+optionList+" ");
        
        boolean goodAnswer=false;
        Scanner input =new Scanner(System.in);
        do
        {
            String response = input.nextLine();
            for (String s:options)
                if (s.equalsIgnoreCase(response))
                    return s;
            System.out.println("That is not one of your options. Please choose from "
                                +optionList+" ");
        }while (!goodAnswer);
        return null;
        
    }
 //  temp.add("Add Person" "Remove Person" "Remove Relationship Type" +"Add Relationship"+"Add Relationship Type"+"Remove Relationship"+"Display Relationsips");  
    public String choosePrompt(int a)
    {
        if(a==0)
            return "Type the name of the person to add";
        if(a==1)
            return "Type the name of the person to remove";
        if(a==2)
            return "Type the name of the Relationship Type to add";
        if(a==3)
            return "Type the name of the Relationship Type to remove";
        if(a==4)
            return "Create a new relationship";
        if(a==5)
            return "Delete a new relationship";
        //if(a==6)
            //display relationships
         return null;
        
    }
    

}
