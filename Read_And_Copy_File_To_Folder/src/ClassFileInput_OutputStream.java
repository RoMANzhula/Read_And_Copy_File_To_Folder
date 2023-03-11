import java.io.*;
import java.util.Date;

public class ClassFileInput_OutputStream {
    public long returnTimeOperation(String file1) throws IOException {
        long timeOperation;//создаем переменную для вывода времени на операцию копирования в миллисекундах
        long time1;//создаем переменную для фиксации времени перед началом копирования
        long time2;//создаем переменную для фиксации времени после окончания копирования
        Date date = new Date();//создаем новйы обьект класса Дата и кладем в ссыл.переменную
        time1 = date.getTime();//фиксируем время перед началом копирования

        File file2 = new File("C:\\Users\\User\\Desktop\\dataFileInputWriter"); //создаем новый файл, в который будем
        // копировать данные

        FileInputStream inputStream = new FileInputStream(file1);//создаем проток для чтения данных с файла
        FileOutputStream outputStream = new FileOutputStream(file2);//создаем поток для записи данных в
        //указанный файл

        while (inputStream.available() > 0) {//пока есть в потоке ввода данные для чтения (непрочитанные байты)
            int data = inputStream.read();//читаем один символ, кот.будет расширен до типа int
            outputStream.write(data);//записываем один символ через поток для записи в файл (произойдет сужение
            // до типа char)
        }

        inputStream.close();//закрываем поток для чтения данных из файла
        outputStream.close();//закрываем поток для записи данных в файл

        Date date1 = new Date();//создаем новйы обьект класса Дата и кладем в ссыл.переменную
        time2 = date1.getTime();//фиксируем время после окончания копирования
        timeOperation = time2 - time1;//вычисляем разницу - получив результат в миллисекундах

        return timeOperation; //возвращаем результат времени

    }
}
