//Auther Jerald Huang Period A
//2025-08-27

public class ExerciseLesson4 {
    public static void main(String[] args) {
        //question 1
        int h = 103;
        int p =5;
        System.out.println(++h + p);
        System.out.println(h); //prints 104 because in line 6 they do ++h meaning add 1 to 104 so now the value of h = 104

        //question 2
        int j = 5;
        j = j + 1; //adds 1
        System.out.println(j); //prints 6
        int f = 5;
        f++; //adds 1 after established (post-increment)
        System.out.println(f); //prints 6
        int k = 5;
        k += 1; // k = k + 1
        System.out.println(k); //prints 6

        //question 3
        double def; //creates a double "def"
        double pop = 1992.37; //creates a double "pop" and gives it a value
        def = pop; //makes the value of def the same as pop
        System.out.println(def); //It prints 1992.37 

        //question 4
        int zulu = 10; //makes varible zulu and gives it value
        System.out.println(--zulu); //prints out the 10-1 = "9"

        //question 5
        int a = 100; //makes varible a = 100
        int b = 200; //makes varible b = 200
        b/=a; // does b = b/a 200/100 = 2
        System.out.println(b + 1); //prints 3 because it takes the new value of b (2) and adds 1 to it 
        
        //question 6
        int v = 100;
        int pot = 40;
        v -= (pot - 30);  // subtracts 10 from 100
        System.out.println(v);  // prints 90

        //question 7
        int table = 100;
        int random = 40;
        table = table - (random - 30);  // 40 - 30 then 100 - 10 to get 90
        System.out.println(table);  // prints 90

        //question 8
        int pots = 40; //makes varible pot - 40
        int queen = 4; // makes varible queen = 4
        System.out.println(2 + 8 * queen / 2 - pots); // 8 times queen (4) divided by 2 minus pots (40) + 2 prints -22

        //question 9
        int sd = 12; //makes a variable 12
        int x = 4; //makes a variable 4
        System.out.println( sd%(++x) ); //does 12/5 and gets remainder and prints it (prints 2)
        System.out.println(x); //prints 5 because in the previosse println we did ++x which means value of x goes up 1 

        //question 10
        //int g;
        //3 = g;
        //System.out.println(++g*79);
        //code doesnt work because they wrote 3 = g the correct way to do it is g = 3; if that was done the value printed would be 316

        //question 11
        double m = 3.14, boy = 3.14, fling = 3.14; //maeks 3 doubles and gives them a value on the same line
        System.out.println(m);
        System.out.println(boy);
        System.out.println(fling); //not needed but prints them

        //question 12
        int xfinity, yoyo, zoo; //makes 3 varibles 

        //question 13
        int money = 36;
        int job = 5;
        money = money / job; // new m is old m divided by j
        System.out.println(money);  //prints 36/5 no decimals and remainder (7)

        //question 14
        System.out.println(3/4 + 5*2/33 - 3 +8*3); // 3/4 and 10/33 become 0 then addition and subtraction are done left to right to get 21.
        
        //question 15
        //the equal sign it assigns a varible to a value 

        //question 16
        int jobs = 3; //variable jobs is made  value of 3
        int internal = 4; // variable internal is made value of 4
        int kings = internal%jobs; //variable kings is made value is the remainder of internal divided by kings (4/3 remainder 1)
        System.out.println(kings); //prints 1 because the value of kings is 1

        //question 17
        int jobbed = 2;
        System.out.println(7%3 + jobbed++ + (jobbed - 2) );

        //question 18
        // j -+ 1
        // --j
        // j--
        // all of these lower the value of j

    }
}
