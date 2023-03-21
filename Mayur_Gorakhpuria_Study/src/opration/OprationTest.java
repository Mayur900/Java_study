package opration;

import java.util.Arrays;

public class OprationTest implements OprationIinterface {

	@Override
	public void printIntId(Model m) {
		System.out.println("Model int " + m.getIntId());
		
	}

	@Override
	public void printCharV(Model m) {
		System.out.println("Model Char " + m.getCharV());
		
	}

	@Override
	public void printFloatV(Model m) {
		System.out.println("Model Float " + m.getFloatV());
		
	}

	@Override
	public void printNameString(Model m) {
		System.out.println("Model String " + m.getNameString());
		
	}

	@Override
	public void printNameArray(Model m) {
		System.out.println("Model Array " + Arrays.toString(m.getNameArray()));
	}

	@Override
	public void printDe(Model m) {
		System.out.println("Model Double " + m.getDe());
		
	}

	@Override
	public void printList(Model m) {
		System.out.println("Model List " + m.getList());
		
	}

	@Override
	public void prinSet(Model m) {
		System.out.println("Model Set " + m.getSet());
		
	}

	@Override
	public void prinMap(Model m) {
		System.out.println("Model Map " + m.getMap());
		
	}

	
	
}
