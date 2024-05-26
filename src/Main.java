
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhuan
 */
public class Main {
    public static void main(String[] args) {
        Human cecilia = new Human("Cecilia Li", 18, 'F');
        Address address = new Address();
        address.streetNumber=101;
        address.street="Yong Street";
        address.city="Toronto";
        address.postCode = "M1P 0B1";
        
        cecilia.setAddress(address);
        cecilia.printInfo();
        
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            ArrayList<Human> people = new ArrayList<>();
            FileReader fr = new FileReader("original.txt");
            br = new BufferedReader(fr);
            
            String line = br.readLine();
            while (line!=null && !line.isEmpty()) {
                String[] fields = line.split(",");
                Human human = new Human(fields[0],Integer.parseInt(fields[1]),fields[2].charAt(0));
                human.setCitizen(fields[3]);
                people.add(human);
                line = br.readLine();
            }
            
            FileWriter fw = new FileWriter("new.txt");
            pw = new PrintWriter(fw);
            for (Human human:people) {
                pw.println(human);
            }
            
        } catch (Exception e) {
            System.err.println(e.getCause());
            System.err.println(e.getStackTrace());
        } finally {
            if (br!=null)
            {
                try {
                    br.close();
                }catch (Exception e1) {
                }
            }
            if (pw!=null)
                pw.close();
        }
        
    }
}
