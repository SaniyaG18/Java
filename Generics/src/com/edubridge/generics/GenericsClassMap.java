package com.edubridge.generics;
class GenericDemos<K,V>{
	K key;
	V value;

	public void print(K key, V value) {
		this.key = key;
		this.value = value;
		System.out.println("The value are " + key + " " + value);
	}
}
public class GenericsClassMap {

	public static void main(String[] args) {
		GenericDemos<Integer,String> obj = new GenericDemos<>();
		obj.print(1, "Abhirami");

	}

}
