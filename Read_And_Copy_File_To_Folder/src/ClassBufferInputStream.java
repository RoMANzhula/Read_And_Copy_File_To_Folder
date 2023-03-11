import java.io.*;
import java.util.Date;

public class ClassBufferInputStream {
    public long returnTimeOperation(String file1) throws IOException { //метод для возвращения результата копирования файла
        Date date = new Date();//создаем новый обьект класса Дата
        File file2 = new File("C:\\Users\\User\\Desktop\\dataFileInputWriterWithBuffer"); //создаем новый файл, в
        // который будем копировать данные

        FileInputStream fileInputStream = new FileInputStream(file1);//открываем поток для чтения данных с указанного файла
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);//открываем буферизированный поток
        // для потока чтения данных

        FileOutputStream fileOutputStream = new FileOutputStream(file2);//открываем поток для записи данных в указанный файл

        int i;

        while ((i = bufferedInputStream.read()) != -1) {//пока в буфферизированном потоке есть данные для чтения
            fileOutputStream.write(bufferedInputStream.readAllBytes());//с помощью потока для записи данных в файл пишем
            //из буфферизированного потока все считанные байты
            fileOutputStream.flush(); //очищаем буфер вывода данных
        }
        fileInputStream.close(); //закрываем потоки
        fileOutputStream.close();
        bufferedInputStream.close();
        Date date1 = new Date();//создаем новый обьект класса Дата
        long l = (date1.getTime() - date.getTime()); //по обьектам класса Дата вычисляем время выполнения копирования
        return l; //возвращаем пезультат (в миллисекундах)
    }
}