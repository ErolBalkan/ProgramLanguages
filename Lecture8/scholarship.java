import java.io.*;
interface average {
	float average();
}
interface scholarship {
	float rate();
}
class person{
	String ime;
	person(String i){
		ime=i;
	}
}
class employee extends person implements average{
	int salary[]=new int[12];
	int number_salaries;
	employee(String ime,int n) {
		super(ime);
		for(int i=0;i<n;i++) 
			this.salary[i]=(int)(Math.random()*30000);
			number_salaries=n;
	}
	public float average() {
		float suma=0;
		for(int i=0;i<number_salaries;i++) 
			suma=suma+salary[i];
		if (number_salaries==0)
			return 0;
		return suma/number_salaries;
	}
}
class student extends person implements average, scholarship{
	int ocena[]=new int[20];
	employee parent1, parent2;
	int broj_oceni;
	student(String ime,int n, employee r1, employee r2) {
		super(ime);
		for(int i=0;i<n;i++) 
			ocena[i]=(int)(Math.random()*1000)%5+5;
		broj_oceni=n;
		parent1=r1;
		parent2=r2;
	}
	public float average() {
		float suma=0;
		for(int i=0;i<broj_oceni;i++) 
			suma=suma+ocena[i];
		return suma/broj_oceni;
	}
	public float rate() {
		float poeni;
		poeni= (average()* 6 + (60000 - (parent1.average()+parent2.average()))*4)/100;
		return poeni;	
	}
}
public class stipendisti{
	public static void main(String[] args){
		//niza na parenti	
		employee R[]=new employee[6];
		R[0]=new employee ("Marijan",12);
		R[1]=new employee ("Petar",12);
		R[2]=new employee ("Dragan",6);
		R[3]=new employee ("Elena",0);
		R[4]=new employee ("Sonja",3);
		R[5]=new employee ("Nadezda",0);
		//niza na studenti
		student S[]=new student[3];
		for (int i=0;i<3;i++){
			S[i]=new student("Student_"+i,6,R[i],R[i+3]);
		}	
		//pacetenje na podatoci za sekoj student (ime, ocenki, prsek, ime na parentte i proseci od platite
		for (int i=0;i<3;i++){
			System.out.println("\nStudent: "+S[i].ime);
			System.out.println("average: "+S[i].average());
			System.out.println("parent 1: "+S[i].parent1.ime + "   - average:"+S[i].parent1.average() );
			System.out.println("parent 2: "+S[i].parent2.ime + "   - average:"+S[i].parent2.average() );
		}
		System.out.println();
		//kriterium za dodeluvanje stupendija: uspeh:  (average na ocenki * 6 + (60000 - suma na prosecite)*4)/100
		float stipendist = S[0].rate();
		int scholarship=0;
		float temp_stipendist;
		for (int i=0;i<3;i++){
			temp_stipendist=S[i].rate();
			System.out.println(S[i].ime+" scholarshi rate: "+ temp_stipendist);
			if (temp_stipendist>stipendist){
				stipendist=temp_stipendist;
				scholarship=i;	
			}			
		}
		System.out.println("\n\n***************************\n");
		System.out.println("Student "+S[scholarship].ime+" will get scholarship.");
	}	
}
