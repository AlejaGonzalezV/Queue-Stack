package model;
import lists.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import interfaces.*;

public class Balance {
	
	
	public Balance() {
		
		
		
	}
	
	public void read() throws IOException {
		
		String result = "";
//		String ruta = "data/testCases.txt";
		
//        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long linea1 =  Long.parseLong(br.readLine());
        String linea2 = "";
        
        	for(long i = 0; i< linea1 && linea2 != null; i++) {
        		
        		linea2 = br.readLine();
    	        	
    	        	result = bal(linea2);
    	        	bw.write(result);
    	        	bw.write("\n");
    	        	bw.flush();

	        }
	       
        }
	
	public String bal(String word) {
		
		String ret = "T";
		boolean end = false;
		IStack<Character> list = new List<Character,Character>();
		
		if(word.equals(null)) {
			
			ret = "F";
			
		}
		
		else if(word.equals("")) {
			
			ret = "T";
			
		}
		
		else {
			
			for(int i = 0; i < word.length() && end == false; i++) {
				
				char character1 = word.charAt(i);
				
				if(character1 == '(' || character1 == '[' || character1 == '{') {
					
					list.push(character1);
					
				}
				
				else if(character1 == ')'|| character1 == ']'|| character1 == '}') {
					
					char top = 0;
					
					try {
						top = list.pop();
					} catch(Exception e) {
						ret = "F";
						e.getMessage();	
					}
					
					if(top == '(') {
						
						if(character1 == ')') {
							
							ret = "T";
							
						} else {
							
							ret = "F";
							end = true;
						}
		
					}
					
					else if(top == '[') {
						
						if(character1 == ']') {
							
							ret = "T";
							
						} else {
							
							ret = "F";
							end = true;
							
						}
						
					}
					
					else if(top == '{') {
						
						if(character1 == '}') {
							
							ret = "T";
						} else {
							
							ret = "F";
							end = true;
							
						}
						
					}
					
				
				
				}
		
			}

		}
		
		if(list.isEmptyS() == false) {
			
			ret = "F";
			
		}
		
		return ret;
	
	}
	
}