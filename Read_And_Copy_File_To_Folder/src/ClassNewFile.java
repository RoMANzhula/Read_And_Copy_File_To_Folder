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
        File file1 = new File(pathName); //создаем новый файл (с адресом)
        //откудого будем производить копирование данных в другой файл
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
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"; // создаем
        // новую строку и инициализируем ее литералом

        FileOutputStream outputStreamStr = new FileOutputStream(file1); //создаем новый поток для записи данных из строки
        outputStreamStr.write(str.getBytes()); //через поток пишем данные в файл преобразуя данные в байты
        outputStreamStr.close(); //закрываем поток для записи данных
    }

    @Override //аннотация - переопределить
    public String toString() { //публичный метод типа Строка кСтроковомуВиду()
        return pathName; //возвращаем содержимое ссыл.переменной
    }
}
