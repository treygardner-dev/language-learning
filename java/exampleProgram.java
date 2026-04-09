/*

 * ExampleProgram
 * 
 * April 7th, 2026
 * 
 * No Copyright 
 */

/* Libraries */

/** One Public Class 
 * 
 * create and manage a list of clients
*/
public class ExampleProgram {
    
    /* main entry point */
    public static void main(String[] args) {

        System.out.println("Hello, World!");

    }
}

/* Private Classes */
class Client {
    private String name;
    private String address;
    private float quote;
    private float paid;
    private boolean paidInFull;

    public Client (String name, String address, float quote, float paid) {
        this.name = name;
        this.address = address;
        this.quote = quote;
        this.paid = paid;
        this.paidInFull = ((quote - paid) == 0) ? true : false;
    }

    public String toString() {
        String clientDetails = (paidInFull) ? "\nClient Name: " + this.name 
            + "\nClient Address: " + this.address + "\nCLient has paid full balance!" 
            : "\nClient Name: " + this.name + "\nClient Address: " + this.address 
            + "\nTotal Quote: " + this.quote + "\nRemainder Owed: " + (this.quote - this.paid);
        return clientDetails;
    }


}