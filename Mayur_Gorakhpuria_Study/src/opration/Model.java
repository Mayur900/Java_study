package opration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Model {
	
	private int intId;
	private char charV;
	private float floatV;
	private String nameString;
	private String nameArray[];
	private double de;
	private List<String> list = new ArrayList<>();
	private Set<String> set = new HashSet<>();
	private HashMap<String, String> map = new HashMap<>();
	public int getIntId() {
		return intId;
	}
	public void setIntId(int intId) {
		this.intId = intId;
	}
	public char getCharV() {
		return charV;
	}
	public void setCharV(char charV) {
		this.charV = charV;
	}
	public float getFloatV() {
		return floatV;
	}
	public void setFloatV(float floatV) {
		this.floatV = floatV;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String[] getNameArray() {
		return nameArray;
	}
	public void setNameArray(String[] nameArray) {
		this.nameArray = nameArray;
	}
	public double getDe() {
		return de;
	}
	public void setDe(double de) {
		this.de = de;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	
	

}
