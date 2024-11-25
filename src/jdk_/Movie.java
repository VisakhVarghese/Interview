package jdk_;

// A Java program to demonstrate use of Comparable
import java.util.*;

// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear()	 { return year; }


    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

// Driver class
class Main
{
    public static void main(String[] args)
    {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.toString());
        }

        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Movies after sorted by name: ");
        for (Movie movie: list)
        {
            System.out.println(movie.toString());
        }

//        list.sort(new Comparator<Movie>() {
//            @Override
//            public int compare(Movie o1, Movie o2) {
//                return 0;
//            }
//        });

      /*  Comparator<Movie> movieComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Double.compare(o1.getRating(), o2.getRating());
            }
        };

        list.sort(movieComparator);

        System.out.println("Movies after sorted by rating: ");
        for (Movie movie: list)
        {
            System.out.println(movie.toString());
        } */

        Comparator<Movie> movieComparator = (o1, o2) ->{
            return Double.compare(o1.getRating(), o2.getRating());
        };

        list.sort(movieComparator);

        System.out.println("Movies after sorted by rating: ");
        for (Movie movie: list)
        {
            System.out.println(movie.toString());
        }
    }
}
