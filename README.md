# Calculator

##### Author information:
___
* [link for GitHub profile from Laura Brcina](https://github.com/laurabrcina/bsd22_brcina_laura.git)
* [link for Campus02](https://www.campus02.at)
___

**What is the job of a calculator?**
*  The main task of a calculator is the calculation of numerical tasks.
*  Most calculators use small push buttons to enter data.
*  The keyboard layout depends on the variant of the calculator.

**Description**

A calculator is a small portable calculator that can be used to calculate numerical conditions. The newer versions of the calculator can also convert and solve symbolic mathematics, such as equations. A calculator is powered by either the baterrien or solar cell.
There are different types of calculators, for example:
* Simple calculators (used for basic calculations and percentage calculations)
* Boolean calculations (used for calculations with binary, octal and hexadecimal numbers)
* Scientific (used for trigonometric functions, logarithms, mathematical statistics, etc.)
* Programmable pocket calculator (used for processing complex calculations)
* Graphics-capable calculator (used for function/curve display)
* Computer Algebra Calculator (a graphing calculator with a computer algebra core)

 A programmed Java pocket calculator can also perform the calculations in this case. Just as with the portable pocket calculator, the program calculates the entries using the computer's pushbuttons, which are shown on the display. In the code you can specify various requirements, for example that the field for the input is repeated if you type in an invalid character.

 **Installation guide**

If you have problems setting up the calculator,you are using the product for the first time or want to find out what it can do, you can get the user manual in book form, which is usually supplied with the new product, or simply go to the manufacturer's website download the instructions.

In the case of the programmed calculator, you should look at the code to understand what the task of the program it is. With the help of a scanner, the entries are scanned or viewed in order to carry out the desired calculation. In addition to the scanner, you can use various also called loops in the code, such as "for loop", "if loop", "do", etc. The loops mentioned are used for checking in Java. That is so the loop repeats a statement block (loop body) as long as the loop condition remains valid, or in other words, until the condition does not lead to termination. The loops can be nested as desired.

In the main method, the scanner mentioned above is imported to enable the user to write the desired input. We pass System.in again as a parameter. In addition, we need the variables that you want to use in the code for the two required input fields. These can be declared with Double, which means that we want to calculate with both the whole and the decimal point. You can choose the name yourself. For example, let's take numr1, num2 and res or number1, number2 and result.

**How is the calculator used in Java?**

With most calculators, the basics are the same. Here are individual steps for using a calculator to get to know the basic functions of one calculator:

*1. ADDITION*

    To add two numbers, use the "+" button between the numbers. As a result you get the sum in the display after you have typed the character "=". For example, the input looks like this:
   *     public class addition{
         public static void main(String[] args) {
            double num1 = 3;
            double num2 = 2;
            double res = num1 + num2;
            System.out.println(res);}}

The result is output at the end as number **5** for the given example.

*2. SUBTRACTION*

    If you type a "-" between the two numbers, the two numbers will be subtracted from each other. You get the result after you press "=". For example, the input looks like this:
*     public class sub{
      public static void main(String[] args) {
            double num1 = 3;
            double num2 = 2;
            double res = num1 - num2;
            System.out.println(res);}}

The result is output at the end as number **1** for the given example.

*3. TO DIVIDE*

    For example, to calculate 10/2, press the key combination 10 "/" 2 "=" result. At the end you get the result.
*      public class div{
       public static void main(String[] args) {
            double num1 = 3;
            double num2 = 2;
            double res = num1 / num2;
            System.out.println(res);}}

The result is output at the end as number **5** for the given example.

*4. MULTIPLICATION*

    The "*" or "x" character is selected as the multiplication character. Add "=" at the end as usual.
*      public class mul{
       public static void main(String[] args) {
            double num1 = 3;
            double num2 = 2;
            double res = num1 * num2;
            System.out.println(res);}}
The result is output at the end as number **6** for the given example.

**Other ways of using the programmed calculator in Java**

This example is a simple programmed pocket calculator. However, a Java programmed calculator can do much more. You can build a Java calculator in such a way that it can calculate complex tasks. An example would be that Java can distinguish pubt calculation before line calculation. So the well-known laws of mathematics also apply to Java!

**The document was written by Laura Brcina.**

**Sources:**
* https://de.wikihow.com/Einen-Taschenrechner-verwenden
* https://de.wikipedia.org/wiki/Taschenrechner
* https://panjutorials.de/tutorials/java-tutorial-programmieren-lernen-fuer-anfaenger/lektionen/simpler-taschenrechner-in-java/
___
##### Exercises:
* [Exercise 1](exercise1.md)
* [Exercise 2](exercise2.md)
* [Exercise 3](exercise3.md)
* [Exercise 4](exercise4.md)
* [Exercise 5](exercise5.md)

___
* [Template](src/main/resources/log4j2.xml.template)