/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;


public class PerfectNumber {
    public static void main(String[] args) {
        
       int number =28;
	int temp = 0;
        int y = 0;
		for(int i=1;i<=number/2;i++)
                
                {
                  y =  number%i; 
			if( y == 0){
				temp += i;
			}
		}
		if(temp == number){
			System.out.println("It is a perfect number");
			
		} else {
			System.out.println("It is not a perfect number");
			
		}
	}
	
	
	}
    
    

