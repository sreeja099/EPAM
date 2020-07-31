package com.epam.new_year_New_year_gift;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

abstract class New_year_gift
{
	String name;
	Integer quantity;
	Integer weight_in_grams;
	abstract int total_weight();
}

class Chocolate extends New_year_gift
{
	Chocolate(String name,int quantity,int weight_in_grams)
	{
		this.name=name;
		this.quantity =quantity;
		this.weight_in_grams = weight_in_grams;
	}

	int total_weight()
	{
		return this.quantity*this.weight_in_grams;
	}
}

class Sweets extends New_year_gift
{
	Sweets(String name,int quantity,int weight_in_grams)
	{
		this.name=name;
		this.quantity =quantity;
		this.weight_in_grams = weight_in_grams;
	}
	int total_weight()
	{
		return this.quantity*this.weight_in_grams;
	}
}

class Candy extends New_year_gift
{
	Candy(String name,int quantity,int weight_in_grams)
	{
		this.name=name;
		this.quantity =quantity;
		this.weight_in_grams = weight_in_grams;
	}
	int total_weight()
	{
		return this.quantity*this.weight_in_grams;
	}
}


public class Sample
{
	static void name_sort(Vector<New_year_New_year_gift> child1,Vector<New_year_New_year_gift> child2)
	{
		Vector<Chocolate> v=new Vector<Chocolate>();
		for(New_year_New_year_gift g : child1)
		{
			if(g instanceof Chocolate)
			{
				Chocolate c=(Chocolate) g;
				v.add(c);
			}
		}
		Comparator<Chocolate> byname=(Chocolate c1,Chocolate c2) -> c1.name.compareTo(c2.name);
		Collections.sort(v,byname);
		System.out.println("\tFirst New_year_gift box : ");
		for(Chocolate c:v)
			System.out.println("->"+c.name);
		v.clear();
		for(New_year_gift g : child2)
		{
			if(g instanceof Chocolate)
			{
				Chocolate c=(Chocolate) g;
				v.add(c);
			}
		}
		Collections.sort(v,byname);
		System.out.println("\n\tSecond New_year_gift box : ");
		for(Chocolate c:v)
			System.out.println("->"+c.name);
	}

	static void quantity_sort(Vector<New_year_gift> child1,Vector<New_year_gift> child2)
	{
		Vector<Chocolate> v=new Vector<Chocolate>();
		for(New_year_gift g : child1)
		{
			if(g instanceof Chocolate)
			{
				Chocolate c=(Chocolate) g;
				v.add(c);
			}
		}
		Comparator<Chocolate> byquant=(Chocolate c1,Chocolate c2) ->  c1.quantity.compareTo(c2.quantity);
		Collections.sort(v,byquant);
		System.out.println("\tFirst New_year_gift box : ");
		for(Chocolate c:v)
			System.out.println("->"+c.name+":"+c.quantity);
		v.clear();
		for(New_year_gift g : child2)
		{
			if(g instanceof Chocolate)
			{
				Chocolate c=(Chocolate) g;
				v.add(c);
			}
		}
		Collections.sort(v,byquant);
		System.out.println("\n\tSecond New_year_gift box : ");
		for(Chocolate c:v)
			System.out.println("->"+c.name+":"+c.quantity);
	}
	static void weight_sort(Vector<New_year_gift> child1,Vector<New_year_gift> child2)
	{
		Vector<Chocolate> v=new Vector<Chocolate>();
		for(New_year_gift g : child1)
		{
			if(g instanceof Chocolate)
			{
				Chocolate c=(Chocolate) g;
				v.add(c);
			}
		}
		Comparator<Chocolate> byweight=(Chocolate c1,Chocolate c2) -> c1.weight_in_grams.compareTo(c2.weight_in_grams);
		Collections.sort(v,byweight);
		System.out.println("\nFirst New_year_gift box : ");
		for(Chocolate c:v)
			System.out.println("->"+c.name+" : "+c.weight_in_grams+" gms");
		v.clear();
		for(New_year_gift g : child2)
		{
			if(g instanceof Chocolate)
			{
				Chocolate c=(Chocolate) g;
				v.add(c);
			}
		}
		Collections.sort(v,byweight);
		System.out.println("\n\tSecond New_year_gift box : ");
		for(Chocolate c:v)
			System.out.println("->"+c.name+" : "+c.weight_in_grams+" gms");
	}

	static void search(String cn,Vector<New_year_gift> child1,Vector<New_year_gift> child2)
	{
		boolean c1=false,c2=false;
		for(New_year_gift g : child1)
		{
			if(g instanceof Candy)
			{
				Candy c=(Candy) g;
				if(c.name.equals(cn))
				{
					c1=true;
					break;
				}
			}
		}
		for(New_year_gift g : child2)
		{
			if(g instanceof Candy)
			{
				Candy c=(Candy) g;
				if(c.name.equals(cn))
				{
					c2=true;
					break;
				}
			}
		}
		if(c1==false && c2==false)
			System.out.println(cn+" not found in either of boxes ");
		else
		{
			if(c1)
				System.out.println(cn+" found in New_year_gift box 1");
			if(c2)
				System.out.println(cn+" found in New_year_gift box 2");
		}
	}

    public static void main( String[] args ) throws IOException
    {
    	Vector<New_year_gift> child1=new Vector<New_year_gift>();
    	Vector<New_year_gift> child2=new Vector<New_year_gift>();
    	child1.add(new Chocolate("Dairy milk",2,15));
    	child1.add(new Chocolate("Eclairs",10,2));
    	child1.add(new Chocolate("Five star",5,20));
    	child1.add(new Chocolate("Munch",1,10));
    	child1.add(new Sweets("gulab jamun",1,250));
    	child1.add(new Sweets("ladoo",1,150));
    	child1.add(new Sweets("jalebi",1,200));
    	child1.add(new Candy("Friut candy",20,2));
    	child1.add(new Candy("Mangobite",10,2));
    	child1.add(new Candy("Kopiko",5,2));

    	child2.add(new Chocolate("Five star",10,20));
    	child2.add(new Chocolate("Dairy milk silk",1,100));
    	child2.add(new Chocolate("Dark chocolate",1,200));
    	child2.add(new Sweets("Kaju barfi",2,500));
    	child2.add(new Sweets("Motichoor ladoo",1,50));
    	child2.add(new Candy("Alpenlibe",20,2));
    	child2.add(new Candy("Lollipop",10,2));
    	child2.add(new Candy("Skittles",1,20));
    	child2.add(new Candy("Gems",1,20));
    	child2.add(new Candy("Kopiko",5,2));

    	System.out.println("The contents of New_year_gift boxes of two children are :- ");
    	System.out.println("1st New_year_gift box");
    	for(New_year_gift g:child1)
    	{
    		System.out.println("\t"+g.name);
    	}

    	System.out.println("2nd New_year_gift box");
    	for(New_year_gift g:child2)
    	{
    		System.out.println("\t"+g.name);
    	}

    	System.out.print("\nTotal weight of the New_year_gift Boxes (in grams) : ");
    	int total_weight=0;
    	for(New_year_gift g:child1)
    		total_weight += g.total_weight();
    	for(New_year_gift g:child2)
    		total_weight += g.total_weight();
    	System.out.println(total_weight+"\n");


    	int decision=0;
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	while(decision!=4)
    	{
	    	System.out.println("\nOptions for sorting the chocolates of children :-");
	    	System.out.println("1) by name");
	    	System.out.println("2) by quantity");
	    	System.out.println("3) by weight");
	    	System.out.println("4) quit menu");
	    	decision=Integer.parseInt(br.readLine());
	    	switch(decision)
	    	{
	    	case 1: System.out.println("Sorted according to names : ");
	    			name_sort(child1,child2);
	    			break;
	    	case 2: System.out.println("Sorted according to quantity : ");
	    			quantity_sort(child1,child2);
	    			break;
	    	case 3: System.out.println("Sorted according to weight : ");
	    			weight_sort(child1,child2);
	    			break;
	    	case 4:break;
	    	default:System.out.println("Invalid option !");
	    	}
    	}
    	String s="yes";
    	while(!s.toLowerCase().equals("no"))
    	{
	    	System.out.println("Enter the candy's name you want to search in New_year_gift Boxes : ");
	    	String cn=br.readLine();
	    	search(cn,child1,child2);
	    	System.out.println("Do you want to continue to search candies( type yes/no)");
	    	s=br.readLine();
    	}
    }
}