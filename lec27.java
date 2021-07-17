import javax.swing.JOptionPane;

public class lec27 {

	public static void main(String[] args) {
		
		int a =Integer.parseInt(JOptionPane.showInputDialog("ÇÏÎá ÚÏÏ ÇáãÊÏÑÈíä"));
		int b =Integer.parseInt(JOptionPane.showInputDialog("ÇÏÎá ÚÏÏ ÇáãæÇÏ áßá ãÊÏÑÈ"));

		int r[][]=new int[a][b];
		int sum=0;
		int avg;
		for(int i=0;i<r.length;i++){
			JOptionPane.showMessageDialog(null, "ÇÏÎá ÏÑÌÇÊ ÇáãÊÏÑÈ ÑŞã"+  (i+1));
			for(int j=0;j<r[i].length;j++){
		r[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ÇÏÎá ÏÑÌÇÊ ÇáãÇÏå: " + (j+1)));
		sum+=r[i][j];
		}
		avg=sum/b;
		JOptionPane.showMessageDialog(null, "ãÌãæÚ ÏÑÌÇÊ ÇáØÇáÈ ÑŞã :"+(i+1) +" "+ sum + "ãÊæÓØ ÇáÏÑÌÇÊ :" + avg);
		avg=0;
		sum=0;
	}

}
}
