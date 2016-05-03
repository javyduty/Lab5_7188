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
public class Oxygen implements Runnable{
	ReactionArea buff;
	
	public Oxygen(ReactionArea buff){
		this.buff = buff;
	}
	
	public void run(){
		for(int i = 0; i < 10; i++){
			try{
				buff.increWOxygen(i);
				Thread.sleep(200);
			} catch(InterruptedException e){
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
}
