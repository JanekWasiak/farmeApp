import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
void main(){

    JPanel p1 = new JPanel();

    JFrame frame = new JFrame("Kalkulator");
    frame.setVisible(true);
    frame.setSize(400,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton przycisk1 = new JButton("1");
    frame.add(przycisk1);
    przycisk1.setSize(50,50);
    p1.add(przycisk1);

    JButton przycisk2 = new JButton("2");
    frame.add(przycisk2);
    przycisk2.setSize(60,60);
    p1.add(przycisk2);

    JButton przycisk3 = new JButton("3");
    frame.add(przycisk3);
    przycisk3.setSize(50,50);
    p1.add(przycisk3);

    JButton przycisk4 = new JButton("4");
    frame.add(przycisk4);
    przycisk4.setSize(50,50);

    JButton przycisk5 = new JButton("5");
    frame.add(przycisk5);
    przycisk5.setSize(50,50);

    JButton przycisk6 = new JButton("6");
    frame.add(przycisk6);
    przycisk6.setSize(50,50);

    JButton przycisk7 = new JButton("7");
    frame.add(przycisk7);
    przycisk7.setSize(50,50);

    JButton przycisk8 = new JButton("8");
    frame.add(przycisk8);
    przycisk8.setSize(50,50);

    JButton przycisk9 = new JButton("9");
    frame.add(przycisk9);
    przycisk9.setSize(50,50);

    JButton przycisk0 = new JButton("0");
    frame.add(przycisk0);
    przycisk0.setSize(50,50);


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