import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException { //главный метод, кот.пробрасывает исключение входного-
        //выходного потока
        ClassNewFile newFile = new ClassNewFile("C:\\Users\\User\\Desktop\\dataTotalFileForRead"); //создаем
        //новый обьект для создания файла со строковым указанием адреса в качестве аргумента конструктора класса

        ClassFileReadWrite classFileReadWrite = new ClassFileReadWrite();
        System.out.println("FileReader and FileWriter - time operation: " +
                classFileReadWrite.returnTimeOperation(newFile.toString()));

        ClassFileInput_OutputStream classFileInput_outputStream = new ClassFileInput_OutputStream();
        System.out.println("FileInputStream and FileOutputStream - time operation: " +
                classFileInput_outputStream.returnTimeOperation(newFile.toString()));

        ClassBufferInputStream cBIS = new ClassBufferInputStream();
        System.out.println("FileInputStream and FileOutputStream with BufferedInputStream - time operation: " +
                cBIS.returnTimeOperation(newFile.toString()));

    }
}

//Написать программу, которая читает файл из одной папки и копирует его в другой.
//Попробовать разные методы. Сравнить производительность.