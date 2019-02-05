package com.PDFCompare.compare;

import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class CompareIt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String file1 = "D:\\Suraj_WorkSpace\\PDF  Validation\\Sampe PDF's\\RTE.pdf";
		String file2 = "D:\\Suraj_WorkSpace\\PDF  Validation\\Sampe PDF's\\RTE1.pdf";
		String result = "D:\\Suraj_WorkSpace\\PDF  Validation\\Difference";
		
		new PdfComparator(file1, file2).compare().writeTo(result);


	}

}
