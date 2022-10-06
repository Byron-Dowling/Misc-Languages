/** 
    @author:    Byron Dowling
    Assignment: Programming Assignment #1   - Question 2
    Course:     CMPS 4143 Contemporary Programming Languages
    Date:       10/5/21

    Program Description:

        ***Original Assignment Instructions***
        ***This Assignment was rather repetitive***

        2. Consider the following organigram (can be found in https://en.wikipedia.org/wiki/Mammal ) of
           Mammalia family. (a: 5, b: 5, c: 10, d: 20, e:10) – (50 points)

           a. Each of the members

                i. has:
                        1. Legs (count)
                        2. Tails (yes/no)
                        3. Brain (yes/no)
                        4. Neurons (count)
                        5. Precision to understand (0.00 to 100.00%)
                        6. Birth date
                        7. Favorite foods

                ii. can:
                        1. Eat
                        2. Walk
                        3. Sleep
                        4. Give Birth

            b. Think about perissodactyla, they can mate with carnivora members; can breed and
            produce a new family called ‘Perivora’. Perivora animals supposed to give birth to a new
            family ‘Periveron’. But by nature law no periveron member can be crated.

            c. Create at least 5 animals from each family; Perviveron member cannot be produced.

            d. Now you can do some creativity by changing the neurons, precision to understand, food
            habits, but you can’t change the legs, brains, birth date. Change these features for at
            least 20 animals and show how it was before and how it is now. From level 6 to
            8(Considering Mammlia as level-1 and carnivora, cetartiodactyla are on level-8), animals
            can run and hunt for their food. Change at least 10 animals’ running speed, hunting
            process and hunting food type for those who are 6-8 level animals. Try changing at least
            10 animals and show (reading from files; see next bullet) what they were and what they
            are now.

            e. All outcomes should be stored in a file. When you have created objects, their
            information should be stored in files. After changing their behaviors and attributes, they
            should also be stored in files. The term show mentioned in the previous sub-section
            refers to reading the data from files and printing to the console.
                                                                                                                                                                                                                  
                                                                                                                                                                                                
*/

import java.io.*;
import java.util.Scanner;
import java.io.PrintStream;


/*
                          $$$$$$\  $$\                                                       
                         $$  __$$\ $$ |                                                      
                         $$ /  \__|$$ | $$$$$$\   $$$$$$$\  $$$$$$$\                         
                         $$ |      $$ | \____$$\ $$  _____|$$  _____|                        
                         $$ |      $$ | $$$$$$$ |\$$$$$$\  \$$$$$$\                          
                         $$ |  $$\ $$ |$$  __$$ | \____$$\  \____$$\                         
                         \$$$$$$  |$$ |\$$$$$$$ |$$$$$$$  |$$$$$$$  |                        
                          \______/ \__| \_______|\_______/ \_______/                         
                                                                                             
                                                                                             
                                                                                             
 $$$$$$$\             $$$$$$\  $$\           $$\   $$\     $$\                               
 $$  __$$\           $$  __$$\ \__|          \__|  $$ |    \__|                              
 $$ |  $$ | $$$$$$\  $$ /  \__|$$\ $$$$$$$\  $$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\   $$$$$$$\ 
 $$ |  $$ |$$  __$$\ $$$$\     $$ |$$  __$$\ $$ |\_$$  _|  $$ |$$  __$$\ $$  __$$\ $$  _____|
 $$ |  $$ |$$$$$$$$ |$$  _|    $$ |$$ |  $$ |$$ |  $$ |    $$ |$$ /  $$ |$$ |  $$ |\$$$$$$\  
 $$ |  $$ |$$   ____|$$ |      $$ |$$ |  $$ |$$ |  $$ |$$\ $$ |$$ |  $$ |$$ |  $$ | \____$$\ 
 $$$$$$$  |\$$$$$$$\ $$ |      $$ |$$ |  $$ |$$ |  \$$$$  |$$ |\$$$$$$  |$$ |  $$ |$$$$$$$  |
 \_______/  \_______|\__|      \__|\__|  \__|\__|   \____/ \__| \______/ \__|  \__|\_______/ 
                                                                                                                                                                                                                                                                              
*/


class Mammalia
{
    int _legs;
    boolean _tails;
    boolean _brain;
    int _neurons;
    double _precision;
    int _birthDate;
    String _preferred_Foods;
    String _huntingStyle;
    double _movingSpeed;
    
    public void eat()
    {
        // Do Stuff
    }

    public void walk()
    {
        // Do Stuff
    }

    public void sleep()
    {
        // Do Stuff
    }

    public void reproduce()
    {
        // Do Stuff
    }

    public void updateNeurons(int N)                // Setter Method
    {
        _neurons = N;
    }

    public int getNeurons()                         // Getter Method
    {
        return _neurons;
    }

    public void updatePrecision(double P)           // Setter Method
    {
        _precision = P;
    }

    public double getPrecision()                    // Getter Method
    {
        return _precision;
    }

    public void changeFoodType(String FT)           // Setter Method
    {
        _preferred_Foods = FT;
    }

    public String getFoodType()                     // Getter Method
    {
        return _preferred_Foods;
    }

    public void setHuntingStyle(String hS)          // Setter Method
    {
        _huntingStyle = hS;
    }

    public String getHuntingStyle()                 // Getter Method
    {
        return _huntingStyle;
    }

    public void setMovingSpeed(double mS)           // Setter Method
    {
        _movingSpeed = mS;
    }

    public double getMovingSpeed()                  // Getter Method
    {
        return _movingSpeed;
    }


    /*
        Print method to print the results of each object that is created. Becuase of code in
        other sections of the program, these statements will write to a file to keep track
        of what objects have been created and what attributes they have at the time of
        creation.
    */

    public void printInfo(String type)
    {
        System.out.println("An object of Class " + type + " was created with " + _legs + " legs "
         + _neurons + " neurons " + _precision + " rating, a birthdate of " + _birthDate +
         " a preferred food of " + _preferred_Foods + " a hunting style of " + _huntingStyle +
         " and a moving speed of " + _movingSpeed);
    }


    // User-Defined/Parameterized Constructor
    Mammalia(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav)
    {
        _legs = legs;
        _brain = brain;
        _neurons = neurons;
        _tails = tails;
        _precision = precision;
        _birthDate = bD;
        _preferred_Foods = fav;
        _huntingStyle = "Default";
        _movingSpeed = 23.17;
    }
}


/*
    What follows below is the several class definitions for our animal classes. They
    follow a Multi-Level Inheritance model as the first few classes extend the parent
    class and then subsequent classes extend the animal classes that extended the parent 
    class beforehand.
*/


class Monotremata extends Mammalia
{
    Monotremata(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Theria extends Mammalia
{
    Theria(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Marsupialia extends Theria
{
    Marsupialia(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Placentalia extends Theria
{
    Placentalia(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Atlantogenata extends Placentalia
{
    Atlantogenata(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Boreoeutheria extends Placentalia
{
    Boreoeutheria(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Afrotheria extends Atlantogenata
{
    Afrotheria(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Xenarthra extends Atlantogenata
{
    Xenarthra(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Euarchontoglires extends Boreoeutheria
{
    Euarchontoglires(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Laurasiatheria extends Boreoeutheria
{
    Laurasiatheria(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Euarchonta extends Euarchontoglires
{
    Euarchonta(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Glires extends Euarchontoglires
{
    Glires(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Scrotifera extends Laurasiatheria
{
    Scrotifera(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Eulipotyphia extends Laurasiatheria
{
    Eulipotyphia(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Chirpotera extends Scrotifera
{
    Chirpotera(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Euungulata extends Scrotifera
{
    Euungulata(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Ferae extends Scrotifera
{
    Ferae(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Cetartiodactyla extends Euungulata
{
    Cetartiodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Perissodactyla extends Euungulata
{
    Perissodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Pholidota extends Ferae
{
    Pholidota(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}


class Carnivora extends Ferae
{
    Carnivora(int legs, boolean brain, boolean tails, int neurons, double precision, int bD, String fav) 
    {
        super(legs, brain, tails, neurons, precision, bD, fav);
    }
}



/*
 
    $$\      $$\           $$\                 $$$$$$$\  $$\                     $$\       
    $$$\    $$$ |          \__|                $$  __$$\ $$ |                    $$ |      
    $$$$\  $$$$ | $$$$$$\  $$\ $$$$$$$\        $$ |  $$ |$$ | $$$$$$\   $$$$$$$\ $$ |  $$\ 
    $$\$$\$$ $$ | \____$$\ $$ |$$  __$$\       $$$$$$$\ |$$ |$$  __$$\ $$  _____|$$ | $$  |
    $$ \$$$  $$ | $$$$$$$ |$$ |$$ |  $$ |      $$  __$$\ $$ |$$ /  $$ |$$ /      $$$$$$  / 
    $$ |\$  /$$ |$$  __$$ |$$ |$$ |  $$ |      $$ |  $$ |$$ |$$ |  $$ |$$ |      $$  _$$<  
    $$ | \_/ $$ |\$$$$$$$ |$$ |$$ |  $$ |      $$$$$$$  |$$ |\$$$$$$  |\$$$$$$$\ $$ | \$$\ 
    \__|     \__| \_______|\__|\__|  \__|      \_______/ \__| \______/  \_______|\__|  \__|                                                                                                                                                                                                                                                                    
 

    Everything that follows below is the code necessary to create the various animal objects
    required and update their values and write these changes to a file. With 12 total classes
    and 5 animals per class we have 60 animals and set their values using the paramterized 
    constructor and update the requested values with parent methods to update and retrieve said
    values. I initially tried writing a loop to severely reduce the amount of lines necessary
    to complete this task but was running into issues so this way at least ensures that the
    task is met.

*/


public class ProgramTwoQ2 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File output = new File("Output.txt");                   // Output file destination
        PrintStream output_file = new PrintStream(output);      // New Print Stream
        System.setOut(output_file);                             // Changing System.out to be to an outfile
        

        // Mamallia Animal Objects
        Mammalia obj1 = new Monotremata(2, true, false, 1000000, 99.99, 2021, "Prime Rib");
        obj1.printInfo("Object 1");
        Mammalia obj2 = new Monotremata(2, true, false, 1000000, 99.99, 2021, "Beef Wellington");
        obj2.printInfo("Object 2");
        Mammalia obj3 = new Monotremata(2, true, false, 1000000, 99.99, 2021, "Bone Broth");
        obj3.printInfo("Object 3");
        Mammalia obj4 = new Monotremata(2, true, false, 1000000, 99.99, 2021, "Chimichangas");
        obj4.printInfo("Object 4");
        Mammalia obj5 = new Monotremata(2, true, false, 1000000, 99.99, 2021, "Goulash");
        obj5.printInfo("Object 5");
        System.out.println();


        // Monotremata Animal objects
        Monotremata A1 = new Monotremata(2, true, false, 100, 99.99, 2020, "Pork and Beans");
        A1.printInfo("A1");
        Monotremata A2 = new Monotremata(2, true, false, 100, 99.99, 2019, "Pork and Beans");
        A2.printInfo("A2");
        Monotremata A3 = new Monotremata(2, true, false, 100, 99.99, 2018, "Pork and Beans");
        A3.printInfo("A3");
        Monotremata A4 = new Monotremata(2, true, false, 100, 99.99, 2017, "Pork and Beans");
        A4.printInfo("A4");
        Monotremata A5 = new Monotremata(2, true, false, 100, 99.99, 2016, "Pork and Beans");
        A5.printInfo("A5");
        System.out.println();


        // Neurons
        System.out.println("Object A1 Neurons were: " + A1.getNeurons());
        System.out.println("Object A2 Neurons were: " + A2.getNeurons());
        System.out.println("Object A3 Neurons were: " + A3.getNeurons());
        System.out.println("Object A4 Neurons were: " + A4.getNeurons());
        System.out.println("Object A5 Neurons were: " + A5.getNeurons());

        A1.updateNeurons(1000);
        A2.updateNeurons(1000);
        A3.updateNeurons(1000);
        A4.updateNeurons(1000);
        A5.updateNeurons(1000);

        System.out.println();
        System.out.println("Object A1 Neurons are now: " + A1.getNeurons());
        System.out.println("Object A2 Neurons are now: " + A2.getNeurons());
        System.out.println("Object A3 Neurons are now: " + A3.getNeurons());
        System.out.println("Object A4 Neurons are now: " + A4.getNeurons());
        System.out.println("Object A5 Neurons are now: " + A5.getNeurons());


        // Precision
        System.out.println();
        System.out.println("Object A1 Precision was: " + A1.getPrecision());
        System.out.println("Object A2 Precision was: " + A2.getPrecision());
        System.out.println("Object A3 Precision was: " + A3.getPrecision());
        System.out.println("Object A4 Precision was: " + A4.getPrecision());
        System.out.println("Object A5 Precision was: " + A5.getPrecision());


        // Updating with new variables
        A1.updatePrecision(69.420);
        A2.updatePrecision(69.420);
        A3.updatePrecision(69.420);
        A4.updatePrecision(69.420);
        A5.updatePrecision(69.420);


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object A1 Precision is now: " + A1.getPrecision());
        System.out.println("Object A2 Precision is now: " + A2.getPrecision());
        System.out.println("Object A3 Precision is now: " + A3.getPrecision());
        System.out.println("Object A4 Precision is now: " + A4.getPrecision());
        System.out.println("Object A5 Precision is now: " + A5.getPrecision());


        // Food Habits
        System.out.println();
        System.out.println("Object A1's preferred meal was: " + A1.getFoodType());
        System.out.println("Object A2's preferred meal was: " + A2.getFoodType());
        System.out.println("Object A3's preferred meal was: " + A3.getFoodType());
        System.out.println("Object A4's preferred meal was: " + A4.getFoodType());
        System.out.println("Object A5's preferred meal was: " + A5.getFoodType());


        // Updating with new variables
        A1.changeFoodType("Beans and Pork");
        A2.changeFoodType("Beans and Pork");
        A3.changeFoodType("Beans and Pork");
        A4.changeFoodType("Beans and Pork");
        A5.changeFoodType("Beans and Pork");


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object A1 preferred meal is now: " + A1.getFoodType());
        System.out.println("Object A2 preferred meal is now: " + A2.getFoodType());
        System.out.println("Object A3 preferred meal is now: " + A3.getFoodType());
        System.out.println("Object A4 preferred meal is now: " + A4.getFoodType());
        System.out.println("Object A5 preferred meal is now: " + A5.getFoodType());
        System.out.println();



        // Theria Animal Objects
        Theria B1 = new Theria(4, true, true, 10000, 69.69, 20, "Birria Tacos");
        B1.printInfo("B1");
        Theria B2 = new Theria(4, true, true, 10000, 69.69, 19, "Birria Tacos");
        B2.printInfo("B2");
        Theria B3 = new Theria(4, true, true, 10000, 69.69, 18, "Birria Tacos");
        B3.printInfo("B3");
        Theria B4 = new Theria(4, true, true, 10000, 69.69, 17, "Birria Tacos");
        B4.printInfo("B4");
        Theria B5 = new Theria(4, true, true, 10000, 69.69, 16, "Birria Tacos");
        B5.printInfo("B5");
        System.out.println();


        // Neurons
        System.out.println();
        System.out.println("Object B1 Neurons were: " + B1.getNeurons());
        System.out.println("Object B2 Neurons were: " + B2.getNeurons());
        System.out.println("Object B3 Neurons were: " + B3.getNeurons());
        System.out.println("Object B4 Neurons were: " + B4.getNeurons());
        System.out.println("Object B5 Neurons were: " + B5.getNeurons());

        B1.updateNeurons(1000);
        B2.updateNeurons(1000);
        B3.updateNeurons(1000);
        B4.updateNeurons(1000);
        B5.updateNeurons(1000);

        System.out.println();
        System.out.println("Object B1 Neurons are now: " + B1.getNeurons());
        System.out.println("Object B2 Neurons are now: " + B2.getNeurons());
        System.out.println("Object B3 Neurons are now: " + B3.getNeurons());
        System.out.println("Object B4 Neurons are now: " + B4.getNeurons());
        System.out.println("Object B5 Neurons are now: " + B5.getNeurons());


        // Precision
        System.out.println();
        System.out.println("Object B1 Precision was: " + B1.getPrecision());
        System.out.println("Object B2 Precision was: " + B2.getPrecision());
        System.out.println("Object B3 Precision was: " + B3.getPrecision());
        System.out.println("Object B4 Precision was: " + B4.getPrecision());
        System.out.println("Object B5 Precision was: " + B5.getPrecision());


        // Updating with new variables
        B1.updatePrecision(79.49);
        B2.updatePrecision(79.49);
        B3.updatePrecision(79.49);
        B4.updatePrecision(79.49);
        B5.updatePrecision(79.49);


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object B1 Precision is now: " + B1.getPrecision());
        System.out.println("Object B2 Precision is now: " + B2.getPrecision());
        System.out.println("Object B3 Precision is now: " + B3.getPrecision());
        System.out.println("Object B4 Precision is now: " + B4.getPrecision());
        System.out.println("Object B5 Precision is now: " + B5.getPrecision());


        // Food Habits
        System.out.println();
        System.out.println("Object B1's preferred meal was: " + B1.getFoodType());
        System.out.println("Object B2's preferred meal was: " + B2.getFoodType());
        System.out.println("Object B3's preferred meal was: " + B3.getFoodType());
        System.out.println("Object B4's preferred meal was: " + B4.getFoodType());
        System.out.println("Object B5's preferred meal was: " + B5.getFoodType());

        
        // Updating with new variables
        B1.changeFoodType("Fish Tacos");
        B2.changeFoodType("Fish Tacos");
        B3.changeFoodType("Fish Tacos");
        B4.changeFoodType("Fish Tacos");
        B5.changeFoodType("Fish Tacos");


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object B1 preferred meal is now: " + B1.getFoodType());
        System.out.println("Object B2 preferred meal is now: " + B2.getFoodType());
        System.out.println("Object B3 preferred meal is now: " + B3.getFoodType());
        System.out.println("Object B4 preferred meal is now: " + B4.getFoodType());
        System.out.println("Object B5 preferred meal is now: " + B5.getFoodType());
        System.out.println();


        // Marsupialia Animal Objects
        Marsupialia C1 = new Marsupialia(4, true, true, 100000, 89.69, 20, "Creme Brulee");
        C1.printInfo("C1");
        Marsupialia C2 = new Marsupialia(4, true, true, 100000, 89.69, 21, "Creme Brulee");
        C2.printInfo("C2");
        Marsupialia C3 = new Marsupialia(4, true, true, 100000, 89.69, 22, "Creme Brulee");
        C3.printInfo("C3");
        Marsupialia C4 = new Marsupialia(4, true, true, 100000, 89.69, 23, "Creme Brulee");
        C4.printInfo("C4");
        Marsupialia C5 = new Marsupialia(4, true, true, 100000, 89.69, 24, "Creme Brulee");
        C5.printInfo("C5");
        System.out.println();


        // Neurons
        System.out.println();
        System.out.println("Object C1 Neurons were: " + C1.getNeurons());
        System.out.println("Object C2 Neurons were: " + C2.getNeurons());
        System.out.println("Object C3 Neurons were: " + C3.getNeurons());
        System.out.println("Object C4 Neurons were: " + C4.getNeurons());
        System.out.println("Object C5 Neurons were: " + C5.getNeurons());

        C1.updateNeurons(10000);
        C2.updateNeurons(10000);
        C3.updateNeurons(10000);
        C4.updateNeurons(10000);
        C5.updateNeurons(10000);

        System.out.println();
        System.out.println("Object C1 Neurons are now: " + C1.getNeurons());
        System.out.println("Object C2 Neurons are now: " + C2.getNeurons());
        System.out.println("Object C3 Neurons are now: " + C3.getNeurons());
        System.out.println("Object C4 Neurons are now: " + C4.getNeurons());
        System.out.println("Object C5 Neurons are now: " + C5.getNeurons());


        // Precision
        System.out.println();
        System.out.println("Object C1 Precision was: " + C1.getPrecision());
        System.out.println("Object C2 Precision was: " + C2.getPrecision());
        System.out.println("Object C3 Precision was: " + C3.getPrecision());
        System.out.println("Object C4 Precision was: " + C4.getPrecision());
        System.out.println("Object C5 Precision was: " + C5.getPrecision());


        // Updating with new variables
        C1.updatePrecision(49.49);
        C2.updatePrecision(49.49);
        C3.updatePrecision(49.49);
        C4.updatePrecision(49.49);
        C5.updatePrecision(49.49);


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object C1 Precision is now: " + C1.getPrecision());
        System.out.println("Object C2 Precision is now: " + C2.getPrecision());
        System.out.println("Object C3 Precision is now: " + C3.getPrecision());
        System.out.println("Object C4 Precision is now: " + C4.getPrecision());
        System.out.println("Object C5 Precision is now: " + C5.getPrecision());


        // Food Habits
        System.out.println();
        System.out.println("Object C1's preferred meal was: " + C1.getFoodType());
        System.out.println("Object C2's preferred meal was: " + C2.getFoodType());
        System.out.println("Object C3's preferred meal was: " + C3.getFoodType());
        System.out.println("Object C4's preferred meal was: " + C4.getFoodType());
        System.out.println("Object C5's preferred meal was: " + C5.getFoodType());

        
        // Updating with new variables
        C1.changeFoodType("Dump Cake");
        C2.changeFoodType("Dump Cake");
        C3.changeFoodType("Dump Cake");
        C4.changeFoodType("Dump Cake");
        C5.changeFoodType("Dump Cake");


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object C1 preferred meal is now: " + C1.getFoodType());
        System.out.println("Object C2 preferred meal is now: " + C2.getFoodType());
        System.out.println("Object C3 preferred meal is now: " + C3.getFoodType());
        System.out.println("Object C4 preferred meal is now: " + C4.getFoodType());
        System.out.println("Object C5 preferred meal is now: " + C5.getFoodType());
        System.out.println();


        // Placentalia Animal Objects
        Placentalia D1 = new Placentalia(0, true, false, 10000, 90.69, 20, "Porterhouse");
        D1.printInfo("D1");
        Placentalia D2 = new Placentalia(0, true, false, 10000, 90.69, 21, "Porterhouse");
        D2.printInfo("D2");
        Placentalia D3 = new Placentalia(0, true, false, 10000, 90.69, 22, "Porterhouse");
        D3.printInfo("D3");
        Placentalia D4 = new Placentalia(0, true, false, 10000, 90.69, 23, "Porterhouse");
        D4.printInfo("D4");
        Placentalia D5 = new Placentalia(0, true, false, 10000, 90.69, 23, "Porterhouse");
        D5.printInfo("D5");
        System.out.println();


        // Neurons
        System.out.println();
        System.out.println("Object D1 Neurons were: " + D1.getNeurons());
        System.out.println("Object D2 Neurons were: " + D2.getNeurons());
        System.out.println("Object D3 Neurons were: " + D3.getNeurons());
        System.out.println("Object D4 Neurons were: " + D4.getNeurons());
        System.out.println("Object D5 Neurons were: " + D5.getNeurons());

        D1.updateNeurons(100000);
        D2.updateNeurons(100000);
        D3.updateNeurons(100000);
        D4.updateNeurons(100000);
        D5.updateNeurons(100000);

        System.out.println();
        System.out.println("Object D1 Neurons are now: " + D1.getNeurons());
        System.out.println("Object D2 Neurons are now: " + D2.getNeurons());
        System.out.println("Object D3 Neurons are now: " + D3.getNeurons());
        System.out.println("Object D4 Neurons are now: " + D4.getNeurons());
        System.out.println("Object D5 Neurons are now: " + D5.getNeurons());


        // Precision
        System.out.println();
        System.out.println("Object D1 Precision was: " + D1.getPrecision());
        System.out.println("Object D2 Precision was: " + D2.getPrecision());
        System.out.println("Object D3 Precision was: " + D3.getPrecision());
        System.out.println("Object D4 Precision was: " + D4.getPrecision());
        System.out.println("Object D5 Precision was: " + D5.getPrecision());


        // Updating with new variables
        D1.updatePrecision(19.79);
        D2.updatePrecision(19.79);
        D3.updatePrecision(19.79);
        D4.updatePrecision(19.79);
        D5.updatePrecision(19.79);


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object D1 Precision is now: " + D1.getPrecision());
        System.out.println("Object D2 Precision is now: " + D2.getPrecision());
        System.out.println("Object D3 Precision is now: " + D3.getPrecision());
        System.out.println("Object D4 Precision is now: " + D4.getPrecision());
        System.out.println("Object D5 Precision is now: " + D5.getPrecision());


        // Food Habits
        System.out.println();
        System.out.println("Object D1's preferred meal was: " + D1.getFoodType());
        System.out.println("Object D2's preferred meal was: " + D2.getFoodType());
        System.out.println("Object D3's preferred meal was: " + D3.getFoodType());
        System.out.println("Object D4's preferred meal was: " + D4.getFoodType());
        System.out.println("Object D5's preferred meal was: " + D5.getFoodType());

        
        // Updating with new variables
        D1.changeFoodType("New York Strip");
        D2.changeFoodType("New York Strip");
        D3.changeFoodType("New York Strip");
        D4.changeFoodType("New York Strip");
        D5.changeFoodType("New York Strip");


        // Writing the new results to a file
        System.out.println();
        System.out.println("Object D1 preferred meal is now: " + D1.getFoodType());
        System.out.println("Object D2 preferred meal is now: " + D2.getFoodType());
        System.out.println("Object D3 preferred meal is now: " + D3.getFoodType());
        System.out.println("Object D4 preferred meal is now: " + D4.getFoodType());
        System.out.println("Object D5 preferred meal is now: " + D5.getFoodType());
        System.out.println();


        // Atlantogenata Animal Objects
        Atlantogenata E1 = new Atlantogenata(2, true, false, 10, 49.49, 70, "Tira Misu");
        E1.printInfo("E1");
        Atlantogenata E2 = new Atlantogenata(2, true, false, 10, 49.49, 72, "Tira Misu");
        E2.printInfo("E2");
        Atlantogenata E3 = new Atlantogenata(2, true, false, 10, 49.49, 74, "Tira Misu");
        E3.printInfo("E3");
        Atlantogenata E4 = new Atlantogenata(2, true, false, 10, 49.49, 76, "Tira Misu");
        E4.printInfo("E4");
        Atlantogenata E5 = new Atlantogenata(2, true, false, 10, 49.49, 78, "Tira Misu");
        E5.printInfo("E5");
        System.out.println();


        // Boreoeutheria Animal Objects
        Boreoeutheria F1 = new Boreoeutheria(2, true, true, 100, 59.57, 100, "Eclaires");
        F1.printInfo("F1");
        Boreoeutheria F2 = new Boreoeutheria(2, true, true, 100, 59.57, 110, "Eclaires");
        F2.printInfo("F2");
        Boreoeutheria F3 = new Boreoeutheria(2, true, true, 100, 59.57, 120, "Eclaires");
        F3.printInfo("F3");
        Boreoeutheria F4 = new Boreoeutheria(2, true, true, 100, 59.57, 130, "Eclaires");
        F4.printInfo("F4");
        Boreoeutheria F5 = new Boreoeutheria(2, true, true, 100, 59.57, 140, "Eclaires");
        F5.printInfo("F5");
        System.out.println();


        // Afrotheria Animal Objects
        Afrotheria G1 = new Afrotheria(2, true, false, 100000, 79.79, 70, "Polysaccharides");
        G1.printInfo("G1");
        Afrotheria G2 = new Afrotheria(2, true, false, 100000, 79.79, 77, "Polysaccharides");
        G2.printInfo("G2");
        Afrotheria G3 = new Afrotheria(2, true, false, 100000, 79.79, 84, "Polysaccharides");
        G3.printInfo("G3");
        Afrotheria G4 = new Afrotheria(2, true, false, 100000, 79.79, 91, "Polysaccharides");
        G4.printInfo("G4");
        Afrotheria G5 = new Afrotheria(2, true, false, 100000, 79.79, 98, "Polysaccharides");
        G5.printInfo("G5");
        System.out.println();


        // Xenarthra Animal Objects
        Xenarthra H1 = new Xenarthra(0, false, true, 0, 19.19, 10000, "Chilean Sea Bass");
        H1.printInfo("H1");
        Xenarthra H2 = new Xenarthra(0, false, true, 0, 19.19, 20000, "Chilean Sea Bass");
        H2.printInfo("H2");
        Xenarthra H3 = new Xenarthra(0, false, true, 0, 19.19, 30000, "Chilean Sea Bass");
        H3.printInfo("H3");
        Xenarthra H4 = new Xenarthra(0, false, true, 0, 19.19, 40000, "Chilean Sea Bass");
        H4.printInfo("H4");
        Xenarthra H5 = new Xenarthra(0, false, true, 0, 19.19, 50000, "Chilean Sea Bass");
        H5.printInfo("H5");
        System.out.println();


        // Euarchontoglires Animal Objects
        Euarchontoglires I1 = new Euarchontoglires(2, true, false, 10000, 49.89, 100, "Paprikash");
        I1.printInfo("I1");
        Euarchontoglires I2 = new Euarchontoglires(2, true, false, 10000, 49.89, 110, "Paprikash");
        I2.printInfo("I2");
        Euarchontoglires I3 = new Euarchontoglires(2, true, false, 10000, 49.89, 120, "Paprikash");
        I3.printInfo("I3");
        Euarchontoglires I4 = new Euarchontoglires(2, true, false, 10000, 49.89, 130, "Paprikash");
        I4.printInfo("I4");
        Euarchontoglires I5 = new Euarchontoglires(2, true, false, 10000, 49.89, 140, "Paprikash");
        I5.printInfo("I5");
        System.out.println();
        

        // Laurasiatheria Animal Objects
        Laurasiatheria J1 = new Laurasiatheria(0, true, false, 100000, 59.59, 1000, "Mahi Mahi");
        J1.printInfo("J1");
        Laurasiatheria J2 = new Laurasiatheria(0, true, false, 100000, 59.59, 1100, "Mahi Mahi");
        J2.printInfo("J2");
        Laurasiatheria J3 = new Laurasiatheria(0, true, false, 100000, 59.59, 1010, "Mahi Mahi");
        J3.printInfo("J3");
        Laurasiatheria J4 = new Laurasiatheria(0, true, false, 100000, 59.59, 1001, "Mahi Mahi");
        J4.printInfo("J4");
        Laurasiatheria J5 = new Laurasiatheria(0, true, false, 100000, 59.59, 2000, "Mahi Mahi");
        J5.printInfo("J5");
        System.out.println();


        // Euarchonta Animal Objects
        Euarchonta K1 = new Euarchonta(2, true, false, 100000, 69.69, 20000, "Lobster Risotto");
        K1.printInfo("K1");
        Euarchonta K2 = new Euarchonta(2, true, false, 100000, 69.69, 22000, "Lobster Risotto");
        K2.printInfo("K2");
        Euarchonta K3 = new Euarchonta(2, true, false, 100000, 69.69, 22200, "Lobster Risotto");
        K3.printInfo("K3");
        Euarchonta K4 = new Euarchonta(2, true, false, 100000, 69.69, 22220, "Lobster Risotto");
        K4.printInfo("K4");
        Euarchonta K5 = new Euarchonta(2, true, false, 100000, 69.69, 22222, "Lobster Risotto");
        K5.printInfo("K5");
        System.out.println();


        // Glires Animal Objects
        Glires L1 = new Glires(2, true, true, 100000, 69.69, 20000, "Pan Seared Duck");
        L1.printInfo("L1");
        Glires L2 = new Glires(2, true, true, 100000, 69.69, 30000, "Pan Seared Duck");
        L2.printInfo("L2");
        Glires L3 = new Glires(2, true, true, 100000, 69.69, 40000, "Pan Seared Duck");
        L3.printInfo("L3");
        Glires L4 = new Glires(2, true, true, 100000, 69.69, 50000, "Pan Seared Duck");
        L4.printInfo("L4");
        Glires L5 = new Glires(2, true, true, 100000, 69.69, 60000, "Pan Seared Duck");
        L5.printInfo("L5");
        System.out.println();


        // Scrotifera Animal Objects
        Scrotifera M1 = new Scrotifera(2, true, true, 100000, 79.69, 60000, "Filet Mignon");
        M1.printInfo("M1");
        Scrotifera M2 = new Scrotifera(2, true, true, 100000, 79.69, 60000, "Filet Mignon");
        M2.printInfo("M2");
        Scrotifera M3 = new Scrotifera(2, true, true, 100000, 79.69, 60000, "Filet Mignon");
        M3.printInfo("M3");
        Scrotifera M4 = new Scrotifera(2, true, true, 100000, 79.69, 60000, "Filet Mignon");
        M4.printInfo("M4");
        Scrotifera M5 = new Scrotifera(2, true, true, 100000, 79.69, 60000, "Filet Mignon");
        M5.printInfo("M5");
        System.out.println();


        // Eulipotyphia Animal Objects
        Eulipotyphia N1 = new Eulipotyphia(2, true, false, 100000, 79.97, 10000, "A5 Wagyu");
        N1.printInfo("N1");
        Eulipotyphia N2 = new Eulipotyphia(2, true, false, 100000, 79.97, 10000, "A5 Wagyu");
        N2.printInfo("N2");
        Eulipotyphia N3 = new Eulipotyphia(2, true, false, 100000, 79.97, 10000, "A5 Wagyu");
        N3.printInfo("N3");
        Eulipotyphia N4 = new Eulipotyphia(2, true, false, 100000, 79.97, 10000, "A5 Wagyu");
        N4.printInfo("N4");
        Eulipotyphia N5 = new Eulipotyphia(2, true, false, 100000, 79.97, 10000, "A5 Wagyu");
        N5.printInfo("N5");
        System.out.println();


        // Chirpotera Animal Objects
        Chirpotera O1 = new Chirpotera(2, true, false, 100000, 79.97, 10000, "Minestrone");
        O1.printInfo("O1");
        Chirpotera O2 = new Chirpotera(2, true, false, 200000, 79.97, 10000, "Minestrone");
        O2.printInfo("O2");
        Chirpotera O3 = new Chirpotera(2, true, false, 300000, 79.97, 10000, "Minestrone");
        O3.printInfo("O3");
        Chirpotera O4 = new Chirpotera(2, true, false, 400000, 79.97, 10000, "Minestrone");
        O4.printInfo("O4");
        Chirpotera O5 = new Chirpotera(2, true, false, 500000, 79.97, 10000, "Minestrone");
        O5.printInfo("O5");
        System.out.println();


        // Euungulata Animal Objects
        Euungulata P1 = new Euungulata(0, true, false, 100000, 97.79, 10000, "Blackened Red Snapper");
        P1.printInfo("P1");
        Euungulata P2 = new Euungulata(0, true, false, 100000, 97.79, 10000, "Blackened Red Snapper");
        P2.printInfo("P2");
        Euungulata P3 = new Euungulata(0, true, false, 100000, 97.79, 10000, "Blackened Red Snapper");
        P3.printInfo("P3");
        Euungulata P4 = new Euungulata(0, true, false, 100000, 97.79, 10000, "Blackened Red Snapper");
        P4.printInfo("P4");
        Euungulata P5 = new Euungulata(0, true, false, 100000, 97.79, 10000, "Blackened Red Snapper");
        P5.printInfo("P5");
        System.out.println();


        // Ferae Animal Objects
        Ferae Q1 = new Ferae(1, true, false, 100000, 97.79, 10000, "Blackened Steelhead");
        Q1.printInfo("Q1");
        Ferae Q2 = new Ferae(1, true, false, 100000, 97.79, 10000, "Blackened Steelhead");
        Q2.printInfo("Q2");
        Ferae Q3 = new Ferae(1, true, false, 100000, 97.79, 10000, "Blackened Steelhead");
        Q3.printInfo("Q3");
        Ferae Q4 = new Ferae(1, true, false, 100000, 97.79, 10000, "Blackened Steelhead");
        Q4.printInfo("Q4");
        Ferae Q5 = new Ferae(1, true, false, 100000, 97.79, 10000, "Blackened Steelhead");
        Q5.printInfo("Q5");
        System.out.println();


        // Cetartiodactyla Animal Objects
        Cetartiodactyla R1 = new Cetartiodactyla(2, true, true, 100000, 42.24, 10000, "Mojo Pork");
        R1.printInfo("R1");
        Cetartiodactyla R2 = new Cetartiodactyla(2, true, true, 100000, 42.24, 10000, "Mojo Pork");
        R2.printInfo("R2");
        Cetartiodactyla R3 = new Cetartiodactyla(2, true, true, 100000, 42.24, 10000, "Mojo Pork");
        R3.printInfo("R3");
        Cetartiodactyla R4 = new Cetartiodactyla(2, true, true, 100000, 42.24, 10000, "Mojo Pork");
        R4.printInfo("R4");
        Cetartiodactyla R5 = new Cetartiodactyla(2, true, true, 100000, 42.24, 10000, "Mojo Pork");
        R5.printInfo("R5");
        System.out.println();


        // Perissodactyla Animal Objects
        Perissodactyla S1 = new Perissodactyla(2, true, true, 100000, 42.42, 10000, "Pasta Aglio Olio");
        S1.printInfo("S1");
        Perissodactyla S2 = new Perissodactyla(2, true, true, 100000, 42.42, 10000, "Pasta Aglio Olio");
        S2.printInfo("S2");
        Perissodactyla S3 = new Perissodactyla(2, true, true, 100000, 42.42, 10000, "Pasta Aglio Olio");
        S3.printInfo("S3");
        Perissodactyla S4 = new Perissodactyla(2, true, true, 100000, 42.42, 10000, "Pasta Aglio Olio");
        S4.printInfo("S4");
        Perissodactyla S5 = new Perissodactyla(2, true, true, 100000, 42.42, 10000, "Pasta Aglio Olio");
        S5.printInfo("S5");
        System.out.println();


        // Pholidota Animal Objects
        Pholidota T1 = new Pholidota(2, true, true, 100000, 37.73, 10000, "Eggs Benny");
        T1.printInfo("T1");
        Pholidota T2 = new Pholidota(2, true, true, 100000, 37.73, 10000, "Eggs Benny");
        T2.printInfo("T2");
        Pholidota T3 = new Pholidota(2, true, true, 100000, 37.73, 10000, "Eggs Benny");
        T3.printInfo("T3");
        Pholidota T4 = new Pholidota(2, true, true, 100000, 37.73, 10000, "Eggs Benny");
        T4.printInfo("T4");
        Pholidota T5 = new Pholidota(2, true, true, 100000, 37.73, 10000, "Eggs Benny");
        T5.printInfo("T5");
        System.out.println();


        // Showing the before state of moving state and hunting style
        System.out.println();
        System.out.println("Object T1's Moving Speed was: " + T1.getMovingSpeed());
        System.out.println("Object T2's Moving Speed was: " + T2.getMovingSpeed());
        System.out.println("Object T3's Moving Speed was: " + T3.getMovingSpeed());
        System.out.println("Object T4's Moving Speed was: " + T4.getMovingSpeed());
        System.out.println("Object T5's Moving Speed was: " + T5.getMovingSpeed());


        System.out.println();
        System.out.println("Object T1's Hunting Style was: " + T1.getHuntingStyle());
        System.out.println("Object T2's Hunting Style was: " + T2.getHuntingStyle());
        System.out.println("Object T3's Hunting Style was: "  + T3.getHuntingStyle());
        System.out.println("Object T4's Hunting Style was: "  + T4.getHuntingStyle());
        System.out.println("Object T5's Hunting Style was: "  + T5.getHuntingStyle());
        

        // Changing Moving Speed and Hunting Style Attributes
        T1.setMovingSpeed(52.12);
        T1.setHuntingStyle("Nocturnal");
        T2.setMovingSpeed(52.13);
        T2.setHuntingStyle("Nocturnal");
        T3.setMovingSpeed(44.13);
        T3.setHuntingStyle("Nocturnal");
        T4.setMovingSpeed(44.57);
        T4.setHuntingStyle("Nocturnal");
        T5.setMovingSpeed(32.48);
        T5.setHuntingStyle("Nocturnal");


        // Showing the after state of moving state and hunting style
        System.out.println();
        System.out.println("Object T1's Moving Speed is now: " + T1.getMovingSpeed());
        System.out.println("Object T2's Moving Speed is now: " + T2.getMovingSpeed());
        System.out.println("Object T3's Moving Speed is now: " + T3.getMovingSpeed());
        System.out.println("Object T4's Moving Speed is now: " + T4.getMovingSpeed());
        System.out.println("Object T5's Moving Speed is now: " + T5.getMovingSpeed());


        System.out.println();
        System.out.println("Object T1's Hunting Style is now: " + T1.getHuntingStyle());
        System.out.println("Object T2's Hunting Style is now: " + T2.getHuntingStyle());
        System.out.println("Object T3's Hunting Style is now: "  + T3.getHuntingStyle());
        System.out.println("Object T4's Hunting Style is now: "  + T4.getHuntingStyle());
        System.out.println("Object T5's Hunting Style is now: "  + T5.getHuntingStyle());
        System.out.println();


        // Carnivora Animal Objects
        Carnivora U1 = new Carnivora(2, true, true, 100000, 71.17, 10000, "Hors D'oeuvre");
        U1.printInfo("U1");
        Carnivora U2 = new Carnivora(2, true, true, 100000, 71.17, 10000, "Hors D'oeuvre");
        U2.printInfo("U2");
        Carnivora U3 = new Carnivora(2, true, true, 100000, 71.17, 10000, "Hors D'oeuvre");
        U3.printInfo("U3");
        Carnivora U4 = new Carnivora(2, true, true, 100000, 71.17, 10000, "Hors D'oeuvre");
        U4.printInfo("U4");
        Carnivora U5 = new Carnivora(2, true, true, 100000, 71.17, 10000, "Hors D'oeuvre");
        U5.printInfo("U5");
        System.out.println();


        System.out.println();
        System.out.println("Object U1's Moving Speed was: " + U1.getMovingSpeed());
        System.out.println("Object U2's Moving Speed was: " + U2.getMovingSpeed());
        System.out.println("Object U3's Moving Speed was: " + U3.getMovingSpeed());
        System.out.println("Object U4's Moving Speed was: " + U4.getMovingSpeed());
        System.out.println("Object U5's Moving Speed was: " + U5.getMovingSpeed());


        System.out.println();
        System.out.println("Object U1's Hunting Style was: " + U1.getHuntingStyle());
        System.out.println("Object U2's Hunting Style was: " + U2.getHuntingStyle());
        System.out.println("Object U3's Hunting Style was: " + U3.getHuntingStyle());
        System.out.println("Object U4's Hunting Style was: " + U4.getHuntingStyle());
        System.out.println("Object U5's Hunting Style was: " + U5.getHuntingStyle());


        // Changing Moving Speed and Hunting Style Attributes
        U1.setMovingSpeed(37.42);
        U1.setHuntingStyle("Stalking");
        U2.setMovingSpeed(37.42);
        U2.setHuntingStyle("Stalking");
        U3.setMovingSpeed(37.42);
        U3.setHuntingStyle("Stalking");
        U4.setMovingSpeed(37.42);
        U4.setHuntingStyle("Stalking");
        U5.setMovingSpeed(37.42);
        U5.setHuntingStyle("Stalking");


        // Showing the after state of moving state and hunting style
        System.out.println();
        System.out.println("Object U1's Moving Speed is now: " + U1.getMovingSpeed());
        System.out.println("Object U2's Moving Speed is now: " + U2.getMovingSpeed());
        System.out.println("Object U3's Moving Speed is now: " + U3.getMovingSpeed());
        System.out.println("Object U4's Moving Speed is now: " + U4.getMovingSpeed());
        System.out.println("Object U5's Moving Speed is now: " + U5.getMovingSpeed());


        System.out.println();
        System.out.println("Object T1's Hunting Style is now: " + U1.getHuntingStyle());
        System.out.println("Object T2's Hunting Style is now: " + U2.getHuntingStyle());
        System.out.println("Object T3's Hunting Style is now: " + U3.getHuntingStyle());
        System.out.println("Object T4's Hunting Style is now: " + U4.getHuntingStyle());
        System.out.println("Object T5's Hunting Style is now: " + U5.getHuntingStyle());

    }
    
}
