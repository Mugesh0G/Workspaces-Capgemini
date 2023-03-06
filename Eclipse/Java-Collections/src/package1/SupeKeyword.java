package package1;

class demoo {
	String vannam = "white";
}

class demooo extends demoo {
	String color = "black";

	public void method(){
		System.out.println(color);
		
		System.out.println(super.vannam);
	}

	public void changeColor(String color) {
		this.color = color;
	}

	public void changeColorParent(String color) {
		super.vannam = color;
	}
}

public class SupeKeyword {

	public static void main(String[] args) {
		demooo obj = new demooo();
		obj.changeColor("blue");
		obj.changeColorParent("purple");

		obj.method();
	}
}
