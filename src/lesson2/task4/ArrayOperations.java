package lesson2.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class ArrayOperations {
    private static String logFileName = "log.txt";
    void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        try (var writer = new FileWriter(logFileName, true)) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime());
            String line = timeStamp + " {" + min + "}, {" + max + "}. \n";
            writer.append(line);
            System.out.println("CHECK: " + line);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
    String getLogFileName() {
        return logFileName;
    }
}
