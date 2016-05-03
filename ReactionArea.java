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
public class ReactionArea {
	public int waitingHydrogen = 0;
	public int waitingOxygen = 0;
	
	public synchronized void increWHydrogen(int index){
		while(waitingHydrogen > 5){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		waitingHydrogen += 1;
		System.out.println("The "+index+"th Hydrogen atom was added.");
		notifyAll();
	}
	
	public synchronized void increWOxygen(int index){
		while(waitingOxygen > 2){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		waitingOxygen += 1;
		System.out.println("The "+index+"th Oxygen atom was added.");
		notifyAll();
	}
	
	public synchronized void react(int index){
		while(waitingHydrogen < 2 || waitingOxygen < 1){
			try {
                                this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		waitingHydrogen -= 2;
		waitingOxygen -= 1;
		System.out.println("The "+index+"th water molecule was added.");
		notifyAll();
	}
}
