import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException { // головний метод, який передає виняток ввідно-
        // вихідного потоку
        ClassNewFile newFile = new ClassNewFile("C:\\Users\\User\\Desktop\\dataTotalFileForRead"); // створюємо
        // новий об'єкт для створення файлу з рядковим вказівником адреси як аргумент конструктора класу

        ClassFileReadWrite classFileReadWrite = new ClassFileReadWrite();
        System.out.println("FileReader і FileWriter - час операції: " +
                classFileReadWrite.returnTimeOperation(newFile.toString()));

        ClassFileInput_OutputStream classFileInput_outputStream = new ClassFileInput_OutputStream();
        System.out.println("FileInputStream і FileOutputStream - час операції: " +
                classFileInput_outputStream.returnTimeOperation(newFile.toString()));

        ClassBufferInputStream cBIS = new ClassBufferInputStream();
        System.out.println("FileInputStream і FileOutputStream з BufferedInputStream - час операції: " +
                cBIS.returnTimeOperation(newFile.toString()));

    }
}

// Написати програму, яка читає файл з однієї папки і копіює його в іншу.
// Спробувати різні методи. Порівняти продуктивність.
