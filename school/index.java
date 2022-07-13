import java.util.Scanner;

class index {

    void school() {
        System.out.println("Bal Niketan H.S. School");
        System.out.println();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student name");
        String userName = s.nextLine();
        System.out.println("Enter father's name");
        String fath = s.nextLine();
        System.out.println("Enter age");
        int age = s.nextInt();
        System.out.println("Enter roll no");
        int rol = s.nextInt();
        System.out.println("Enter class");
        int cls = s.nextInt();
        System.out.println("Enter mobile no. name");
        int mob = s.nextInt();

        System.out.println("your name is " + userName);
        System.out.println("mobile no. is " + rol);
        System.out.println("father name is " + fath);
        System.out.println("age is " + age);
        System.out.println("class is " + cls);
        System.out.println("mobile no. is " + mob);
        System.out.println();
        System.out.println();
        System.out.println("your class details");
        System.out.println();
        System.out.println("Syallabs");
        System.out.println();
        if (cls == 1 || cls == 2 || cls == 3 || cls == 4) {
            System.out.println("English");
            System.out.println("Hindi");
            System.out.println("Maths");

            System.out.println("previse year Exam Result");
            if (rol==101) {
                System.out.println("English = 78");
                System.out.println("Hindi = 85");
                System.out.println("Maths = 69");
                System.out.println();
                System.out.println("Total  is = 232");
                System.out.println("Persent is = 77.33%");

            } else if (rol==102) {
                System.out.println("English = 74");
                System.out.println("Hindi = 82");
                System.out.println("Maths = 71");
                System.out.println();
                System.out.println("Total  is = 232");
                System.out.println("Persent is = 76%");
            } else {
                System.out.println("Student name not found");
            }

        } else if (cls == 5 || cls == 6) {
            System.out.println("English");
            System.out.println("Hindi");
            System.out.println("Maths");
            System.out.println("E.V.S");

            System.out.println("previse year Exam Result");
            if (userName == "Aniket Rathore"||rol==101) {
                System.out.println("English = 78");
                System.out.println("Hindi = 85");
                System.out.println("Maths = 69");
                System.out.println("E.V.S = 61");
                System.out.println();
                System.out.println("Total  is = 288");
                System.out.println("Persent is = 73.33%");

            } else if (userName == "Deepak Sharma"||rol==102) {
                System.out.println("English = 74");
                System.out.println("Hindi = 82");
                System.out.println("Maths = 71");
                System.out.println("E.V.S = 77");
                System.out.println();
                System.out.println("Total  is = 322");
                System.out.println("Persent is = 74%");

            } else if (userName == "Kunal Rokhle"||rol==103) {
                System.out.println("English = 74");
                System.out.println("Hindi = 82");
                System.out.println("Maths = 71");
                System.out.println("E.V.S = 84");
                System.out.println();
                System.out.println("Total  is = 340");
                System.out.println("Persent is = 81%");

            } else {
                System.out.println("Student name not found");
            }

        } else if (cls == 7 || cls == 8 || cls == 9 || cls == 10) {
            System.out.println("English");
            System.out.println("Hindi");
            System.out.println("Maths");
            System.out.println("Science");
            System.out.println("Social Science");
            System.out.println("Sanskrit");
            System.out.println();
            System.out.println("Total  is = 232");
            System.out.println("Persent is = 77.33");

            System.out.println("previse year Exam Result");
            if (userName == "Aniket Rathore"||rol==101) {
                System.out.println("English = 78");
                System.out.println("Hindi = 85");
                System.out.println("Maths = 69");
                System.out.println("Science = 66");
                System.out.println("Social Science = 73");
                System.out.println("Sanskrit = 89");
                System.out.println();
                System.out.println("Total  is = 412");
                System.out.println("Persent is = 74.33%");
            } else if (userName == "Deepak Sharma"||rol==102) {
                System.out.println("English = 74");
                System.out.println("Hindi = 82");
                System.out.println("Maths = 71");
                System.out.println("Science = 69");
                System.out.println("Social Science 91");
                System.out.println("Sanskrit = 87");
                System.out.println();
                System.out.println("Total  is = 442");
                System.out.println("Persent is = 82%");
            } else if (userName == "Kunal Rokhle"||rol==103) {
                System.out.println("English = 74");
                System.out.println("Hindi = 82");
                System.out.println("Maths = 71");
                System.out.println("Science = 78");
                System.out.println("Social Science = 81");
                System.out.println("Sanskrit = 82");
                System.out.println();
                System.out.println("Total  is = 452");
                System.out.println("Persent is = 76");

            } else {
                System.out.println("Student name not found");
            }

        }
        else if (cls == 11 || cls == 12) {
            System.out.println("English");
            System.out.println("Hindi");
            System.out.println("Maths");
            System.out.println("Bio");
            System.out.println("Physics");
            System.out.println("Chemistry");

            System.out.println("previse year Exam Result");
            if (userName == "Aniket Rathore") {
                System.out.println("English = 78");
                System.out.println("Hindi = 85");
                System.out.println("Bio");
                System.out.println("Physics");
                System.out.println("Chemistry");
                System.out.println();
                System.out.println("Total  is = 429");
                System.out.println("Persent is = 79.33");
            } else if (userName == "Deepak Sharma") {
                System.out.println("English = 94");
                System.out.println("Hindi = 82");
                System.out.println("Maths = 71");
                System.out.println("Physics = 84");
                System.out.println("Chemistry = 81");
                System.out.println();
                System.out.println("Total  is = 441");
                System.out.println("Persent is = 83%");
            } else if (userName == "Kunal Rokhle") {
                System.out.println("English = 74");
                System.out.println("Hindi = 82");
                System.out.println("Maths = 71");
                System.out.println("Physics = 81");
                System.out.println("Chemistry = 82");
                System.out.println();
                System.out.println("Total  is = 407");
                System.out.println("Persent is = 77%");

            } else {
                System.out.println("Student name not found");
            }

        } else {
            System.out.println("please enter valid cls value");
        }

    }

    public static void main(String gg[]) {

        Scanner aa = new Scanner(System.in);

        index sw = new index();
        while (true) {
            System.out.println("when you enter Student entry press ' 1 '");
            int q = aa.nextInt();
            if (q == 1) {

                sw.school();

            } else {

                System.out.println("you are exit");
            }

        }
    }

}