/** 
    @author:    Byron Dowling
    Assignment: Programming Assignment #1   - Question 3
    Course:     CMPS 4143 Contemporary Programming Languages
    Date:       10/5/21

    Program Description:

        ***Original Assignment Instructions***

        3. Create a calculator class which can perform certain operations: addition, subtraction,
           multiplication, division, and modulo. Now, add Java exception handling to your code by defining
           two exception classes SyntaxError and RuntimeError. A SyntaxError exception
           should be thrown when an illegal character is found, a closing ) is not found, or a = is not used
           twice in an expression or an unwanted alphanumeric character inside the equation. A
           RuntimeError exception should be thrown when a divide by zero occurs. The exceptions
           should propagate the error to the main program which prints the diagnostics of the error. You
           must handle these errors using Java exceptions and the message should be printed by a Java
           exception handler in a catch clause. (30 points)
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Vector;

class Calculator
{
    public boolean var;
    public boolean equals;
    public boolean parentheses;
    public double runningTotal;

    Calculator()
    {
        runningTotal = 0.0;
        var = false;
        equals = false;
        parentheses = true;
    }



    public double Multiply(double current, double multiplier)
    {
        current *= multiplier;
        return current;
    } 

    public double Divide(double current, double divisor)
    {
        current /= divisor;
        return current;
    }

    public double Addition(double current, double additive)
    {
        current += additive;
        return current;
    }

    public double Subtraction(double current, double subtractive)
    {
        current -= subtractive;
        return current;
    }

    public double Modulo(double num1, double num2)
    {
        num1 = num1 % num2;
        return num1;
    }

}


class SyntaxError extends Exception
{
    private String _errorMsg;

    SyntaxError()
    {
        _errorMsg = "We expected better code from you, you are a dissapointment to your mother";
    }

    public SyntaxError(String eM)
    {
        _errorMsg = eM;
    }

    public String getMessage()
    {
        return _errorMsg;
    }

}


class RuntimeError extends Exception
{
    private String _errorMsg;

    public RuntimeError()
    {
        _errorMsg = "You can't divide by zero you silly goose";
    }

    public RuntimeError(String eM)
    {
        _errorMsg = eM;
    }

    public String getMessage()
    {
        return _errorMsg;
    }

}


public class ProgramTwoQ3
{

    /*
        Removing all of the blank spaces from the input to simply the process
        of looping over the string input and allows us to much more easily
        check that the first 3 characters are what are needed to have a 
        proper mathematical expression.
    */

    static String grabInput(Scanner userInput)
    {
        System.out.print("Enter your mathematical expression: ");

        String uI = userInput.nextLine();

        uI = uI.replaceAll("\\s", "");
        System.out.println("Expression you have entered is: " + uI);

        return uI;
    }


    public static void main(String[] args) throws Exception, FileNotFoundException, SyntaxError, RuntimeError
    {
        Calculator C1 = new Calculator();                   // New Calculator object

        Scanner userInput = new Scanner(System.in);         // Grabbing input from scanner
        String temp = grabInput(userInput);

        try
        {
            /*
                Using these to mark the first 3 characters of the string so we can
                make sure that the expression starts with a variable followed by an
                = sign and then either a number or a parentheses bracket.
            */

            char c = temp.charAt(0);
            char d = temp.charAt(1);
            char e = temp.charAt(2);

            /*
                Pattern Matcher objects, helps us divy up the data by splitting up
                the orginal string into mathematical characters/operators and then
                numbers. These are eventually stored in pat_m and last that are then
                regferenced later to eventually decipher the mathematical expression
                entered, assuming there are no syntax or run-time errors.
            */

            Pattern pat = Pattern.compile("\\d+");
            Pattern next = Pattern.compile("\\D");

            Matcher pat_m = pat.matcher(temp);
            Matcher last = next.matcher(temp);

            /*
                Parrallel Vectors are created to keep track of the amount of numbers
                and then the specific operator symbols. With reduced whitespace, we'll
                know that if there's a mismatch of number of oeprators vs numbers. If 
                the format is right we should have one less operator than numbers. This
                is also allowing us to loop through and work correct order of operations.
            */

            Vector<Double> Nums = new Vector<Double>(1, 1);
            Vector<String> operators = new Vector<String>(1, 1);
            double running_total = 0;
            
            /*
                If the expression begins with a variable, then the condition is true,
                if not we will throw a Syntax Error.
            */

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
            {
                C1.var = true;
            }

            else
            {
                throw new SyntaxError("Operation must start with a variable");
            }
            

            /*
                If the second character is not an = sign, we will throw a syntax error
                since the mathematical expression must have a variable followed by an
                = sign for proper assessment.
            */

            if (d != '=')
            {
                throw new SyntaxError("Syntax error: expected a '=' ");
            }


            /*
                If the third character in the string is not a number and is instead
                something like an operation symbol, we will throw a syntax error since
                the expression X = + 12 wouldn't make sense.
            */

            if ((e < '0' || e > '9') && e != '(')
            {
                throw new SyntaxError("Syntax error: expected a value");
            }

            for (int i = 0; i < temp.length(); i++)
            {

                if (temp.charAt(i) == '/' || temp.charAt(i) == '%')
                {
                    if (temp.charAt(i+1) == '0')
                    {
                        throw new RuntimeError("Runtime error: Divide/Mod by zero occurred");                   // Divide by zero runtime error catch
                    }
                }


                if (temp.charAt(i) == '=' && C1.equals == true)                 // If we read a second equal sign, throw an error
                {
                    throw new SyntaxError("Syntax error: too many = signs");
                }


                if (temp.charAt(i) == '=' && C1.equals == false)                // When we read one equal sign we set to true
                {
                    C1.equals = true;
                }


                if (temp.charAt(i) == '(')                                      // Open ( will throw a false status
                {
                    C1.parentheses = false;
                }

                if (temp.charAt(i) == ')')                                      // A matching ) will change the status back to true
                {
                    if (C1.parentheses == false)
                    {
                        C1.parentheses = true;
                    }

                    else                                                        // if the first parentheses read is a closed character
                    {                                                           // the condition will be set to false since you must
                        C1.parentheses = false;                                 // start with an open parentheses
                    }
                }
            }

            if (C1.parentheses == false)                                        // If a closing parentheses is missing the condition is false
            {                                                                   // and therefore it will throw the error
                throw new SyntaxError("Syntax error: expected a ')' ");
            }


            while (pat_m.find())                                                // Casting doubles from the parsed matcher object
            {
                double temp_dub = Double.valueOf(pat_m.group());
                Nums.add(temp_dub);
            }


            while (last.find())                                                 // Grabbing the operator characters that were parsed from matcher
            {
                String temp_str = last.group();
                if (temp_str.charAt(0) == '%' || temp_str.charAt(0) == '/' || temp_str.charAt(0) == '-'
                        || temp_str.charAt(0) == '*' || temp_str.charAt(0) == '+')         
                {
                    operators.add(temp_str);
                }
            }


            while (operators.size() > 0)                                        // Looping through the operators to perform an evaluation
            {
                String temp_string = operators.elementAt(0);

                char z = temp_string.charAt(0);

                /*
                    When a match is found with the operator that is read, the corresponding numbers are
                    grabbed and sent to the appropriate class method for the matching operation and that
                    value is then returned to the running total variable.
                */

                if (z == '+') 
                {
                    running_total = C1.Addition(Nums.elementAt(0), Nums.elementAt(1));
                    Nums.set(0, running_total);
                    Nums.remove(1);
                    operators.remove(0);
                } 

                else if (z == '-') 
                {
                    running_total = C1.Subtraction(Nums.elementAt(0), Nums.elementAt(1));
                    Nums.set(0, running_total);
                    Nums.remove(1);
                    operators.remove(0);
                } 

                else if (z == '/') 
                {
                    running_total = C1.Divide(Nums.elementAt(0), Nums.elementAt(1));
                    Nums.set(0, running_total);
                    Nums.remove(1);
                    operators.remove(0);
                } 

                else if (z == '*') 
                {
                    running_total = C1.Multiply(Nums.elementAt(0), Nums.elementAt(1));
                    Nums.set(0, running_total);
                    Nums.remove(1);
                    operators.remove(0);
                } 
                
                else 
                {
                    running_total = C1.Modulo(Nums.elementAt(0), Nums.elementAt(1));
                    Nums.set(0, running_total);
                    Nums.remove(1);
                    operators.remove(0);
                }
            }

            System.out.println("The result is " + Nums.get(0));
        }

        catch(SyntaxError e1)                       // Catch Syntax Errors
        {
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }

        catch(RuntimeError e2)                      // Catch Runtime Errors
        {
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        }

        finally
        {
            userInput.close();                          // Close the scanner 
            System.out.println("Program Terminated."); 
        }
    }


}
