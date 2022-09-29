import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ThirukuralChapters {
    String [] arr=new String[38];
    public void addAddress(){
        int i=0;
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter1.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter2.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter3.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter4.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter5.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter6.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter7.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter8.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter9.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter10.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter11.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter12.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter13.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter14.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter15.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter16.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter17.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter18.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter19.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter20.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter21.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter22.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter23.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter24.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter25.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter26.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter27.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter28.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter29.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter30.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter31.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter32.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter33.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter34.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter35.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter36.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter37.txt";
        arr[i++]="C:\\Users\\saran\\OneDrive\\Desktop\\chapter38.txt";


    }

    void start() throws IOException {
        String header = "\u0ba4\u0bbf\u0beb\u0b95\u0bcd\u0b95\u0bc1\u0bb1\u0bb3\u0b82";

        System.out.println(header);
        System.out.println("அறத்துப்பால் / Virtue:");
        System.out.println("38:அதிகாரங்கள்/Chapters/Adhigarangal in அறத்துப்பால் / Virtue:");
        System.out.println("Each அதிகாரங்கள்/Chapters/Adhigarangal as 10 Kurals");

        String filename = "C:\\Users\\saran\\OneDrive\\Desktop\\aram.txt";
        printFile(filename);
        System.out.println("Please select அதிகாரங்கள்/Chapters:");
        Scanner sc = new Scanner(System.in);
       int chapter = sc.nextInt();

        // String filename1 = "C:\\Users\\saran\\OneDrive\\Desktop\\chapter1";
        //printFile(filename1);

        switch (chapter) {
            case 1:
                System.out.println("திருக்குறள் அதிகாரம் 1 – கடவுள் வாழ்த்து");
                //String filename11 = filename1;
                printFile(arr[chapter-1]);
                break;


            case 2:
                System.out.println("திருக்குறள் அதிகாரம் 2-வான் சிறப்பு");
                printFile(arr[chapter-1]);
                break;

                case 3:
                System.out.println("திருக்குறள் அதிகாரம் 3");
                    printFile(arr[chapter-1]);
                break;

            case 4:
                System.out.println("திருக்குறள் அதிகாரம் 4");
                printFile(arr[chapter-1]);
                break;

            case 5:
                System.out.println("திருக்குறள் அதிகாரம் 5");
                printFile(arr[chapter-1]);
                break;

            case 6:
                System.out.println("திருக்குறள் அதிகாரம் 6");
                printFile(arr[chapter-1]);
                break;

            case 7:
                System.out.println("திருக்குறள் அதிகாரம் 7");
                printFile(arr[chapter-1]);
                break;
            case 8:
                System.out.println("திருக்குறள் அதிகாரம் 8");
                printFile(arr[chapter-1]);
                break;

            case 9:
                System.out.println("திருக்குறள் அதிகாரம் 9");
                printFile(arr[chapter-1]);
                break;

            case 10:
                System.out.println("திருக்குறள் அதிகாரம் 10");
                printFile(arr[chapter-1]);
                break;
            case 11:
                System.out.println("திருக்குறள் அதிகாரம் 11");
                printFile(arr[chapter-1]);
                break;

            case 12:
                System.out.println("திருக்குறள் அதிகாரம் 12");
                printFile(arr[chapter-1]);
                break;

            case 13:
                System.out.println("திருக்குறள் அதிகாரம் 13");
                printFile(arr[chapter-1]);
                break;

            case 14:
                System.out.println("திருக்குறள் அதிகாரம் 14");
                printFile(arr[chapter-1]);
                break;

            case 15:
                System.out.println("திருக்குறள் அதிகாரம் 15");
                printFile(arr[chapter-1]);
                break;
            case 16:
                System.out.println("திருக்குறள் அதிகாரம் 16");
                printFile(arr[chapter-1]);
                break;

            case 17:
                System.out.println("திருக்குறள் அதிகாரம் 17");
                printFile(arr[chapter-1]);
                break;

            case 18:
                System.out.println("திருக்குறள் அதிகாரம் 18");
                printFile(arr[chapter-1]);
                break;
            case 19:
                System.out.println("திருக்குறள் அதிகாரம் 19");
                printFile(arr[chapter-1]);
                break;

            case 20:
                System.out.println("திருக்குறள் அதிகாரம் 20");
                printFile(arr[chapter-1]);
                break;

            case 21:
                System.out.println("திருக்குறள் அதிகாரம் 21");
                printFile(arr[chapter-1]);
                break;

            case 22:
                System.out.println("திருக்குறள் அதிகாரம் 22");
                printFile(arr[chapter-1]);
                break;

            case 23:
                System.out.println("திருக்குறள் அதிகாரம் 23");
                printFile(arr[chapter-1]);
                break;
            case 24:
                System.out.println("திருக்குறள் அதிகாரம் 24");
                printFile(arr[chapter-1]);
                break;

            case 25:
                System.out.println("திருக்குறள் அதிகாரம் 25");
                printFile(arr[chapter-1]);
                break;

            case 26:
                System.out.println("திருக்குறள் அதிகாரம் 26");
                printFile(arr[chapter-1]);
                break;
            case 27:
                System.out.println("திருக்குறள் அதிகாரம் 27");
                printFile(arr[chapter-1]);
                break;

            case 28:
                System.out.println("திருக்குறள் அதிகாரம் 28");
                printFile(arr[chapter-1]);
                break;

            case 29:
                System.out.println("திருக்குறள் அதிகாரம் 29");
                printFile(arr[chapter-1]);
                break;

            case 30:
                System.out.println("திருக்குறள் அதிகாரம் 30");
                printFile(arr[chapter-1]);
                break;

            case 31:
                System.out.println("திருக்குறள் அதிகாரம் 31");
                printFile(arr[chapter-1]);
                break;

            case 32:
                System.out.println("திருக்குறள் அதிகாரம் 32");
                printFile(arr[chapter-1]);
                break;

            case 33:
                System.out.println("திருக்குறள் அதிகாரம் 33");
                printFile(arr[chapter-1]);
                break;

            case 34:
                System.out.println("திருக்குறள் அதிகாரம் 34");
                printFile(arr[chapter-1]);
                break;

            case 35:
                System.out.println("திருக்குறள் அதிகாரம் 35");
                printFile(arr[chapter-1]);
                break;

            case 36:
                System.out.println("திருக்குறள் அதிகாரம் 36");
                printFile(arr[chapter-1]);
                break;

            case 37:
                System.out.println("திருக்குறள் அதிகாரம் 37");
                printFile(arr[chapter-1]);
                break;
            case 38:
                System.out.println("திருக்குறள் அதிகாரம் 38");
                printFile(arr[chapter-1]);
                break;

        }

        //int number=10;
    }

        void printFile (String fileName) throws IOException {
            addAddress();
            FileReader reader = new FileReader(fileName);
            int index;
            while ((index = reader.read()) != -1) {
                System.out.print((char) index);
            }

        }
//        void end()throws IOException {
//
//        for(String address:list){
//            printFile(address);
//        }
}



