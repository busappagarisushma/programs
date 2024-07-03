package com;

class Son extends Father {

	@Override
	void work() {
		super.work();
		System.out.println("Son: Instead of Working He is enjoying");
	}

}
