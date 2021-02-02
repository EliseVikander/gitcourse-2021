import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> movieList = List.of("Daredevil", "Titanic", "Matrix", "Hunger Games");

        String titanic = findByString(movieList, "Titanic");

        System.out.println(titanic);



    }
/*
        public static String findShortestString(List<String> movieList) {
            String shortest = null;
            for (String current : movieList) {
                if (shortest == null) { // first iteration
                    shortest = current;
                    continue;
                }
                int comparisonResult = comp.compare(shortest, current);
                // TODO: your task; update shortest, depending on comparisonResult
            }
            return shortest;
        }*/


    private static String findByString(List<String> movieList, String str) {
        String result = null;
        for (String movieName : movieList) {
            if (movieName.equals(str)){
                result = str;
                break;
            }

        }
        return result;
    }
}
