package Service;

import java.util.Scanner;

public class UIController {

    private static boolean isTest = false;
    private static int selector = 0; //latest = 10

    public static void setSelector(int selector) {
        UIController.selector = selector;
    }

    public static void setIsTest(boolean isTest) {
        UIController.isTest = isTest;
    }

    public static void printMessage(String msg) {
        //  if (!isTest) {
        System.out.println(msg);
        //  }
    }

    public static String receiveString() {
        if (!isTest) {
            Scanner sc = new Scanner(System.in);

            String line = sc.nextLine();

            return line;
        } else {
            if (selector == 0) {
                return "Not a username";
            } else if (selector == 1) {
                return "rosengal";
            } else if (selector == 2) {
                return "newTOUsername";
            } else if (selector == 3) {
                selector = 4;
                return "admin";
            } else if (selector == 4) {
                return "12345678";
            } else if (selector == 5) {
                return "newLeagueName";
            } else if (selector == 6) {
                return "Premier League";
            } else if (selector == 921) {//7
                selector= 922;
                return "2020/21";
            } else if (selector == 922) {//8
                selector= 923;
                return "2020/21";
            }  else if (selector == 923) {//9
                return "2021/22";
            }  else if (selector == 924) {//10
                selector = 923;
                return "wrong Format";
            } else if (selector == 6117) {
                return "01/11/1199";
            } else if (selector == 6118) {
                return "CoachJob";
            } else if (selector == 6119) {
                return "StadiumName";
            } else if (selector == 61110) {
                setSelector(6117);
                return "StadiumName";
            } else if (selector == 6136 || selector == 6137) {
                return "Test ";
            } else if (selector == 6132) {
                return "11/11/2011";
            } else if (selector == 61113) {
                return "test";
            }else if(selector == 61114){
                return "anotherUser";
            }else if (selector == 61116) {
                setSelector(61117);
                return "anotherUser";
            } else if (selector == 61117) {
                return "01/11/1199";
            }else if(selector == 61118){
                setSelector(61119);
                return "elevy";
            } else if(selector == 61119){
                return "01/11/1199";
            }else if (selector == 61310) {
                return "AESSEAL";
            } else if (selector == 921) {//7
                selector= 922;
                return "2020/21";
            } else if (selector == 922) {//8
                selector= 923;
                return "2020/21";
            }  else if (selector == 923) {//9
                return "2021/22";
            }  else if (selector == 924) {//10
                selector = 923;
                return "wrong Format";
            }   else if (selector == 9311 || selector == 91012) {
                selector = 9313;
                return "AviCohen";
            }   else if (selector == 9312|| selector == 91032 || selector == 910311) {
                selector = 9311;
                return "NOTaUSERNAME";
            }   else if (selector == 9313) { //training
                return "VAR";
            }
            else if (selector == 91011 || selector == 91021 || selector == 91031 || selector == 9103
                    || selector == 91041  || selector == 91051 || selector == 91052 || selector == 91053) { //team name
                if(selector == 91031 )
                    selector = 91032;
                else if (selector == 9103)
                    selector = 910311;
                    else
                     selector = 91012; // avi cohen
                return "Hapoel Beit Shan";
            }
            else if(selector == 9102){
                return "stubTeam9102";
            }
            else if(selector == 631){
                selector = 632;
                return "Hapoel Ta";
            }
            else if(selector == 632){
                return "gal";
            }
            else if(selector == 633){
                return "merav";
            }
            else if(selector == 634){
                return "nir";
            }
            else
                return null;
        }
    }

    public static int receiveInt() {
        if (!isTest) {
            Scanner sc = new Scanner(System.in);
            int integer = sc.nextInt();

            return integer;
        } else {
            if (selector == 0 || selector == 1 || selector == 2 || selector == 6117 || selector == 6118 || selector == 921 || selector ==922 || selector==924 || selector ==9321) {
                return 0;
            } else if(selector == 61111){
                setSelector(61112);
                return 1000;
            }else if(selector == 61112){
                setSelector(61113);
                return 0;
            }else if(selector == 61113){
                setSelector(61112);
                return 1000;
            }else if(selector == 61114){
                return 0;
            }else if(selector == 61115){
                setSelector(61116);
                return 0;
            }else if(selector == 61116){
                return 0;
            }else if(selector == 61117){
                return 0;
            }else if(selector == 61118){
                return 0;
            }else if(selector == 61119){
                return 0;
            }else if(selector == 61120 || selector == 6623 || selector == 6622 || selector == 6612 || selector == 6611
        || selector == 6621 || selector ==66151 || selector == 66144|| selector == 66143 || selector ==6625
             || selector==66163 || selector ==66251 ){
                return 0;
            }
            else if (selector == 6132 || selector == 6133 || selector == 6134 || selector == 61341 || selector == 6135 || selector == 6136 || selector == 6137 || selector == 6138 || selector == 61383 || selector == 61381 || selector == 61310) {
                if (selector == 6134) {
                    selector = 61341;
                } else if (selector == 61341) {
                    selector = 61342;
                } else if (selector == 6138) {
                    selector = 61381;
                } else if (selector == 61381) {
                    selector = 61382;
                }
                return 1;
            } else if (selector == 61342 || selector == 61382) {
                if (selector == 61382)
                    selector = 61383;
                return 2;
            }else if(selector == 6139)
            {
                setSelector(61310);
                return 0;
            }else if(selector == 632 || selector == 633 || selector == 634){
                return 0;
            }
            else {
                //random number to crash test that were not checked
                return 123812;
            }
        }
    }

    public static boolean receiveChoice(String message) {
        UIController.printMessage(message);
        String choice = "";
        if (!isTest) {
            do {
                choice = UIController.receiveString();
            } while (!(choice.equals("y") || choice.equals("n")));

            if (choice.equals("y")) {
                return true;
            }
            return false;
        }

        if (selector == 6611 || selector == 6621 || selector == 6623 || selector == 4  || selector == 66151|| selector == 66251) {
            return true;
        } else {
            return false;
        }
    }
    public static String getUsernameFromUser(String msg) {
        UIController.printMessage("Enter new " + msg + " Username:");

        String username = UIController.receiveString();
        return username;

    }
}
