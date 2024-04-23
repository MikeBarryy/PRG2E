package medots;

public class country {

    private String name;
    private int area;
    int population;
    String code;

    public country(String name, int area, int population, String code) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public String getCode() {
        return code;
    }

    public void setArea(int area) {
        if (area>0){
            System.out.println("nejde to");
        }
        this.area = area;
    }

    public void setCode(String code) {
        if (code.length() != 3){
            System.out.println("nah to nejde");
        }
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<0){
            System.out.println("blud nevytvořil hřbitov");
        }
        this.population = population;
    }
}
