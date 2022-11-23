import java.util.HashMap;

class VacationDestination{

    public static void main(String[] args) {
       String flights[][] = {{"A", "B"},{"C", "D"}, {"B", "C"}};
       System.out.println(findDestination(flights));

    }
    public static String findDestination(String[][] flights){
        HashMap<String,String> flightMap = new HashMap<>();
        for(int i=0;i<flights.length;i++){
            flightMap.put(flights[i][0],flights[i][1]);
        }
        String DepartingCity = flights[0][0];
        while(flightMap.get(DepartingCity)!=null){
            DepartingCity=flightMap.get(DepartingCity);
        }
        return DepartingCity;
    }
}
