# Java


**Google Doc of Java Notes :** https://docs.google.com/document/d/14FmoS95ogi9SRKYe2T6c0bgRLArqjA7GR4gPLJ9pw9Q/edit?usp=sharing


**📝 Access Request for My Google Doc Notes**

**Hello,**

Thank you for your interest in accessing my Google Doc notes. In order to maintain privacy and control over the sharing of my content, I kindly request that you follow these steps:

**Follow My GitHub Account:** Please follow my GitHub account, **@alokmotion**, to stay updated on my projects and activities.

**Send an Access Request:** After you've followed my GitHub account, please send me an access request by **Java** in the repository dedicated to access requests. In your issue, briefly introduce yourself and explain why you're interested in accessing my Google Doc notes. This will help me understand how my notes might be beneficial to you.

**Once I receive your request and verify your GitHub follow, I'll grant you access to the relevant Google Doc notes.**

Thank you for understanding, and I appreciate your cooperation in this process. If you have any questions or need further clarification, please don't hesitate to reach out.

Best regards, 
**Alok Patel**



<h4> Why Suffix "F" is required to store the real number literals in float Type variable. </h4>

<h4> Why suffix "L" is used to store the long literals </h4>

<h4> what is difference between print and println in java </h4>

<h4>What is Methods in java</h4>

<h4>What is Methods in java Overloading </h4>


<h4>What is Overloaded in Method Overloading ?</h4>


<h4>Constructors in Java
</h4>


## Question Practice

---------------------------------------------------------------------------------------------------------------------------------
 1. Write a java program to calculate and display the area for square, rectangle and circle. Take the user input in the main method.\
Note:
write a method calculateArea(int side ) to calculate the area for square.\
Write a method calculateArea(int length, int breadth ) to calculate the area for the rectangle.\
Write a method calculateArea(float radius) to calculate the area for a circle.
----------------------------------------------------------------------------------------------------------------------------------------




----------------------------------------------------------------------------------------------------------------------------------------

<details>
  <summary>Question: 1 Problem: Galactic Arithmetic</summary>

  
In a far-off galaxy named Arithmetica, beings have been using a newly discovered number system to make their life easier. However, they are facing difficulties in performing basic arithmetic operations. As the resident genius of planet Earth, you have been called upon to help them. Your first task is to build a function that will be able to add two numbers in their number system.

Function:

public static long galacticAddition(long num1, long num2);

Inputs:

The function galacticAddition(long num1, long num2) will receive two parameters:

num1 : a long integer representing the first number in the Arithmetica number system.

num2 : a long integer representing the second number in the Arithmetica number system.

Outputs:

The function will return a long - the sum of num1 and num2 in the Arithmetica number system.

Sample Input:

125678

9876543210L

Sample Output:

9876668888L

Note:

In the sample input, the two numbers provided to the function are 125678 and 9876543210. The sum of these two numbers is 125678+9876543210=9876668888, so the function returns 9876668888 as the output. Your task is to help the beings of Arithmetica perform this basic operation with ease. Good luck, Earth's genius!
  
 
</details>

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<details>
  <summary>Question:2 Problem: Arithmetic Operations</summary>

  You are a programmer in a school. The mathematics teacher has asked for your help to teach basic arithmetic operations to students. Your task is to create a set of functions that will do subtraction, multiplication, division, and find the remainder of two numbers.

Functions:

public static int subtractNumbers(int num1, int num2);

public static int multiplyNumbers(int num1, int num2);

public static double divideNumbers(int num1, int num2);

public static int findRemainder(int num1, int num2);

Inputs:

Each function will receive two parameters:

· num1 : an integer which represents the first number.

· num2 : an integer which represents the second number.

Outputs:

1. The subtractNumbers function will return an integer - the result of subtracting num2 from num1.

2. The multiplyNumbers function will return an integer - the result of multiplying num1 and num2.

3. The divideNumbers function will return a double - the result of dividing num1 by num2.

4. The findRemainder function will return an integer - the remainder when num1 is divided by num2.

Sample Input:

subtractNumbers(20, 5);

multiplyNumbers(4, 5);

divideNumbers(20, 4);

findRemainder(10, 3);

Sample Output:

15

20

5.00

1

Note:

In the sample input, the numbers given to the functions are (20, 5), (4, 5), (20, 4) and (10, 3) respectively. The functions correctly return the results of subtraction, multiplication, division and finding the remainder.



</details>

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<details>
  <summary> Question: 3 
  Problem: The Double Trouble 
 </summary>

 
 You are participating in a coding competition at your school. The challenge is to create a function that can double the value of any number provided. This function will help in the game design where scores need to be doubled under certain conditions. 
  
Function: 
public static int doubleTheNumber(int num); 
  
  
  
Inputs: 
 The function doubleTheNumber(int num) will receive one parameter: 
•	num : an integer which represents the number to be doubled. 
  
Outputs: 
The function will return an integer - the result of doubling the num. 
  
Sample Input:  
doubleTheNumber(15); 
  
Sample Output: 
30 
  
Note:  
In the sample input, the number given to the function is 15. The double of this number is 15*2=30, so the function returns 30 as the output. Your function should work accurately to make sure you win this competition. Good Luck! 
  


  </details>

  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


  <details>
   <summary>Question: 4  
 Problem: The String Joiner 
</summary>

You are creating a new social networking site. In one of the features, you have to combine the user's first name and last name to display the full name. Your task is to write a static method that will concatenate two strings. 
  
Function: 
public static String joinStrings(String str1, String str2); 
  
  
  
Inputs: 
The function joinStrings(String str1, String str2) will receive two parameters: 
•	str1 :a string which represents the first string. 
•	str2 : a string which represents the second string. 
  
Outputs: 
The function will return a string - the result of concatenating str1 and str2. 
  
Sample Input:  
joinStrings("Hello, ", "World!"); 
  
Sample Output:  
"Hello, World!" 
  
Note:  
In the sample input, the function is given two strings: "Hello, " and "World!". These two strings are concatenated to form "Hello, World!", which is the output. Make sure your function works properly to display the user's full name correctly on the social networking site. 
  

   
  </details>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



<details>
 <summary>Question 5: 
 Problem: The Journey Calculator 
</summary>

 You are a developer at a transportation company. The company is developing a new app that helps users track their journey. One of the features of the app is to calculate the distance travelled given the speed and time of the journey. Your task is to create a method that takes speed and time and returns the distance travelled. This method should be a non-static method and should be implemented inside a class named JourneyCalculator. 
  
Class Definition: 
  
public class JourneyCalculator { 
    public double calculateDistance(double speed, double time); 
} 
  
  
Inputs: 
  
The method calculateDistance(double speed, double time) will receive two parameters: 
•	speed : a double representing the speed of the vehicle in km/h. 
•	time : a double representing the time travelled in hours. 
  
Outputs: 
  
The method will return a double - the distance travelled. Round off the result to 2 decimal places. 
  
Sample Input: 
  
JourneyCalculator journeyCalculator = new JourneyCalculator(); 
journeyCalculator.calculateDistance(60.0, 1.5); 
  
Sample Output: 
  
90.00 
  
  
Note: 
  
In the sample input, the user's speed is 60 km/h and the time travelled is 1.5 hours. The distance travelled is speed*time = 60*1.5 = 90 kilometers, so the method returns 90.00 as the output. Your method will be crucial in helping users track their journey accurately. Good luck, developer! 

</details>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<details>
 <summary> Question 6: 
Problem: The Temperature Converter 
</summary>

 You are working as a software developer at a weather forecasting company. The company is developing a new feature for their app that allows users to convert temperatures from Fahrenheit to Celsius. Your task is to create a method that takes a temperature in Fahrenheit and converts it to Celsius.  
  
Hint: The formula to convert temperature from Fahrenheit to Celsius is:  
C = (F - 32) * 5/9 
  
Where: 
•	C is the temperature in Celsius 
•	F is the temperature in Fahrenheit 
  
Class Definition: 
public class TemperatureConverter { 
    public double convertFahrenheitToCelsius(double fahrenheit); 
} 
  
Inputs: 
The method convertFahrenheitToCelsius(double fahrenheit) will receive one parameter: 
•	fahrenheit : a double representing the temperature in Fahrenheit. 
  
Outputs: 
The method will return a double - the temperature converted to Celsius.  
  
Sample Input: 
TemperatureConverter temperatureConverter = new TemperatureConverter(); 
temperatureConverter.convertFahrenheitToCelsius(68.0); 
  
Sample Output: 
20.00 
  
Note: 
  
In the sample input, the user's temperature in Fahrenheit is 68.0. The temperature in Celsius is (68 - 32) * 5/9 = 20.00, so the method returns 20.00 as the output. Your method will be crucial in helping users understand the temperature in Celsius. Good luck, developer! 
  

</details>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<details>
 <summary>Question 7 : 
 Problem: Semester Marks Averager 
</summary>


 You are creating a student portal for your school. The portal needs to display the average marks of a student for 8 semesters. Your task is to write a Java function that takes the marks of each semester individually and returns the average. 
  
Function: 
  
public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8); 
  
  
Inputs: 
  
The function calculateAverage(i85sem7, int sem8) will receive eight parameters: 
•	sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8 : Eight integers each representing the total marks obtained in a semester. 
  
Outputs: 
  
The function will return a double - the average marks over 8 semesters.   
Example: 
  
Sample Input: 
  
calculateAverage(85, 79, 91, 76, 88, 95, 80, 85); 
  
  
Sample Output: 
  
84.88 
  
  
Note: 
  
In the sample input, the marks for the 8 semesters are given. The average of these marks is (85+79+91+76+88+95+80+85)/8 = 84.88. So, the function returns 84.88 as the output. Make sure your function calculates the average correctly to display accurate information on the student portal. 
  

</details>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<details>
 <summary>Question: 8 
 Problem: The Power of Squares 
</summary>


 You are a software developer at a gaming company. The company is developing a new game called "The Power of Squares". In this game, players have to square the number provided to advance to the next level. Your task is to create a function that will calculate the square of the number provided. 
  
Function: 
  
public static int squareNumber(int num); 
  
  
Inputs: 
  
The function squareNumber(int num) will receive one parameter: 
•	num : an integer which represents the number that the player has to square. 
  
Outputs: 
  
The function will return an integer - the square of num. 
  
Example: 
  
Sample Input: 
  
squareNumber(7); 
  
  
Sample Output: 
49 
  
  
Note: 
In the sample input, the player is at a level where the number to square is 7. The square of this number is 7*7=49, so the function returns 49 as the output. The function you develop will be a crucial part of "The Power of Squares" game, ensuring players can progress through levels accurately. Good luck, game developer! 
  
 

</details>


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
