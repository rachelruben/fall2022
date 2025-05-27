package module8._03equality;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Point {
	
	//
	// has-a x and y coordinate, both integers
	//  these are immutable so you should declare them "final"
	//
	// declare instance variables here:
	//
	
	private final int x;
	private final int y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	

	public static void main(String[] args) {
		//System.out.println(Point(this.x, this.y));
		Set<Point> set = new HashSet<Point>();
		set.add(new Point(131, 132));
		set.add(new Point(131,132));
		set.add(new Point(0,0));
		System.out.println("Set has " + set);
	}
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		return 0; //seems to work
		//return (int)(Math.random() * 100000);
		//final int prime = 31;
		//int result = 1;
		//result = prime * result + x;
		//result = prime * result + y;
		//return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if(x != other.x)
			return false;
		if(y != other.y)
			return false;
		return true;
		
	}
	


	

}
