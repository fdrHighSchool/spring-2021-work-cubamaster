import java.util.Arrays;


/**
 * thinking to add name for every film
 */
public class Films {


    SuperArray film_budgets;
    SuperArray film_box_office;

    public Films()
    {
        film_budgets = new SuperArray();
        film_box_office = new SuperArray();
    }

    public void add_film(int budget, int box_office){
        add_budget(budget);
        add_box_office(box_office);
    }
    private void add_budget(int value) {
        film_budgets.add(value);
    }

    private void add_box_office(int value) {
        film_box_office.add(value);
    }


    public void change_budget(int index, int value) {
        film_budgets.set(index, value);
    }

    public void change_box_office(int index, int value) {
        film_box_office.set(index, value);
    }

    public void printFilms() {
        System.out.println("Film number " + "      " + "Budget" + "    " + "Box_office");
        for (int i = 0; i < film_box_office.getArr().length; i++) {
            System.out.println((i+1) + "      " + film_budgets.getValue(i) + "    " + film_box_office.getValue(i));
        }
    }

    public int Bigestbudget() {
        int [] arr;
        arr = this.film_budgets.getArr();
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public int Bigest_BoxOffice() {
        int arr[];
        arr = this.film_box_office.getArr();
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public int Smallesbudget() {
        int [] arr = film_budgets.getArr();
        Arrays.sort(arr);
        return arr[0];
    }

    public int Smallest_BoxOffice() {
        int [] arr = film_box_office.getArr();
        Arrays.sort(arr);
        return arr[0];
    }

    public int Total_budget() {
        int sum = 0;
        for (int i = 0; i < film_budgets.getSize(); i++) {
            sum += film_budgets.getValue(i);
        }
        return sum;
    }

    public int Total_box_office() {
        int sum = 0;
        for (int i = 0; i < film_box_office.getSize(); i++) {
            sum += film_box_office.getValue(i);
        }
        return sum;
    }

    public double average_budget() {
        return (double) Total_budget()/film_budgets.getSize();
    }

    public double average_box_office() {
        return (double) Total_box_office()/ film_box_office.getSize();
    }


}
