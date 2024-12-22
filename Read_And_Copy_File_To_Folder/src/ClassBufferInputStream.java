import java.io.*;
import java.util.Date;

public class ClassBufferInputStream {
    // Метод для повернення результату копіювання файлу
    public long returnTimeOperation(String file1) throws IOException { 
        Date date = new Date(); // Створюємо новий об'єкт класу Date
        File file2 = new File("C:\\Users\\User\\Desktop\\dataFileInputWriterWithBuffer"); 
        // Створюємо новий файл, в який будемо копіювати дані

        FileInputStream fileInputStream = new FileInputStream(file1); 
        // Відкриваємо потік для зчитування даних із вказаного файлу
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); 
        // Відкриваємо буферизований потік для зчитування даних

        FileOutputStream fileOutputStream = new FileOutputStream(file2); 
        // Відкриваємо потік для запису даних у вказаний файл

        int i;

        // Поки в буферизованому потоці є дані для зчитування
        while ((i = bufferedInputStream.read()) != -1) { 
            fileOutputStream.write(bufferedInputStream.readAllBytes()); 
            // З буферизованого потоку записуємо всі зчитані байти у файл
            fileOutputStream.flush(); // Очищаємо буфер виводу даних
        }

        // Закриваємо всі потоки
        fileInputStream.close(); 
        fileOutputStream.close();
        bufferedInputStream.close();

        Date date1 = new Date(); // Створюємо новий об'єкт класу Date
        long l = (date1.getTime() - date.getTime()); 
        // Обчислюємо час виконання копіювання (у мілісекундах)
        return l; // Повертаємо результат
    }
}
