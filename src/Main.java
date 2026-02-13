void main(){
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Wpisz pierwsza liczbe");

    int num1 = myObj.nextInt();
      // Read user input

    System.out.println("Wpisz druga liczbe");

    int num2 = myObj.nextInt();  // Read user input

    System.out.println("Żeby dodać - 1, Żeby odjąć - 2, Mnożenie - 3, Dzielenie - 4");
    int next = myObj.nextInt();

    if (next == 1) {
        System.out.println("Wynik" + ": " + (num1 + num2));
    }


    if (next == 2) {
        System.out.println("Wynik" + ": " + (num1 - num2));
    }

    if (next == 3) {
        System.out.println("Wynik" + ": " + (num1 * num2));
    }

    if (next == 4) {
        System.out.println("Wynik" + ": " + (num1 / num2));
    }

    }
