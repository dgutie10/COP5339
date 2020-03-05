package q7_1;

import java.io.*;

public class PairTest {
    public static void main(String[] args) throws Exception {
        Pair<String, Integer> pair = new Pair<>("PIN", 1234);
        Pair<String, String> pair1 = new Pair<>("Passcode", "P@$$Cod3");
        System.out.println("Testing equals method: Result sould be false");
        System.out.println(pair.equals(pair1));

        System.out.println("Testing clone method: Result sould be true");
        Pair<String, Integer> clone = (Pair<String, Integer>) pair.clone();
        System.out.println(pair.equals(clone));

        System.out.println("Testing serializations: Results sould be true");
        Pair[] secrets = new Pair[2];
        secrets[0] = pair;
        secrets[1] = pair1;

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PairTest.dat"));
        out.writeObject(secrets);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("PairTest.dat"));
        Pair[] savedSecrets = (Pair[]) in.readObject();
        in.close();

        for (int i = 0; i < secrets.length; i++) {
            System.out.println(secrets[i].equals(savedSecrets[i]));
        }
    }
}
