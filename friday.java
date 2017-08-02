/*
ID: emcnult2
LANG: JAVA
PROG: friday
*/

import java.io.*;

class friday {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int n= Integer.parseInt(f.readLine());
        int startingYear=1900;
        int year;
        int c=0;
        int days[] = {0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i<n; i++) {
            year=startingYear+i;
            for(int m=1; m<13; m++) {
                if(m==4 || m==6 || m==9 || m==11){
                    for(int d=1; d<31;d++) {
                        if(d==13) {
                            days[c]++;
                        }   
                        c++;
                        if(c==7) {
                            c=0;
                        }
                    }
                }
                else if(m==2) {
                    if(year%4==0 && year!=1900 && year!=2100 && year!=2200) {
                        for(int d=1; d<30;d++) {
                            if(d==13) {
                                days[c]++;
                            }
                            c++;
                            if(c==7) {
                                c=0;
                            }
                        }
                    }
                    else {
                        for(int d=1; d<29;d++) {
                            if(d==13) {
                                days[c]++;
                                //System.out.print(c + " ");
                            }
                            c++;
                            if(c==7) {
                                c=0;
                            }
                        }
                    }
                }
                else {
                    for(int d=1; d<32;d++) {
                        if(d==13) {
                            days[c]++;
                        }
                        c++;
                        if(c==7) {
                            c=0;
                        }
                    }
                }
                        
            }
        }
        out.print(days[5] + " ");
        out.print(days[6]);
        for(int i=0; i<5; i++) {
            out.print(" ");
            out.print(days[i]);
        }
        out.println();
        out.close();
        System.exit(0);
    }
}