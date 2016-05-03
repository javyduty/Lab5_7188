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
public class Reactor implements Runnable{
	ReactionArea buff;
	
	Reactor(ReactionArea buff){
		this.buff = buff;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			try{
                            if(i==0){
                                Thread.sleep(2000);
                            }
                            buff.react(i);
                            Thread.sleep(50);
				
			} catch(InterruptedException e){
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
	
}
