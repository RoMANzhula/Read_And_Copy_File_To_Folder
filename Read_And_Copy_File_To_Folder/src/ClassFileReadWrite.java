import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ClassFileReadWrite {
    public long returnTimeOperation(String file1) throws IOException {
        long timeOperation; // Створюємо змінну для виводу часу операції копіювання у мілісекундах
        long time1; // Створюємо змінну для фіксації часу перед початком копіювання
        long time2; // Створюємо змінну для фіксації часу після завершення копіювання
        Date date = new Date(); // Створюємо новий об'єкт класу Date і зберігаємо його у змінну
        time1 = date.getTime(); // Фіксуємо час перед початком копіювання

        File file2 = new File("C:\\Users\\User\\Desktop\\dataFileWriter"); 
        // Створюємо новий файл, у який будемо копіювати дані

        FileReader reader = new FileReader(file1); 
        // Створюємо потік для зчитування даних з файлу
        FileWriter writer = new FileWriter(file2); 
        // Створюємо потік для запису даних у вказаний файл

        // Поки у потоці вводу є дані для зчитування (непрочитані байти)
        while (reader.ready()) { 
            int data = reader.read(); 
            // Зчитуємо один символ, який буде розширений до типу int
            writer.write(data); 
            // Записуємо один символ через потік для запису у файл (відбудеться звуження до типу char)
        }

        reader.close(); // Закриваємо потік для зчитування даних з файлу
        writer.close(); // Закриваємо потік для запису даних у файл

        Date date1 = new Date(); // Створюємо новий об'єкт класу Date і зберігаємо його у змінну
        time2 = date1.getTime(); // Фіксуємо час після завершення копіювання

        timeOperation = time2 - time1; 
        // Обчислюємо різницю, отримуючи результат у мілісекундах

        return timeOperation; // Повертаємо результат часу
    }
}
