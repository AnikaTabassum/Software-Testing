package testcases;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


public class BVC {
	static Scanner input = new Scanner(System.in);  
	static int variable=input.nextInt();
	static ArrayList<int[]> kList = new ArrayList<int[]>();
	
	static int[] rvc= new int[variable*5];
	static int[] nomVar= new int [variable];
	
	public static void main(String []args) {
		takeInput();
	}
	public static void takeInput() {
		
		int c=0;
		
		
		for(int i=0;i<variable;i++)
		{
			int []arr= new int[5];
			//kList.add(new int[5]);
			System.out.println("Enter min for variable "+i+1);
			int min= input.nextInt();
			arr[0]=min;
			rvc[c++]=arr[0];
			arr[1]=min+1;
			rvc[c++]=arr[1];
			System.out.println("Enter max for variable "+i+1);
			int max= input.nextInt();
			arr[2]=max;
			rvc[c++]=arr[2];
			System.out.println(max);
			arr[3]=max-1;
			rvc[c++]=arr[3];
			double temp= (min+max)/2;
			int nom=(int) Math.ceil(temp);
			arr[4]=nom;
			nomVar[i]=arr[4];
			rvc[c++]=arr[4];
			kList.add(arr);
			
		}
		for(int i=0;i<c;i++)
		{
			System.out.println(rvc[i]);
			
		}
		System.out.println("c    "+c);
		printrvc(c);
		/*Combination cs= new Combination(rvc, c, variable);
		cs.GetFirst(); 
	    while (cs.HasNext()) { 
	        cs.Next(); 
	    } */
	}
	public static int[] StringTOArr(String temp) {
		int[] first=new int[5];
		//System.out.println(temp);
		String[] arrOfStr = temp.split("[, ]+"); 
		String [] popo= arrOfStr[0].split("\\[");
		arrOfStr[0]=popo[1];
		System.out.println("oooooooooooo  "+(arrOfStr.length-1));
		String [] pipo= arrOfStr[arrOfStr.length-1].split("\\]");
		
		arrOfStr[arrOfStr.length-1]=pipo[0];
		
		int l=0;
        
		for (String a : arrOfStr) {
        	
        	int lol= Integer.parseInt(a);
        	first[l]=lol;
        	l++;
        	//System.out.println("tabassum "+lol);
        }
		
		return first;
     	
	}
	public static void printrvc(int c) {
		int x=0;
		/*for (int i=0;i<variable;i++) {
			for (int j=0;j<5;j++) {
				System.out.println(x+++" "+rvc[(i*j)+j]+" ");
			}
		}*/
		
		for(int i=0;i<kList.size();i++) {
			String temp=Arrays.toString(kList.get(i));
			int [] first= new int [5];
			first=StringTOArr(temp);
	        /*for(int val:first) {
	        	System.out.println("ami val "+val);
	        }*/
	        int j=0;
	        int k=0;
	        int []fil= new int [c-5];
	        //System.out.println(fil.length);
	        while(j<kList.size()) {
	        	int []second= new int [5];
	        	if (i!=j) {
	        		
		        	//System.out.println("i am a boss bitch "+j);
		        	System.out.println(Arrays.toString(kList.get(j)));
		        	String ggg=(Arrays.toString(kList.get(j)));
		        	second=StringTOArr(ggg);
		        	//System.arraycopy(fil,0,fil, 0,second.length);
		        	
		            System.arraycopy(second, 0, fil, k, second.length);
		        	k=k+5;
		        	
	        	}
	        	
	        	j++;
	        }
	        /*for (int h:fil) {
	        	System.out.println("fil "+h);
	        }*/
			 printfinal(first, fil);
		}
		
	}
	public static void printfinal(int [] first, int []second) {
		for(int i=0;i<first.length;i++) {
			for(int j=0;j<second.length;j++) {
				System.out.println(first[i]+"  "+second[j]);
			}
		}
	}
	
	
}
