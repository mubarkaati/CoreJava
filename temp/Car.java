package temp;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Car {

    public String carNumber;

    public int number;

    public static void main(String[] args) throws IOException {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        car.number = bufferedReader.read();
        car.carNumber = bufferedReader.readLine();
    }
}