import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassNewFile {
    public String pathName;
    public ClassNewFile(String pathName) throws IOException {
        this.pathName = pathName;
        createNewFile(pathName);
    }
    public void createNewFile(String pathName) throws IOException {
        File file1 = new File(pathName); // створюємо новий файл (з адресою)
        // звідки будемо виконувати копіювання даних в інший файл
        String str = "Hello world! Hello all humans! SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"; // створюємо
        // новий рядок і ініціалізуємо його літералом

        FileOutputStream outputStreamStr = new FileOutputStream(file1); // створюємо новий потік для запису даних з рядка
        outputStreamStr.write(str.getBytes()); // через потік записуємо дані у файл, перетворюючи їх на байти
        outputStreamStr.close(); // закриваємо потік для запису даних
    }

    @Override // анотація - переозначити
    public String toString() { // публічний метод типу String до СтроковогоВиду()
        return pathName; // повертаємо вміст змінної-ссилки
    }
}
