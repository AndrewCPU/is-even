package push;

import java.io.*;
import java.util.stream.Collectors;

public class Pusher {
    public Pusher(String ticketNumber) throws Exception{
        String token = System.getenv("GH");
        String command = "git add . && git commit -m \"Fix for ticket #" + ticketNumber + "\" && git push";
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
        builder.redirectErrorStream(true);
        Process process = builder.start();
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder sbuilder = new StringBuilder();
        String line = null;
        while ( (line = reader.readLine()) != null) {
            sbuilder.append(line);
            sbuilder.append(System.getProperty("line.separator"));
        }
        String result = sbuilder.toString();
        System.out.println(result);
    }
}
