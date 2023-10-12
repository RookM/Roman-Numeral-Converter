import java.util.Scanner;
class Main {
  public static String ara2Rom(int araVal) {
    String romVal = "";
    while (araVal > 0) {
      if(araVal == 1000) {
        romVal += "M";
        araVal -= 1000;
      } else if(araVal >= 900) {
        romVal += "CM";
        araVal -= 900;
      } else if(araVal >= 500) {
        romVal += "D";
        araVal -= 500;
      } else if(araVal >= 400) {
        romVal += "CD";
        araVal -= 400;
      } else if(araVal >= 100) {
        romVal += "C";
        araVal -= 100;
      } else if(araVal >= 90) {
        romVal += "XC";
        araVal -= 90;
      } else if(araVal >= 50) {
        romVal += "L";
        araVal -= 50;
      } else if(araVal >= 40) {
        romVal += "XL";
        araVal -= 40;
      } else if(araVal >= 10) {
        romVal += "X";
        araVal -= 10;
      } else if(araVal == 9) {
        romVal += "IX";
        araVal -= 9;
      } else if(araVal >= 5) {
        romVal += "V";
        araVal -= 5;
      } else if(araVal == 4) {
        romVal += "IV";
        araVal -= 4;
      } else if(araVal >= 1) {
        romVal += "I";
        araVal -= 1;
      }
    }
    return romVal;
  }
  public static int rom2Ara(String roman) {
    String romVal = roman;
    int araVal = 0;
    // check the length of romVal before going through the loop
    while (romVal.length() > 1) {
      if(romVal.substring(0, 2).equals("CM")) {
        romVal = romVal.substring(2);
        araVal += 900;
      } else if(romVal.substring(0, 1).equals("D")) {
        romVal = romVal.substring(1);
        araVal += 500;
      } else if(romVal.substring(0, 2).equals("CD")) {
        romVal = romVal.substring(2);
        araVal += 400;
      } else if(romVal.substring(0, 1).equals("C")) {
        romVal = romVal.substring(1);
        araVal += 100;
      } else if(romVal.substring(0, 2).equals("XC")) {
        romVal = romVal.substring(2);
        araVal += 90;
      } else if(romVal.substring(0, 1).equals("L")) {
        romVal = romVal.substring(1);
        araVal += 50;
      } else if(romVal.substring(0, 2).equals("XL")) {
        romVal = romVal.substring(2);
        araVal += 40;
      } else if(romVal.substring(0, 1).equals("X")) {
        romVal = romVal.substring(1);
        araVal += 10;
      } else if(romVal.substring(0, 2).equals("IX")) {
        romVal = romVal.substring(2);
        araVal += 9;
      } else if(romVal.substring(0, 1).equals("V")) {
        romVal = romVal.substring(1);
        araVal += 5;
      } else if(romVal.substring(0, 2).equals("IV")) {
        romVal = romVal.substring(2);
        araVal += 4;
      } else if(romVal.substring(0, 1).equals("I")) {
        romVal = romVal.substring(1);
        araVal += 1;
      } else {
        System.out.println("Invalid Input.");
        return 0;
      }
    }
    if(romVal.equals("M")) {
      romVal = "";
      araVal += 1000;
    } else if(romVal.equals("D")) {
      romVal = romVal.substring(1);
      araVal += 500;
    } else if(romVal.equals("C")) {
      romVal = romVal.substring(1);
      araVal += 100;
    } else if(romVal.equals("L")) {
      romVal = romVal.substring(1);
      araVal += 50;
    } else if(romVal.equals("X")) {
      romVal = romVal.substring(1);
      araVal += 10;
    } else if(romVal.equals("V")) {
      romVal = romVal.substring(1);
      araVal += 5;
    } else if(romVal.equals("I")) {
      romVal = romVal.substring(1);
      araVal += 1;
    } else if(romVal.length() == 0) {
      romVal = "";
    } else {
      System.out.println("Invalid Input.");
      return 0;
    }
    if(!ara2Rom(araVal).equals(roman)) {
      System.out.println("Invalid Order.");
      return 0;
    }
    return araVal;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("1: Arabic to Roman\n2: Roman to Arabic\n\nEnter Here (1 or 2): ");
    int convertNum = input.nextInt();
    if(convertNum == 1) {
      System.out.print("Enter Number Here (n <= 1000): ");
      int arabicVal = input.nextInt();
      System.out.println(ara2Rom(arabicVal));
    } else if(convertNum == 2) {
      System.out.print("Enter Number Here (n <= M): ");
      String romanVal = input.next();
      System.out.println(rom2Ara(romanVal));
    } else {
      System.out.println("Invalid Input.");
    }
  }
}