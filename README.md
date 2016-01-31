## Exercise: GaussianEaster (10 Points)

The project name of this exercise is **GaussianEaster**.

The purpose of this assignment is for you to write more of your own comments and to express solutions to complex problems using variables to make them more readable. 

### Problem Description

The detailed description of this problem comes from the Programming Exercise P4.2 that is in the book (page 172).

This problem should be solved by writing all your code in `public static void main`. Your final variables should use the (terrible) variable names given in the programming project. You will want to implement the algorithm inside of the `main` method. All of the variables mentioned in the algorithm should be local variables. 

Using the test year of 2001 shown in the book the output should look like:

Year: 2001 Month: 4 Day: 15

### Getting Started

Like our last exercise, we are going to do this exercise by writing the source code that solves the problem first in **Main.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](https://github.com/sbcc-cs105-spring2016/HowToStartEveryProject) create a source file called **Main.java**. This is where your code will go. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS 105 Theory & Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: GaussianEaster
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

import java.util.*;

/**
 * This class implments the GaussianEaster algorithm.
 *
 */
public class Main {

    /**
     * Test this code by asking for a year and then having the code compute the value.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {

    }
}
```

Now go through Main.java and change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed.

For your code you can use this kind of case:

Input Easter year: 2001
Year: 2001 Month: 4 Day: 15

The output is computed and output as shown.

Once you've written your code run the code by single clicking on **Main.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

###Using my Unit Tests

Next we are going to use my unit tests to test your code. For most exercises there will be a unit test supplied that I wrote. You are supposed to use this unit test after you have written the code in **Main.java**.

When you forked the project from GitHub, my unit tests were copied over. In your project you should see **GaussianEasterTester.java** in the `unittest.cs105` package.

The forked GaussianEaster project from GitHub should look like this:

<img src="https://www.dropbox.com/s/4o3rjijlug1j5j7/miyazaki_layout.png?dl=1" width="252" height="179" />

Yours should look **_very_** similar! The name of the tester will change for each project, and you might have a different JRE System Library though. What should be the same are the packages and what they contain.

###Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

Once you have run the tests, the results of them should look something like the following:

<img src="https://www.dropbox.com/s/79zw4fbsjebbx1s/junit_test.png?dl=1" width="257" height="445" />

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on GitHub in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. You should see the following dialog:

![Commit dialogue](https://www.dropbox.com/s/lojod76ghyzl626/commit-git.png?dl=1)

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **Main.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your GitHub username and password) go by and then you will see something similar to the following:

![Push dialogue](https://www.dropbox.com/s/niao32p4abbx4k2/push-git.png?dl=1)

1. Push **OK** to complete the commit. You may get no confirmation, but you can check GitHub to see if the code now exists there.

####Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on GitHub, you need to create a **pull request** against the class GitHub repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository for this assignment on GitHub and click on the **Pull Request** icon. You should see something similar to this picture:

<img src="https://www.dropbox.com/s/tt3rejkyd8xmxxm/EX02-pull-request.png?dl=1" width="661" height="175" />

1\. Click on **New pull request**

The next screen then shows all or your commits up to this point.  It shows the difference between what you originally forked with what you have committed. This difference, often called a "diff", is what your turning in and what I will be grading. 

This screen should look like this at the top:

<img src="https://www.dropbox.com/s/nxzenwey4fanmsz/EX02-create-pull-request.png?dl=1" width="661" height="171" />

2\. Click on **Create pull request**

This final action "_turns_" in the assignment on GitHub. It also causes your code to be unit tested on a separate server. The result should be exactly the same as when you ran it on your computer.

After grading the exercise, the pull request will be closed without merging back into the original project. This is the normal workflow and does not represent any problem with your code.

Finally, you should receive an email that has links to both the pull request and the results of running your code.

**NOTE** You do not need to anything on Moodle to turn-in your assignment, but your grade will be posted on there so that you mab track your progress throughout the term.