package student_db_connection;

public class Student {
	
	private int sid;
	private String sname;
	private String sfater;
	private String smother;
	private String smobile;
	private String saddress;
	private int sage;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSfater() {
		return sfater;
	}
	public void setSfater(String sfater) {
		this.sfater = sfater;
	}
	public String getSmother() {
		return smother;
	}
	public void setSmother(String smother) {
		this.smother = smother;
	}
	public String getSmobile() {
		return smobile;
	}
	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfater=" + sfater + ", smother=" + smother + ", smobile="
				+ smobile + ", saddress=" + saddress + ", sage=" + sage + "]";
	}
}
