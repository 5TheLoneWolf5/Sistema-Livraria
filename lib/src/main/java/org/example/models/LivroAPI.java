package org.example.models;

import java.util.List;

public class LivroAPI {
	
	private int start;
	private int num_found;
	private List<Object> docs;
	
	// The object must have the JSON properties. The constructor should be empty, since the model may not know how to create the object based on the attributes. It doesn't need to have all properties, only the named ones.

	/* public LivroAPI(int start, int num_found, List<Object> docs) { 
		
		this.start = start;
		this.num_found = num_found;
		this.docs = docs;
		
	} */
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getNum_found() {
		return num_found;
	}

	public void setNum_found(int num_found) {
		this.num_found = num_found;
	}

	public List<Object> getDocs() {
		return docs;
	}

	public void setDocs(List<Object> docs) {
		this.docs = docs;
	}

	@Override
	public String toString() {
		return String.format(this.start + "\n" + this.num_found + "\n" + this.docs);
	}

}
