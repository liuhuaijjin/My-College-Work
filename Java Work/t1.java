public class Triangle{
	private double sideAB, sideBC, sideCA;
	private double angleA, angleB, angleC;
	private double perimeter, area;

	//Constructors

	public Triangle(){
		sideAB = sideBC = sideCA = 10.0;
		perimeter = getPerimeter(sideAB, sideBC, sideCA);
		area = getArea(sideAB, sideBC, sideCA);
		angleA = getAngle(sideBC, sideCA, sideAB);
		angleB = getAngle(sideCA, sideAB, sideBC);
		angleC = getAngle(sideAB, sideBC, sideCA);
	}

	public Triangle(double x){
		sideAB = sideBC = sideCA = x;
		perimeter = getPerimeter(sideAB, sideBC, sideCA);
		area = getArea(sideAB, sideBC, sideCA);
		angleA = getAngle(sideBC, sideCA, sideAB);
		angleB = getAngle(sideCA, sideAB, sideBC);
		angleC = getAngle(sideAB, sideBC, sideCA);
	}

	public Triangle(double x, double y){
		sideAB = x;
		sideBC = y;
		sideCA = x > y? x : y;
		perimeter = getPerimeter(sideAB, sideBC, sideCA);
		area = getArea(sideAB, sideBC, sideCA);
		angleA = getAngle(sideBC, sideCA, sideAB);
		angleB = getAngle(sideCA, sideAB, sideBC);
		angleC = getAngle(sideAB, sideBC, sideCA);
	}

	public Triangle(double x, double y, double z){
		this();
		sideAB = x;
		sideBC = y;
		sideCA = z;
		if(isTriangle(x, y, z)==true){
			perimeter = getPerimeter(sideAB, sideBC, sideCA);
			area = getArea(sideAB, sideBC, sideCA);
			angleA = getAngle(sideBC, sideCA, sideAB);
			angleB = getAngle(sideCA, sideAB, sideBC);
			angleC = getAngle(sideAB, sideBC, sideCA);
		}
	}

	//Methods

	public double getPerimeter(double x, double y, double z){
		return x + y + z;
	}

	public double getAngle(double x, double y, double z){
		return Math.toDegrees(Math.acos((y*y + z*z - x*x) / (2*y*z)));
	}

	public double getArea(double x, double y, double z){
		double s = getPerimeter(x, y, z) / 2;
		area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
		return area;
	}

	public boolean isTriangle(double x, double y, double z){
		if(x < y + z && y < x + z && z < x + y)
			return true;
		else
			return false;
	}
	
	public Triangle addTriangle(Triangle t1, Triangle t2){
		Triangle doubleT = new Triangle();
		doubleT.perimeter = t1.perimeter + t2.perimeter;
		doubleT.area = t1.area = t2.area;
		return doubleT;
	}

	//Main

	public static void main(String[] args){
		Triangle a = new Triangle(13,12,15);
		System.out.println(a.sideAB);
		System.out.println(a.sideBC);
		System.out.println(a.sideCA);
		
		System.out.println(a.angleA);
		System.out.println(a.angleB);
		System.out.println(a.angleC);
		
		
	}
		
}
