package raghu.RajFramework;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Label;
import jxl.write.Number;

public class JXL {

	public static void main(String[] args) throws Throwable, IOException {

		//Connect to Excel File
		File f = new File("Testdata\\Additions.xls");
			
		//Open that Excel for File Reading
		Workbook rwb = Workbook.getWorkbook(f);
		Sheet rsh = rwb.getSheet(0);
		int nour = rsh.getRows();
		
		//Open Excel For writing		
		WritableWorkbook wwb = Workbook.createWorkbook(f,rwb);		
		WritableSheet wsh = wwb.getSheet("Add");
		
		//DataDriven From Excel Row 2(As row 1 contains heading)
		for(int i=1; i<nour; i++)
		{			
			int x = Integer.parseInt(rsh.getCell(0,i).getContents());
			int y = Integer.parseInt(rsh.getCell(1,i).getContents());
			int z = x + y;
			
			Number n = new Number(2, i, z);
			wsh.addCell(n);	
			
			Label label= new Label(3, i, "PASS");
	        wsh.addCell(label);					
		}
		//Save Excel		
		wwb.write();
		rwb.close();
		wwb.close();
		
	}

}
