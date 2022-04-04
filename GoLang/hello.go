package main

// Like Python imports or #include in C++
import (
	"errors"
	"fmt"
	"math"
)

type Dude struct {
	name string
	age  int
}

func main() {

	fmt.Println("Whaddup Bitches") // Simple print statement

	// Variable declarations, the := is equivalent to using auto in C++
	x := 5
	y := 7
	sum := x + y

	fmt.Println("The sum of x + y is:", sum)

	// If/Else example, the lining up of the syntax is very anal
	if sum > 10 {
		fmt.Println("The sum is greater than 10")
	} else {
		fmt.Println("The sum is less than 10")
	}

	// Array Declaration, Static Size
	// Println vs Print is similar to that in Java
	Nums := [10]int{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
	fmt.Println(Nums)

	// Statically declaring an array with its size based on an initilization list
	EvenMoreNums := []int{1, 3, 5, 7, 9}
	fmt.Println(EvenMoreNums)

	// Dynamically growing said array by appending new values to it
	EvenMoreNums = append(EvenMoreNums, 11, 13, 15)
	fmt.Println(EvenMoreNums)

	// Map of string keys to integer values
	Grocery_List := make(map[string]int)

	// Inserting values to the map
	Grocery_List["Butter"] = 2
	Grocery_List["Milk"] = 4
	Grocery_List["Eggs"] = 12
	Grocery_List["Sassafras"] = 16

	// Printing, deleting an item, and printing the map again
	fmt.Println(Grocery_List)
	delete(Grocery_List, "Sassafras")
	fmt.Println(Grocery_List)

	// For Loop example
	// Apparently, there are only For Loops in Go, no while loops
	for i := 0; i < 10; i++ {
		fmt.Println(i * 10)
	}

	// Range based for loop, looping through array
	for index, value := range EvenMoreNums {
		fmt.Println("Index:", index, "Value:", value)
	}

	// Range based for loop, looping through map
	for key, value := range Grocery_List {
		fmt.Println("Key:", key, "Value:", value)
	}

	// Function call within print statement
	fmt.Println("The sum is:", calculateSum(17, 39))

	// Square Root Stuff
	var q float64 = 169
	fmt.Print("The square root of ", q, " is: ")
	result, err := sqrt(q)

	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Println(result)
	}

	// Struct object declaration
	d := Dude{name: "Horace P McTitties", age: 69}
	fmt.Println(d)
	fmt.Println(d.name)

	// Pointer Shit
	pvalue := 420

	// To pass a pointer, we pass by reference like so:
	// Notice the use of the ampersand
	fmt.Println("pvalue is:", pvalue)
	pointerGoodness(&pvalue)
	fmt.Println("pvalue is:", pvalue)

}

// Pointer Function / Pass by Reference
func pointerGoodness(x *int) {

	// To dereference the pointer and actually affect the value, we must
	// use the asterisk in front of the value, otherwise we increment the
	// memory address instead
	*x++
}

// Simple addition sum function
func calculateSum(x int, y int) int {
	return x + y
}

// Second portion after the expected params is stating what it should return
// Think the way functions work in Solidity
func sqrt(num float64) (float64, error) {
	if num < 0 {
		return 0, errors.New("No imaginary numbers please")
	}

	// Here, since we specified we would return a flot or an error
	// We are returning the float and assigning nil (NULL) for the error
	// Without the nil at the ned, this code will error
	return math.Sqrt(num), nil
}
