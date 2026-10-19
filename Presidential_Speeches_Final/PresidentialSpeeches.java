
/**
 * Scans and gathers information about presidential speechs
 *
 * @ Clay and Divam
 * @ 10/19/2026
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PresidentialSpeeches
{
    public static void main(String [] args) throws IOException
    {

File file1 = new File("C:\\Users\\rcriddell\\Downloads\\Presidential-Speeches-main\\Presidential-Speeches-main\\Presidential Speeches\\speeches\\Speech1.json");
Scanner scanner1 = new Scanner(file1);
String rawJson1 = "";
while (scanner1.hasNextLine()) {
    rawJson1 += scanner1.nextLine() + " ";
}
scanner1.close();

//Lines 17-23 read the entire file into a string variable

System.out.println("=======================================================");
System.out.println("SPEECH 1");

String president1 = extractJsonValue(rawJson1, "president");
String date1 = extractJsonValue(rawJson1, "date");

if (date1.indexOf("T") != -1) {
    date1 = date1.substring(0, date1.indexOf("T"));
}

//33-35 cuts off the time from the president and date given, and 27-28 saves the president and date as variables


System.out.println("President: " + president1);
System.out.println("Date: " + date1);
System.out.println("Speech Length (Chars): " + rawJson1.length());

int wordCount1 = 0;
int totalLetters1 = 0;

int peopleCount1 = 0;
int governmentCount1 = 0;
int unitedCount1 = 0;
int ourCount1 = 0;

String currentWord1 = "";

//Initlizies variable 

for (int i = 0; i < rawJson1.length(); i++) {
    char c = rawJson1.charAt(i); //grabs the current character as a variable 'c'

    if (c != ' ') {
        //if the current character isn't a space, it adds that character to the current word
        currentWord1 += c;
    } else {
        if (currentWord1.length() > 0) {
            //only runs if the current character is a space
            wordCount1++; //updates word count because space means the word just ended
            totalLetters1 += currentWord1.length(); //updates total letters by that words length

            if (currentWord1.toUpperCase().equals("PEOPLE")) {
                peopleCount1++;
            } else if (currentWord1.toUpperCase().equals("GOVERNMENT")) {
                governmentCount1++;
            } else if (currentWord1.toUpperCase().equals("UNITED")) {
                unitedCount1++;
            } else if (currentWord1.toUpperCase().equals("OUR")) {
                ourCount1++;
            }

            currentWord1 = "";
            //68-76 checks if the word is equal to the 4 key words, and 78 resets the word back to a empty string
        }
    }
}

System.out.println("Total Words: " + wordCount1);

System.out.println("Average word length: " + (totalLetters1 / wordCount1));

System.out.println("People is used " + peopleCount1 + " times.");
System.out.printf("People percentage: %.2f%%\n", ((double) peopleCount1 / wordCount1) * 100);

System.out.println("Government count: " + governmentCount1 + " times.");
System.out.printf("Government percentage: %.2f%%\n", ((double) governmentCount1 / wordCount1) * 100);

System.out.println("United is counted " + unitedCount1 + " times.");
System.out.printf("United percentage: %.2f%%\n", ((double) unitedCount1 / wordCount1) * 100);

System.out.println("Our is counted " + ourCount1 + " times.");
System.out.printf("Our percentage: %.2f%%\n", ((double) ourCount1 / wordCount1) * 100);

//84-98 is just simple average caluclations and print statements of the data found
// the following code in this method is just a copy/paste of the code above, but with different numbers in variable names



File file2 = new File("C:\\Users\\rcriddell\\Downloads\\Presidential-Speeches-main\\Presidential-Speeches-main\\Presidential Speeches\\speeches\\Speech2.json");
Scanner scanner2 = new Scanner(file2);
String rawJson2 = "";
while (scanner2.hasNextLine()) {
    rawJson2 += scanner2.nextLine() + " ";
}
scanner2.close();

System.out.println("=======================================================");
System.out.println("SPEECH 2");

String president2 = extractJsonValue(rawJson2, "president");
String date2 = extractJsonValue(rawJson2, "date");

if (date2.indexOf("T") != -1) {
    date2 = date2.substring(0, date2.indexOf("T"));
}

System.out.println("President: " + president2);
System.out.println("Date: " + date2);
System.out.println("Speech Length (Chars): " + rawJson2.length());

int wordCount2 = 0;
int totalLetters2 = 0;

int peopleCount2 = 0;
int governmentCount2 = 0;
int unitedCount2 = 0;
int ourCount2 = 0;

String currentWord2 = "";

for (int i = 0; i < rawJson2.length(); i++) {
    char c = rawJson2.charAt(i);

    if (c != ' ') {
        currentWord2 += c;
    } else {
        if (currentWord2.length() > 0) {
            wordCount2++;
            totalLetters2 += currentWord2.length();

            if (currentWord2.toUpperCase().equals("PEOPLE")) {
                peopleCount2++;
            } else if (currentWord2.toUpperCase().equals("GOVERNMENT")) {
                governmentCount2++;
            } else if (currentWord2.toUpperCase().equals("UNITED")) {
                unitedCount2++;
            } else if (currentWord2.toUpperCase().equals("OUR")) {
                ourCount2++;
            }

            currentWord2 = "";
        }
    }
}

System.out.println("Total Words: " + wordCount2);

System.out.println("Average word length: " + (totalLetters2 / wordCount2));


System.out.println("People is used " + peopleCount2 + " times.");
System.out.printf("People percentage: %.2f%%\n", ((double) peopleCount2 / wordCount2) * 100);

System.out.println("Government count: " + governmentCount2 + " times.");
System.out.printf("Government percentage: %.2f%%\n", ((double) governmentCount2 / wordCount2) * 100);

System.out.println("United is counted " + unitedCount2 + " times.");
System.out.printf("United percentage: %.2f%%\n", ((double) unitedCount2 / wordCount2) * 100);

System.out.println("Our is counted " + ourCount2 + " times.");
System.out.printf("Our percentage: %.2f%%\n", ((double) ourCount2 / wordCount2) * 100);



File file3 = new File("C:\\Users\\rcriddell\\Downloads\\Presidential-Speeches-main\\Presidential-Speeches-main\\Presidential Speeches\\speeches\\Speech3.json");
Scanner scanner3 = new Scanner(file3);
String rawJson3 = "";
while (scanner3.hasNextLine()) {
    rawJson3 += scanner3.nextLine() + " ";
}
scanner3.close();

System.out.println("=======================================================");
System.out.println("SPEECH 3");

String president3 = extractJsonValue(rawJson3, "president");
String date3 = extractJsonValue(rawJson3, "date");

if (date3.indexOf("T") != -1) {
    date3 = date3.substring(0, date3.indexOf("T"));
}

System.out.println("President: " + president3);
System.out.println("Date: " + date3);
System.out.println("Speech Length (Chars): " + rawJson3.length());

int wordCount3 = 0;
int totalLetters3 = 0;

int peopleCount3 = 0;
int governmentCount3 = 0;
int unitedCount3 = 0;
int ourCount3 = 0;

String currentWord3 = "";

for (int i = 0; i < rawJson3.length(); i++) {
    char c = rawJson3.charAt(i);

    if (c != ' ') {
        currentWord3 += c;
    } else {
        if (currentWord3.length() > 0) {
            wordCount3++;
            totalLetters3 += currentWord3.length();

            if (currentWord3.toUpperCase().equals("PEOPLE")) {
                peopleCount3++;
            } else if (currentWord3.toUpperCase().equals("GOVERNMENT")) {
                governmentCount3++;
            } else if (currentWord3.toUpperCase().equals("UNITED")) {
                unitedCount3++;
            } else if (currentWord3.toUpperCase().equals("OUR")) {
                ourCount3++;
            }

            currentWord3 = "";
        }
    }
}

System.out.println("Total Words: " + wordCount3);

System.out.println("Average word length: " + (totalLetters3 / wordCount3));


System.out.println("People is used " + peopleCount3 + " times.");
System.out.printf("People percentage: %.2f%%\n", ((double) peopleCount3 / wordCount3) * 100);

System.out.println("Government count: " + governmentCount3 + " times.");
System.out.printf("Government percentage: %.2f%%\n", ((double) governmentCount3 / wordCount3) * 100);

System.out.println("United is counted " + unitedCount3 + " times.");
System.out.printf("United percentage: %.2f%%\n", ((double) unitedCount3 / wordCount3) * 100);

System.out.println("Our is counted " + ourCount3 + " times.");
System.out.printf("Our percentage: %.2f%%\n", ((double) ourCount3 / wordCount3) * 100);



File file4 = new File("C:\\Users\\rcriddell\\Downloads\\Presidential-Speeches-main\\Presidential-Speeches-main\\Presidential Speeches\\speeches\\Speech4.json");
Scanner scanner4 = new Scanner(file4);
String rawJson4 = "";
while (scanner4.hasNextLine()) {
    rawJson4 += scanner4.nextLine() + " ";
}
scanner4.close();

System.out.println("=======================================================");
System.out.println("SPEECH 4");

String president4 = extractJsonValue(rawJson4, "president");
String date4 = extractJsonValue(rawJson4, "date");

if (date4.indexOf("T") != -1) {
    date4 = date4.substring(0, date4.indexOf("T"));
}

System.out.println("President: " + president4);
System.out.println("Date: " + date4);
System.out.println("Speech Length (Chars): " + rawJson4.length());

int wordCount4 = 0;
int totalLetters4 = 0;

int peopleCount4 = 0;
int governmentCount4 = 0;
int unitedCount4 = 0;
int ourCount4 = 0;

String currentWord4 = "";

for (int i = 0; i < rawJson4.length(); i++) {
    char c = rawJson4.charAt(i);

    if (c != ' ') {
        currentWord4 += c;
    } else {
        if (currentWord4.length() > 0) {
            wordCount4++;
            totalLetters4 += currentWord4.length();

            if (currentWord4.toUpperCase().equals("PEOPLE")) {
                peopleCount4++;
            } else if (currentWord4.toUpperCase().equals("GOVERNMENT")) {
                governmentCount4++;
            } else if (currentWord4.toUpperCase().equals("UNITED")) {
                unitedCount4++;
            } else if (currentWord4.toUpperCase().equals("OUR")) {
                ourCount4++;
            }

            currentWord4 = "";
        }
    }
}

System.out.println("Total Words: " + wordCount4);

System.out.println("Average word length: " + (totalLetters4 / wordCount4));


System.out.println("People is used " + peopleCount4 + " times.");
System.out.printf("People percentage: %.2f%%\n", ((double) peopleCount4 / wordCount4) * 100);

System.out.println("Government count: " + governmentCount4 + " times.");
System.out.printf("Government percentage: %.2f%%\n", ((double) governmentCount4 / wordCount4) * 100);

System.out.println("United is counted " + unitedCount4 + " times.");
System.out.printf("United percentage: %.2f%%\n", ((double) unitedCount4 / wordCount4) * 100);

System.out.println("Our is counted " + ourCount4 + " times.");
System.out.printf("Our percentage: %.2f%%\n", ((double) ourCount4 / wordCount4) * 100);



File file5 = new File("C:\\Users\\rcriddell\\Downloads\\Presidential-Speeches-main\\Presidential-Speeches-main\\Presidential Speeches\\speeches\\Speech5.json");
Scanner scanner5 = new Scanner(file5);
String rawJson5 = "";
while (scanner5.hasNextLine()) {
    rawJson5 += scanner5.nextLine() + " ";
}
scanner5.close();

System.out.println("=======================================================");
System.out.println("SPEECH 5");

String president5 = extractJsonValue(rawJson5, "president");
String date5 = extractJsonValue(rawJson5, "date");

if (date5.indexOf("T") != -1) {
    date5 = date5.substring(0, date5.indexOf("T"));
}

System.out.println("President: " + president5);
System.out.println("Date: " + date5);
System.out.println("Speech Length (Chars): " + rawJson5.length());

int wordCount5 = 0;
int totalLetters5 = 0;

int peopleCount5 = 0;
int governmentCount5 = 0;
int unitedCount5 = 0;
int ourCount5 = 0;

String currentWord5 = "";

for (int i = 0; i < rawJson5.length(); i++) {
    char c = rawJson5.charAt(i);

    if (c != ' ') {
        currentWord5 += c;
    } else {
        if (currentWord5.length() > 0) {
            wordCount5++;
            totalLetters5 += currentWord5.length();

            if (currentWord5.toUpperCase().equals("PEOPLE")) {
                peopleCount5++;
            } else if (currentWord5.toUpperCase().equals("GOVERNMENT")) {
                governmentCount5++;
            } else if (currentWord5.toUpperCase().equals("UNITED")) {
                unitedCount5++;
            } else if (currentWord5.toUpperCase().equals("OUR")) {
                ourCount5++;
            }

            currentWord5 = "";
        }
    }
}

System.out.println("Total Words: " + wordCount5);

System.out.println("Average word length: " + (totalLetters5 / wordCount5));


System.out.println("People is used " + peopleCount5 + " times.");
System.out.printf("People percentage: %.2f%%\n", ((double) peopleCount5 / wordCount5) * 100);

System.out.println("Government count: " + governmentCount5 + " times.");
System.out.printf("Government percentage: %.2f%%\n", ((double) governmentCount5 / wordCount5) * 100);

System.out.println("United is counted " + unitedCount5 + " times.");
System.out.printf("United percentage: %.2f%%\n", ((double) unitedCount5 / wordCount5) * 100);

System.out.println("Our is counted " + ourCount5 + " times.");
System.out.printf("Our percentage: %.2f%%\n", ((double) ourCount5 / wordCount5) * 100);



File file6 = new File("C:\\Users\\rcriddell\\Downloads\\Presidential-Speeches-main\\Presidential-Speeches-main\\Presidential Speeches\\speeches\\Speech6.json");
Scanner scanner6 = new Scanner(file6);
String rawJson6 = "";
while (scanner6.hasNextLine()) {
    rawJson6 += scanner6.nextLine() + " ";
}
scanner6.close();

System.out.println("=======================================================");
System.out.println("SPEECH 6");

String president6 = extractJsonValue(rawJson6, "president");
String date6 = extractJsonValue(rawJson6, "date");

if (date6.indexOf("T") != -1) {
    date6 = date6.substring(0, date6.indexOf("T"));
}

System.out.println("President: " + president6);
System.out.println("Date: " + date6);
System.out.println("Speech Length (Chars): " + rawJson6.length());

int wordCount6 = 0;
int totalLetters6 = 0;

int peopleCount6 = 0;
int governmentCount6 = 0;
int unitedCount6 = 0;
int ourCount6 = 0;

String currentWord6 = "";

for (int i = 0; i < rawJson6.length(); i++) {
    char c = rawJson6.charAt(i);

    if (c != ' ') {
        currentWord6 += c;
    } else {
        if (currentWord6.length() > 0) {
            wordCount6++;
            totalLetters6 += currentWord6.length();

            if (currentWord6.toUpperCase().equals("PEOPLE")) {
                peopleCount6++;
            } else if (currentWord6.toUpperCase().equals("GOVERNMENT")) {
                governmentCount6++;
            } else if (currentWord6.toUpperCase().equals("UNITED")) {
                unitedCount6++;
            } else if (currentWord6.toUpperCase().equals("OUR")) {
                ourCount6++;
            }

            currentWord6 = "";
        }
    }
}

System.out.println("Total Words: " + wordCount6);

System.out.println("Average word length: " + (totalLetters6 / wordCount6));


System.out.println("People is used " + peopleCount6 + " times.");
System.out.printf("People percentage: %.2f%%\n", ((double) peopleCount6 / wordCount6) * 100);

System.out.println("Government count: " + governmentCount6 + " times.");
System.out.printf("Government percentage: %.2f%%\n", ((double) governmentCount6 / wordCount6) * 100);

System.out.println("United is counted " + unitedCount6 + " times.");
System.out.printf("United percentage: %.2f%%\n", ((double) unitedCount6 / wordCount6) * 100);

System.out.println("Our is counted " + ourCount6 + " times.");
System.out.printf("Our percentage: %.2f%%\n", ((double) ourCount6 / wordCount6) * 100);
System.out.println("=======================================================");
}


    public static String extractJsonValue(String json, String key) {
        //this method was taken from the code given on the doc
        String keyTarget = "\"" + key + "\":";
        int keyIndex = json.indexOf(keyTarget);
        if (keyIndex == -1) {
            return "";
        }
    
        // Locate the first opening quote after the key
        int startQuote = json.indexOf("\"", keyIndex + keyTarget.length());
        if (startQuote == -1) {
            return "";
        }
    
        // Locate the matching closing quote
        int endQuote = json.indexOf("\"", startQuote + 1);
        
        // Handle escaped quotes inside the speech text (e.g., \")
        while (endQuote != -1 && json.charAt(endQuote - 1) == '\\') {
            endQuote = json.indexOf("\"", endQuote + 1);
        }
    
        if (endQuote == -1) {
            return "";
        }
    
        return json.substring(startQuote + 1, endQuote);
}
}

