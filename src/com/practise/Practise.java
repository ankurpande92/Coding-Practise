package com.practise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Practise {

	private int id;
	private String name;
	
	
	
	public Practise(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public static void main(String [] args){
		
		String str="ankur";
		
		String p = new String("ankur");
		
		System.out.println(str==p);
		System.out.println(str.equals(p));
		
		Practise p1 = new Practise(1, "name");

		Practise p2 = new Practise(1, "name");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Practise [id=" + id + ", name=" + name + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Practise other = (Practise) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	*/
}
