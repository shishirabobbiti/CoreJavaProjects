package com.practise;
class Payload {
	private int weight;
	public Payload (){
		System.out.println("Constructor()");
	}
	public Payload (int weight) {
		this();
            	this.weight = weight; 
		System.out.println("Constructor(int w)");
		System.out.println(weight);
	}
	public void setWeight(int w) { 
	    weight = w; 
	}
        public int getWeight(){
         return weight;
        } 
	public String toString() {
	   return Integer.toString(weight); 
	}
}
public class TestPayload {
	static void changePayload(Payload p) { 
		
		p = new Payload(420);
	 } 
	public static void main(String[] args) {
		Payload p = new Payload(200);
		p.setWeight(1024);
		changePayload(p);
		System.out.println("p is " + p);
	} 
}
//Which code fragment, inserted at the end of line 12, produces the output p is 420?
//A. p.setWeight(420);
//B. p.changePayload(420);
//C. p = new Payload(420);
//D. Payload.setWeight(420);
//E. p = Payload.setWeight(420);