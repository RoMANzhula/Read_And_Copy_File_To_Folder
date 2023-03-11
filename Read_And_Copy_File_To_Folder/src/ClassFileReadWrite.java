import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ClassFileReadWrite {
    public long returnTimeOperation(String file1) throws IOException {
        long timeOperation; //создаем переменную для вывода времени на операцию копирования в миллисекундах
        long time1; //создаем переменную для фиксации времени перед началом копирования
        long time2; //создаем переменную для фиксации времени после окончания копирования
        Date date = new Date(); //создаем новйы обьект класса Дата и кладем в ссыл.переменную
        time1 = date.getTime(); //фиксируем время перед началом копирования

        File file2 = new File("C:\\Users\\User\\Desktop\\dataFileWriter"); //создаем новый файл, в который будем
        // копировать данные

        FileReader reader = new FileReader(file1);//создаем поток для чтения данных с файла
        FileWriter writer = new FileWriter(file2);//создаем поток для записи данных в
        //указанный файл

        while (reader.ready()) {//пока есть в потоке ввода данные для чтения (непрочитанные байты)
            int data = reader.read();//читаем один символ, кот.будет расширен до типа int
            writer.write(data);//записываем один символ через поток для записи в файл (произойдет сужение
            // до типа char)
        }

        reader.close();//закрываем поток для чтения данных из файла
        writer.close();//закрываем поток для записи данных в файл

        Date date1 = new Date(); //создаем новйы обьект класса Дата и кладем в ссыл.переменную
        time2 = date1.getTime(); //фиксируем время после окончания копирования

        timeOperation = time2 - time1; //вычисляем разницу - получив результат в миллисекундах

        return timeOperation; //возвращаем результат времени

    }
}