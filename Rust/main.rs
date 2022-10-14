/*
    ----------------------------
    < Hello fellow Rustaceans! >
    ----------------------------
              \
               \
                 _~^~^~_
             \) /  o o  \ (/
               '_   -   _'
               / '-----' \
*/

use std::io;

// Main Function
fn main() 
{
    // Reading from stdinput example
    println!("Guess the number!");
    println!("Please input your guess.");

    let mut guess = String::new();

    io::stdin()
        .read_line(&mut guess)
        .expect("Failed to read line");

    println!("You guessed: {guess}");

    /*
        mut keyword makes the variable mutable

        If mut isn't used, variable is bound to its original value.
    */

    let mut x = 5;
    println!("The value of x is: {x}");

    // Mutable means we can update the value of x
    x = 6;
    println!("The value of x is: {x}");

    // Declaring an array of int32 variables of size 5
    let array: [i32; 5] = [1, 2, 3, 4, 5];

    // String array called months
    let months = ["January", "February", "March", "April", "May", "June", "July",
              "August", "September", "October", "November", "December"];


    // Function call example below
    let number = 0;
    
    let v1 = increment(number);
    println!("The value is: {v1}");

    let v2 = decrement(number);
    println!("The value is: {v2}");   
}

// Return an increment of 1
fn increment(x: i32) -> i32 {
    x + 1
}

// Return a decrement of 1
fn decrement(x: i32) -> i32 {
    x - 1
}
