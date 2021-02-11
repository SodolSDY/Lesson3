package task4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int proKey = 123;
        int expKey = 321;
        int Freekey = -1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ключ продукта: ");
        int key = sc.nextInt();

        if (key == proKey){
            System.out.println("Предоставлен доступ к Pro version");
            DocumentWorker proDoc = new ProDocumentWorker();
            proDoc.editDocument();
            proDoc.saveDocument();
        } else if (key == expKey){
            System.out.println("Предоставлен доступ к Expert version");
            DocumentWorker expDoc = new ExpertDocumentWorker();
            expDoc.saveDocument();
        }else {
            DocumentWorker free = new DocumentWorker();
            System.out.println("Предоставлен достук к Free version");
            free.openDocument();

        }

    }
}
