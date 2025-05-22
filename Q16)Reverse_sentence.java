/*
Write a program to accept a line of text consisting of the letters, comma and white space characters. Print the words of the
text in the following format:
Example- Input:
Emotions, controlled and directed to work, is character, By Swami Vivekananda
Output:
Vivekananda Swami By character is work to directed and controlled Emotions
 */

import java.util.*;
class reverse_sentence 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line : ");
        String s = sc.nextLine();
        s = s.replace(',', ' ');   
        s = s.trim();              
        s = s + " ";  
        String w = "";
        String nw = "";
        int l = s.length();
        for (int i = 0; i < l; i++) 
        {
            char ch = s.charAt(i);
            if (ch != ' ')
                w = w + ch;
            else 
            {
                    nw = w + " " + nw;
                    w = "";
            }
        }
        System.out.println("Reversed sentence: " + nw);
    }
}

/*
Enter a line : Emotions, controlled and directed to work, is character, By Swami Vivekananda
Reversed sentence: Vivekananda Swami By  character is  work to directed and controlled  Emotions 
Enter a line : Hello,How are you,I am fine,take care 
Reversed sentence: care take fine am I you are How Hello
*/
