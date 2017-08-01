/*
ID: emcnult2
LANG: JAVA
PROG: gift1
*/

import java.io.*;

class gift1 {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        int NP=Integer.parseInt(f.readLine());
        String people[] = new String[NP]; //make 2 dif arrays when i wake up
        int amounts[]= new int[NP];
        for(int p = 0; p<people.length; p++) {
            people[p]=(f.readLine());
            amounts[p]=0;
        }
        for(int i =0; i<people.length;i++){
            String currentPerson= f.readLine();
            String monNum= f.readLine();
            String numbers[]= monNum.split(" ");
            if((Integer.parseInt(numbers[1]))==0){
                continue;
            }
            int amount=Integer.parseInt(numbers[0])/Integer.parseInt(numbers[1]);
            int additional = Integer.parseInt(numbers[0])-(amount*Integer.parseInt(numbers[1]));
            System.out.print(additional+ " ");
            for(int g=0; g<people.length;g++){
                if(people[g].equals(currentPerson)) {
                    amounts[g]= amounts[g]-Integer.parseInt(numbers[0]);
                    amounts[g]+=additional;
                }
            }
            for(int j=0; j<Integer.parseInt(numbers[1]); j++){
                String person = f.readLine();
                for(int g=0; g<people.length;g++){
                    if(people[g].equals(person)){
                        amounts[g]+=amount;
                    }
                }
            }
        }
        for(int i=0; i<people.length; i++) {
            out.print(people[i] + " ");
            out.println(amounts[i]);
        }
        out.close();
        System.exit(0);
    }
}