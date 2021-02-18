package demo;

public class Node {
    int distance;
    String cityName;
    Node left;
    Node right;

    Node(int value, String cityName) {
        this.distance = value;
        this.cityName = cityName;
        right = null;
        left = null;
    }
}
