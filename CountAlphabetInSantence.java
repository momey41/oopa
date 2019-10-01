package chap4;

import java.util.Scanner;

public class CountAlphabetInSantence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Sentence : ");
        String sentence = sc.nextLine();
        int vowels = 0;
        int Nvowels = 0;
        int chara = 0;
        int numn = 0;
        sentence = sentence.replace(" ", "");
        //System.out.println("ค่าที่ป้อนคือ : " + sentence);
        System.out.println("The sentence contains alphabats " + sentence.length());
        //System.out.println("แปลงเป็นพิมพ์เล็ก : " + sentence.toLowerCase());
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // System.out.println("c =" + c);
            {
                sentence = sentence.toLowerCase();
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels++;
            } else if (c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u' || c != 'A' || c != 'E' || c != 'I' || c != 'O' || c != 'U') {
                Nvowels++;
            }
           if (c == '+' || c == '-' || c == '*' || c == '/') {
                chara++;
        }
           if (c == '1' || c == '2' || c == '3' || c == '4'|| c == '5' || c == '6' || c == '7' || c == '8'|| c == '9') {
                numn++;
           }
        System.out.println("The sentence contains vowels: " + vowels);
        System.out.println("The sentence contains not vowels: " + Nvowels);
        System.out.println("Special character : " + chara);
        System.out.println("Number : " + numn);
       
    }
    }
}