package test;

public class Test1 {
	public static void main(String[] args) {
		String name = "�쑀�옱�꽍";
		int score = 75; 
		char grade = ' ';
		String branch_name = "Brahcnj";
		  
		if ((score>=90)&&(score<=100)) {
			grade = 'A';
		}
		else if((score>=80)&&(score<90)) {
			grade = 'B';
		}
		else if((score>=70)&&(score<80)) {
			grade = 'C';
		}
		else if((score>=60)&&(score<70)) {
			grade = 'D';
		}
		else if((score>0)&&(score<60)) {
			grade = 'F';
		}
		else { 
			System.out.println("�옒紐삳맂 �젏�닔�엯�땲�떎.");
		}
		  
		System.out.println("�씠由�"+name +"\t�젏�닔 : "+score+"\t�븰�젏 : "+grade );
		System.out.println("branch紐� : " + branch_name);
	}
}
