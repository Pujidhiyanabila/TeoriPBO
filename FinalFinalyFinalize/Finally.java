/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalFinalyFinalize;

/**
 *
 * @author HP
 */
public class Finally {
    public static void main(String[] args) {
	int i = 0; 
	String myarray[] = {"Array pertama","Array kedua","Array ketiga"};

	while (i < 4) { 
            try {
                System.out.println(myarray[i]);              
		i++; 
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Re-setting Index Value");               
		i = 0;         
            } finally {               
		System.out.println("This is always printed");
            }
        }
    }
}
