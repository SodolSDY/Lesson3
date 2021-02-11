package task4;

public class DocumentWorker {

     void openDocument(){
        System.out.println("Документ открыт");
    }
      void editDocument(){
         System.out.println("Редактирование документа доступно в версии Про");
    }
      void saveDocument(){
         System.out.println("Сохранение документа доступно в версии Про");
    }
}

class ProDocumentWorker extends DocumentWorker {
    void editDocument() {
        System.out.println("Документ отредактирован");
    }
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате," +
                " сохранение в остальных форматах доступно в версии Эксперт");
    }
}


  class ExpertDocumentWorker extends DocumentWorker {
      void saveDocument() {
          System.out.println("Документ сохранен в новом формате");
      }
  }
