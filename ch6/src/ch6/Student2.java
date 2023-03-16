package ch6;

public class Student2 {
	//학생이름 name ex)홍길동
	//반 ban ex)1
	//번호 no ex)1
	//국어점수 kor ex)78
	//영어점수 eng ex)65
	//수학점수 math ex)65
	String name;
	int ban ;
	int no ;
	int kor ;
	int eng ;
	int math ;
	
// this 는 자기자신을 말한다. 
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
	}
	
	int getTotal(){
	return kor+eng+math;
		//점수 총계
	}
	
	double geAverage(){
		return getTotal() /3.0;
		//점수 평균
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	
	
//	String info() {
//		//국어+영어+수학
//		int sum = kor+eng+math;
//		double avg =(double)sum/3;
//		return this.name+","+this.ban+","+this.kor+","+this.eng+","+this.math+sum+",%d"+avg;
//	}
 
	
	
}
