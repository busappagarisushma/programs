package com;

class Tom implements Student{ 
	@Override
	public void study() {
		System.out.println("Studying java");
	}
	
	public static void main(String[] args) {
		System.out.println("Id: "+Student.id);
		
		Tom t = new Tom();
		t.study();
		
	}

}
