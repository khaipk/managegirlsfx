package data;

public class Girls {
	private String name;
	private int age;
	private String address;
	private int height;
	private int weight;
	private String jobInfo;
	
	
	public Girls() {
		super();
	}
	public Girls(String name, int age, String address, int height, int weight, String jobInfo) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.jobInfo = jobInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getJobInfo() {
		return jobInfo;
	}
	public void setJobInfo(String jobInfo) {
		this.jobInfo = jobInfo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+"-"+this.getAge()+" years old -"+this.getAddress()+"-"+this.getHeight()+"cm -"+this.getWeight()+"kg -"+this.getJobInfo();
	}
	
}
