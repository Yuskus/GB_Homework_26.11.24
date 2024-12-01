package lesson2.task1;

class URLBuilder {
    String buildURL(String baseURL, String params) {
        if (baseURL == null || params == null) return null;

        String[] parts = params.split("&");
        StringBuilder sb = new StringBuilder(baseURL);

        if (parts.length == 0) return null;

        for (int i = 0; i < parts.length; i++) {
            String[] keyValues = parts[i].split("=");
            if (keyValues != null && keyValues.length == 2 && !keyValues[1].equals("null")) {
                if (i != 0) sb.append('&');
                sb.append(parts[i]);
            }
        }
        return sb.toString();
    }
}
