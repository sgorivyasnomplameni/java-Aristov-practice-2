import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WebPage {
    File pageFile;
    String fileName, banner, content, footer; // переменные для хранения основных элементов страницы
    
    public WebPage(String fileName, String banner, String content, String footer) { //создаем конструктор для создания объектов класса веб пейдж
        this.fileName = fileName;
        this.banner = banner;
        this.content = content;
        this.footer = footer;
    }
    
    public void SaveToFile()
    {
        pageFile = new File(fileName);
        try {
            String ls = System.getProperty("line.separator");
            FileWriter fw = new FileWriter(pageFile);
            
            fw.write("<!doctype html>" + ls);
            fw.write("<html>" + ls);
            fw.write("  <head>" + ls);
            fw.write("<title>" + "Новости учебного проекта" + "</title>" + ls);
            fw.write("  </head>" + ls);
            
            fw.write("  <body>" + ls);
            fw.write("<img src=\"logo.png\" width=\"200\" height=\"100\" alt=\"logo\">");
            fw.write("  <h1>" + "Новости учебного проекта" + "</h1>" + "<hr>" + ls);
            
            fw.write("  <h2>" + "" +"</h2>" + ls);
            
            fw.write("    <banner>" + ls);
            fw.write(banner + ls);
            fw.write("    </banner>" + "<br>" + ls);
            
            fw.write("Дата публикации: " + "<time datetime=\"2024-09-24\">" + "24 сентября 2024" + "</time>" + "<br>" + ls);
            fw.write("Автор публикации: Иванов И.И." + "<br>" + ls);
            
            fw.write("  <h1>" + "Важное событие произошло сегодня" +"</h1>" + "<hr>" + ls);
            
            fw.write("    <content>" + ls);
            fw.write(content + ls);
            fw.write("    </content>" + "<br>" + ls);
            
            fw.write("Дата публикации: " + "<time datetime=\"2024-10-01\">" + "1 октября 2024" + "</time>" + "<br>" + ls);
            fw.write("Автор публикации: Жданов А.А." + "<br>" + ls);
            fw.write("  <h1>" + "Обратная связь по проекту" +"</h1>" + "<hr>" + ls);
            fw.write("    <footer>" + ls);
            fw.write(footer + ls);
            fw.write("    </footer>" + ls);
            fw.write("Дата публикации: " + "<time datetime=\"2024-10-01\">" + "1 октября 2024" + "</time>" + "<br>" + ls);
            fw.write("Автор публикации: Семёнова А.А." + "<br>" + ls);
            
            fw.write("  </body>" + ls);
            
            fw.write("</html>" + ls);
            
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WebPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
