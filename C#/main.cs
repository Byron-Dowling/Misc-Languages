using System;

class Program 
{

  public class Student
  {
    public string name;
    public string mnumber;
    public string major;
    public int age;

    public Student (string Name, string mnum, string M, int A)
    {
      name = Name;
      mnumber = mnum;
      major = M;
      age = A;
    }
  }

  public static void Main (string[] args) 
  {
    int x = 3;
    int y = 4;

    double result = (x*x) + (y*y);

    result = Math.Sqrt(result);

    Console.WriteLine($"The hypotenuse is: {result}");

    Student S1 = new Student("Bob", "M200", "Accounting", 22);

    Console.WriteLine($"{S1.name} is a {S1.age} year old {S1.major} major");
  }
}
