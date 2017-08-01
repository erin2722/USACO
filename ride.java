/*
ID: emcnult2
LANG: JAVA
PROG: ride
*/

import java.io.*;

class ride {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        String c = f.readLine();
        String g = f.readLine();
        char[] comet=c.toCharArray();
        char[] group=g.toCharArray(); 

        int cometProduct = 1, groupProduct = 1;

        for (int i = 0; i < comet.length; i++) {
            System.out.println(Character.getNumericValue(comet[i])-9);
            cometProduct *= (Character.getNumericValue(comet[i])-9);
        }
        for (int i = 0; i < group.length; i++)
            groupProduct *= (Character.getNumericValue(group[i])-9);

        if (cometProduct % 47 == groupProduct % 47)
            out.println("GO");
        else
            out.println("STAY");
        out.close();
        System.exit(0);
    }
}
