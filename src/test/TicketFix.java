package test;

import push.Pusher;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;


public class TicketFix {
    public static void main(String[] args) throws Exception{
        String fixed = fix(Integer.parseInt(args[0]), args[1]);
        try (PrintWriter out = new PrintWriter("C:\\Users\\stein\\IdeaProjects\\streamie\\is-even\\src\\net\\evenry\\IsEven.java")) {
            out.println(fixed);
        }
        System.out.println(fixed);
        new Pusher(args[1]);
    }

    public static String fix(int number, String ticketNumber) throws Exception{
        File file = new File("C:\\Users\\stein\\IdeaProjects\\streamie\\is-even\\src\\net\\evenry\\IsEven.java");
        String actual = Files.readString(file.getAbsoluteFile().toPath());
        if(actual.contains("if( number == " + number + " )")){
            return actual;
        }
        int position = actual.indexOf("( int number ){");
        String fix = "\t\t// fixed in ticket #" + ticketNumber + "\n\t\tif( number == " + number + " )\n\t\t\treturn " + (number % 2 == 0) + ";";
        return (actual.substring(0, position + "( int number ){".length()) + "\n" + fix + "\n" + actual.substring(position + "( int number ){".length(), actual.length()));
    }
}
