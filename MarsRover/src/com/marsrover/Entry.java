package com.marsrover;

import java.util.ArrayList;
import java.util.Scanner;

import static com.marsrover.InstructionParser.parseGrid;
import static com.marsrover.InstructionParser.parsePosition;

public class Entry {
    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Grid grid = parseGrid(scanner.nextLine());
        while(scanner.hasNext()) {
            Rover rover = new Rover(grid, parsePosition(scanner.nextLine()));
            rovers.add(rover);
            rover.process(scanner.nextLine());
        }
        rovers.forEach(r -> Logger.instance.log(r.getPosition()));
    }
}
