package hus.oop.lab8.countrymanager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        System.out.println("Original data:");
        testOriginalData();

        System.out.println("\nCountries sorted by increasing population:");
        testSortIncreasingByPopulation();

        System.out.println("\nCountries sorted by decreasing population:");
        testSortDecreasingByPopulation();

        System.out.println("\nCountries sorted by increasing area:");
        testSortIncreasingByArea();

        System.out.println("\nCountries sorted by decreasing area:");
        testSortDecreasingByArea();

        System.out.println("\nCountries sorted by increasing GDP:");
        testSortIncreasingByGdp();

        System.out.println("\nCountries sorted by decreasing GDP:");
        testSortDecreasingByGdp();
        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double surfaceArea = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                Country country;
                switch (continent){
                    case "Oceania":
                        country = new OceaniaCountry(code, name, population, surfaceArea, gdp);
                        break;
                    case "Asia":
                        country = new AsiaCountry(code, name, population, surfaceArea, gdp);
                        break;
                    case "Europe":
                        country = new EuropeCountry(code, name, population, surfaceArea, gdp);
                        break;
                    case "North America":
                        country = new NorthAmericaCountry(code, name, population, surfaceArea, gdp);
                        break;
                    case "South America":
                        country = new SouthAmericaCountry(code, name, population, surfaceArea, gdp);
                        break;
                    default:
                        country = new AfricaCountry(code, name, population, surfaceArea, gdp);
                        break;
                }
                countryManager.append(country);
                /*
                * TODO: create Country and append countries into 
                * CountryArrayManager here.
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "D:\\IJ\\OOP\\HK2\\hus\\oop\\lab8\\countrymanager\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        for (Country country : countries) {
            System.out.println(country.getName() + " - Population: " + country.getPopulation());
        }
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        for (Country country : countries) {
            System.out.println(country.getName() + " - Population: " + country.getPopulation());
        }
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        for (Country country : countries) {
            System.out.println(country.getName() + " - Area: " + country.getArea());
        }
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        for (Country country : countries) {
            System.out.println(country.getName() + " - Area: " + country.getArea());
        }
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        for (Country country : countries) {
            System.out.println(country.getName() + " - GDP: " + country.getGdp());
        }
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        for (Country country : countries) {
            System.out.println(country.getName() + " - GDP: " + country.getGdp());
        }
    }


    public static void testFilterAfricaCountry() {
        /* TODO */
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
    }
}
