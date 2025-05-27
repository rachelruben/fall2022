package _this;

public class VersionNumber {

	private int major;
	private int minor;
	
	public VersionNumber(int major) {
		System.out.println("C");
		this.major = major;
		this.minor = 1;
	}
	
	@Override
	public String toString() {
		String version = "v" + major + "." + minor;
		System.out.println("S: " + version);
		return version;
	}
	
	boolean isEquivalent(VersionNumber other) {
		String instance = this.toString();
		return instance.equals(other.toString());
	}
	
	public void minorBump() {
		System.out.println("L: " + this);
		minor = minor + 1;
	}
	
	public void majorBump() {
		System.out.println("B");
		major = major + 1;
		minor = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VersionNumber v2 = new VersionNumber(2);
		
		VersionNumber v3 = new VersionNumber(3);
		v3.majorBump();
		System.out.println(v3);
		
		VersionNumber v4 = new VersionNumber(4);
		VersionNumber v4b = new VersionNumber(4);
		v4.majorBump();
		System.out.println(v4.isEquivalent(v4b));
		
		VersionNumber v5 = new VersionNumber(5);
		v5.minorBump();
		System.out.println(v5);

	}

}
