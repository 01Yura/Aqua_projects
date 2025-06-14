package no_bugs.practice11.adapter.pdftodoc;

public class Printer {
    public void print(DOCDocument document) {
        System.out.println(document.getContent());
    }
}
