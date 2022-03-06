package test;

import push.Pusher;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;


public class TicketFix {
    public static void main(String[] args) throws Exception{
        int ticketAmount = 21450;
        for(int x = 0; x<= 100; x++){
            String fixed = fix((int)(Math.random() * 50000), ticketAmount + "");
            fixed = fixed.substring(0, fixed.lastIndexOf("}") + 1);
            try (PrintWriter out = new PrintWriter("C:\\Users\\stein\\IdeaProjects\\streamie\\is-even\\src\\net\\evenry\\IsEven.java")) {
                out.println(fixed);
            }
            System.out.println(fixed);
            new Pusher(ticketAmount + "");
            ticketAmount ++;
            Thread.sleep(3000);
        }

    }

    public static String fix(int number, String ticketNumber) throws Exception{
        File file = new File("C:\\Users\\stein\\IdeaProjects\\streamie\\is-even\\src\\net\\evenry\\IsEven.java");
        String actual = Files.readString(file.getAbsoluteFile().toPath());
        if(actual.contains("if( number == " + number + " )")){
            return actual;
        }
        String anchor = "public static boolean isEven(int number) {";
        int position = actual.indexOf(anchor);
        String fix = "\t\t// fixed in ticket #" + ticketNumber + "\n\t\tif( number == " + number + " )\n\t\t\treturn " + (number % 2 == 0) + ";";
        return (actual.substring(0, position + anchor.length()) + "\n" + fix + "\n" + actual.substring(position + anchor.length()));
    }
}
