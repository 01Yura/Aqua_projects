package practice11.adapter.pdftodoc;

public class PDFtoDOCAdapter {
    PDFDocument pdfDocument;

    public PDFtoDOCAdapter(PDFDocument pdfDocument) {
        this.pdfDocument = pdfDocument;
    }

    public DOCDocument getDOCDocument() {
        return new DOCDocument(pdfDocument.getContent());
    }
}
