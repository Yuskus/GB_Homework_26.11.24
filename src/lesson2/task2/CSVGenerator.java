package lesson2.task2;

class CSVGenerator {
    String generateCSV(String[] headers, String[][] data) {
        if (headers == null || data == null) return null;
        String delimiter = ", ";
        var sb = new StringBuilder(String.join(delimiter, headers));
        for (int i = 0; i < headers.length; i++) {
            if (data[i] == null) return null;
            sb.append('\n');
            for (int j = 0; j < data[i].length; j++) {
                if (j != 0) sb.append(delimiter);
                sb.append(data[i][j]);
            }
        }
        return sb.toString();
    }
}
