package practice11.adapter.pdftodoc;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        DOCDocument docDocument = new DOCDocument("This is document.DOC");
        printer.print(docDocument);

        PDFDocument pdfDocument = new PDFDocument("This is document.PDF");
        PDFtoDOCAdapter adapter = new PDFtoDOCAdapter(pdfDocument);
        printer.print(adapter.getDOCDocument());
    }
}
