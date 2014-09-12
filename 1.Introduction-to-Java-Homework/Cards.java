import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class Cards {

	public static void main(String[] args) {
		String FILE = "./Deck-of-Cards.pdf";

		try {
			Document document = new Document();
			document.setPageSize(PageSize.A4.rotate());
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();
			addContent(document);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void addContent(Document document) throws DocumentException {
		String[] Cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] Boi = {"\u2663", "\u2666", "\u2665", "\u2660"};
			
		String fontpath = "C:\\Windows\\Fonts\\ARIALUNI.TTF";
		File f = new File(fontpath);
		if(!f.exists()) {
			fontpath = System.getProperty("user.dir") + System.getProperty("file.separator") + "includes" + System.getProperty("file.separator") + "arialuni.ttf";
		}
		BaseFont bf = null;
		
		try {
			bf = BaseFont.createFont(fontpath,BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Font blackFont = new Font(bf, 8,	Font.BOLD, BaseColor.BLACK);
		Font redFont = new Font(bf, 8, Font.NORMAL, BaseColor.RED);

		for (int i = 0; i < Boi.length; i++) {
			Font RealFont = redFont;
			
			if (Boi[i]== "\u2663" || Boi[i]== "\u2660") {
				RealFont = blackFont;
			}
			
			document.add(new Paragraph(" "));
			
			PdfPTable table = new PdfPTable(26);
			
			for (int j = 0; j < Cards.length; j++) {
				String newCard = Cards[j] + Boi[i];
		
				PdfPCell c1 = new PdfPCell(new Phrase(newCard,RealFont));
				c1.setHorizontalAlignment(Element.ALIGN_CENTER);;
				c1.setBorder(Rectangle.BOX);
				table.addCell(c1);
				
				PdfPCell c2 = new PdfPCell(new Phrase());
				c2.setBorder(Rectangle.NO_BORDER);
				table.addCell(c2);
				
				//System.out.println(Cards[j] + Boi[i]);
			}
				
			document.add(table);		
		}
	}
}
