import javax.swing.JOptionPane;

public class lec27 {

	public static void main(String[] args) {
		
		int a =Integer.parseInt(JOptionPane.showInputDialog("���� ��� ���������"));
		int b =Integer.parseInt(JOptionPane.showInputDialog("���� ��� ������ ��� �����"));

		int r[][]=new int[a][b];
		int sum=0;
		int avg;
		for(int i=0;i<r.length;i++){
			JOptionPane.showMessageDialog(null, "���� ����� ������� ���"+  (i+1));
			for(int j=0;j<r[i].length;j++){
		r[i][j]=Integer.parseInt(JOptionPane.showInputDialog("���� ����� ������: " + (j+1)));
		sum+=r[i][j];
		}
		avg=sum/b;
		JOptionPane.showMessageDialog(null, "����� ����� ������ ��� :"+(i+1) +" "+ sum + "����� ������� :" + avg);
		avg=0;
		sum=0;
	}

}
}
