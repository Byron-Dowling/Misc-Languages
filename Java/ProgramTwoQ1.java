/** 
    @author:    Byron Dowling
    Assignment: Programming Assignment #1   - Question 1
    Course:     CMPS 4143 Contemporary Programming Languages
    Date:       10/5/21

    Program Description:

        ***Original Assignment Instructions***

        1. Write an OOP code (A case study: Should be unique; If you are copying code from online you will
           be caught) that has the following OOP features: inheritance(any), polymorphism (runtime and
           compile time), abstraction and encapsulation (20 points)


*/

import java.io.*;

/*
    Borrowed the interface we used from class and expanded on it to make a
    chain of vehicle related classes that will implement the several different
    OOP concepts in Java that we have covered in class.                                                          
*/

interface Vehicle
{
    public void setMPG(int a);
    public void setEngineCylinders(int a);
    public void setDriveTrain(int a);
    public void setEngineType(String A);
}


/*
    The Mercedes class implements the Vehicle interface because it will successfully
    define the methods specified by the Vehicle interface. It also includes some 
    setters and getters to update the public class variables such as drive train
    model, miles per gallon etc.                                                                  
*/

class Mercedes implements Vehicle
{
    public int _mpg;
    public int _cylinder;
    public String _engineType;
    public int _driveTrain;
    public String _model;

    public void setMPG(int mpg)
    {
        _mpg = mpg;
    }

    public void setEngineCylinders(int enCyl)
    {
        _cylinder = enCyl;
    }


    public void setDriveTrain(int dt)
    {
        _driveTrain = dt;
    }

    public void setEngineType(String et)
    {
        _engineType = et;
    }

    public void setModel(String m)
    {
        _model = m;
    }

    public void showData()
    {
        System.out.println("Our object created a " + _model + " complete with a 6.2 liter V" + _cylinder + " engine");
        System.out.println("Unfortunately, all that engine comes with a pitiful " + _mpg + " Miles Per Gallon");
    }
}



/*
    Here we have an abstract class called Tesla. It's an abstract class because we did not 
    implement set engine type method because Tesla vehicles do not have engine cylinders.
    Also using this class to demonstrate an overriden method.

*/

abstract class Tesla implements Vehicle
{
    public int _mpg;
    public String _engineType;
    public int _driveTrain;
    public int _rangePerCharge;
    public String _model;

    public void setMPG(int mpg)
    {
        _mpg = mpg;
    }

    public void setDriveTrain(int dt)
    {
        _driveTrain = dt;
    }

    public void setEngineType(String et)
    {
        _engineType = et;
    }

    public void printMessage()
    {
        System.out.println("Electric Sports Cars are cool!");
    }
}


/*
    The Porsche class extends Tesla and finishes implementing the interface that the
    abstract class Tesla did not do. It inherits some of the same features which makes
    sense as the object we declare is a Prosche Taycan which is a gas/electric hybrid
    super car and therfore shares features from a normal gas vehicle and an electric
    one. This class utilizes encapsulation to shield a private integer from the being 
    accessed and has indirect access through a "setter and getter" and also uses
    run-time polymorphism to override the inherited printMessage method.
    
    Didn't fully implement all the functionality of the class since it isn't necessarily
    required to fulfill the specified requirements.
*/

class Porsche extends Tesla
{
    public int _mpg;
    public double _cityMpg;
    public String _engineType;
    public int _driveTrain;
    public int _rangePerCharge;
    public int _cylinder;
    public String _model;

    private int _combinedHP;

    public void setMPG(int mpg)
    {
        _mpg = mpg;
    }

    public void setMPG(double mpg)
    {
        _cityMpg = mpg;
    }

    public void setEngineCylinders(int enCyl)
    {
        _cylinder = enCyl;
    }

    public void setDriveTrain(int dt)
    {
        _driveTrain = dt;
    }

    public void setEngineType(String et)
    {
        _engineType = et;
    }


    public void setHP(int hp)
    {
        _combinedHP = hp;
    }

    public int getHP()
    {
        return _combinedHP;
    }

    public void setModel(String m)
    {
        _model = m;
    }

    @Override public void printMessage()        // Overriden method inherited from Tesla
    {
        System.out.println("Hybrid Electric Sport cars are even cooler!");
    }

}


public class ProgramTwoQ1 
{
    public static void main(String[] args)
    {
        Mercedes AMG =  new Mercedes();             // Single Inheritance Class from Interface

        AMG.setDriveTrain(4);
        AMG.setEngineCylinders(8);
        AMG.setMPG(10);
        AMG.setEngineType("Gas");
        AMG.setModel("Mercedes C63 AMG");
        AMG.showData();

        Porsche Taycan = new Porsche();             // Inherits from Abstract Class and finishes implementing the interface

        Taycan.setMPG(75.7);                        // Overloaded Method (Compile Time Polymorphism)
        Taycan.setModel("Porsche Taycan Turbo");
        Taycan.setHP(616);                          // Encapsulation Method, indirectly accessing private member
        Taycan.printMessage();                      // Overriden Method (Run-Time Polymorphism)
    }
}

