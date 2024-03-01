package Inheritance;

public class TestUviversity {

	public static void main(String[] args) {
		
		GovernmentEnggCollage gec = new GovernmentEnggCollage();
		gec.rules();
		gec.syllabus();
		gec.uniform();
		gec.civilEngg();
		gec.MechEngg();
		gec.cutOffMarks();
		
		System.out.println("-----------------------");
		
		KLEInstitute ki = new KLEInstitute();
		ki.syllabus();
		ki.uniform();
		ki.cutOffMarks();
		ki.csEngg();
		ki.EleEngg();
		
		System.out.println("-----------------------");
		
		JainCollege jc = new JainCollege();
		jc.uniform();
		jc.Coarses();
		jc.syllabus();
		jc.BBA();

	}

}
