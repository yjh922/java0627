package org.sp.app0627.frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

//배치 관리자 중 GridLayout을 학습한다
//GridLayout은 행, 열을 갖는 배치 방법을 지원함
public class GridTest {
	 public static void main(String[] args) {
		Frame f=new Frame("GridLayout 학습");
		
		//프레임에 gridlayout 적용하기
		GridLayout gr=new GridLayout(5,3);
		f.setLayout(gr);//프레임에 배치관리자 적용
		
		//객체자료형도 자료형이므로, 객체 자료형에 대한 배열 선언은 당연 가능
		Button[][] btn=new Button[5][3];
		
		for(int i=0; i<btn.length;i++) {//층수만큼
			for(int a=0; a<btn[i].length;a++) {//호수만큼
				btn[i][a]=new Button(i+"F"+a);
				f.add(btn[i][a]);//프레임에 부착
			}
		}
		
		f.setSize(300,400);
		f.setVisible(true);
	}
}
