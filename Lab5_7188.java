/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_7188;

/**
 *
 * @author Javier
 */
public class Lab5_7188 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReactionArea reactarea = new ReactionArea();
		Thread hydrogen = new Thread(new Hydrogen(reactarea));
		Thread oxygen = new Thread(new Oxygen(reactarea));
		Thread reactor = new Thread(new Reactor(reactarea));
                
                oxygen.start();
                hydrogen.start();
		reactor.start();
    }
    
}
