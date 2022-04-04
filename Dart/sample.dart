import 'dart:io';

// Custom Defined Class
class Person {
  String name;
  int age;
  var ssn;

  Person(this.name, this.age, this.ssn);

  Person.provided(String name, int age, var ssn) : this(name, age, ssn);

  void showOutput() {
    print(name);
    print(age);
    print(ssn);
  }
}

dynamic squared(var x) {
  return x * x;
}

dynamic cubed(var x) {
  return x * x * x;
}

// could also declare as void main(), the lack of a type makes it void
main() {
  // Simple Variable Stuff
  // Seems very Java and C# like

  var firstName = 'Byron'; // var is like auto
  String lastName = 'Dowling';
  print(firstName + ' ' + lastName);

  stdout.writeln('what is your name?'); // cout-like statment
  String? name = stdin.readLineSync(); // cin-like statement
  // ? mark implies the variable is unkown
  print('Hello $name'); // Similar to f strings in Python

  // Embedding variables in strings
  var message = "You have entered $name";
  print(message);

  int amount1 = 100;
  var amount2 = 200;

  var amount3 = amount1 + amount2;

  print('\nAmount 1: $amount1 | Amount 2: $amount2 | Amount 3: $amount3 \n');

  double cost1 = 100.11;
  var cost2 = 200.12;

  var cost3 = cost1 + cost2;

  print('\nCost 1: $cost1 | Cost 2: $cost2 | Cost 3: $cost3 \n');

  // Raw String example
  // Useful for getting quotations in text properly

  var st = "This string will have \n an extra line";
  var str = r'This string will not have an extra \n character';

  print(st);
  print(str);

  // int/double to string manipulation
  var pi = 3.14159;
  String piString = pi.toStringAsFixed(2);
  print('$pi becomes $piString');

  // Compund assignment operators work like they do in C++ and others
  var num = 200;
  num *= 10;

  // Both of these do the same thing.
  num++;
  num += 1;

  // Boolean operators are the same such as && and ||
  if (num > 0 && num < 5000) {
    print('The number is $num');
  }

  // Declaring an Object
  var p = Person("Bob Saget", 57, "123-12-1234");

  print(
      p); // Doesn't work the way you would think, prints "instance of 'object'"
  print(p.name); // Will print null
  // print(p.name ??= "Steve Jobs"); // Will Print Steve Jobs if value is null
  // ??= menans to assign the trailing value only if the value will be null

  // Standard for loop
  for (var i = 0; i < 10; i++) {
    print("Loop iteration $i");
  }

  // Array
  var list = [1, 2, 3, 4, 5];

  // Looping through list/array
  for (var x in list) {
    print(x);
  }

  // Looping through same list in a different way
  for (var i = 0; i < list.length; i++) {
    print(list[i]);
  }

  // While loop example
  var countdown = 5;
  print("\nInitiate Countdown\n");
  while (countdown > 0) {
    print(countdown);
    countdown--;
  }

  // List stuff

  // By not specifying, this becomes a list of various items
  List stuff = ['Steve', 'Peggy', 'Natasha', 'Tony', 3.14, 11];
  print(stuff.length); // Prints the size of the list

  // List that is explicitly strings only
  List<String> people = ['Steve', 'Peggy', 'Natasha', 'Tony'];
  print(people.length);

  List moreStuff = stuff; // Shallow Copy
  List evenMoreStuff = [...stuff]; // Deep Copy

  print("Original Stuff: $stuff");
  stuff[0] = 'Quentin';
  print("Original Stuff with change: $stuff");
  print("Shallow Copy: $moreStuff");
  print("Deep Copy: $evenMoreStuff");

  // Dictionary-like object
  var inventory = {'beef': 22.8, 'chicken': 16.4, 'Sea Bass': 14};
  print("Current Inventory: $inventory");

  var someNumber = 3;
  var sqr = squared(someNumber); // Function Call
  var cube = cubed(someNumber); // Function Call

  print("$someNumber squared is: $sqr, and $someNumber cubed is $cube");
}
