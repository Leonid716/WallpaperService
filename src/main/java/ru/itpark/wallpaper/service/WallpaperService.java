package ru.itpark.wallpaper.service;

import org.springframework.stereotype.Service;

@Service
public class WallpaperService {
    public double calculate(double wallRoom1, double wallRoom2, double heightRoom, double breadthRoll, double lengthRoll) {
        double perimetrRoom = wallRoom1 * 2 + wallRoom2 * 2;
        double howMuchCanvases = perimetrRoom / breadthRoll;

        double howMuchRolls = howMuchCanvases / (lengthRoll / heightRoom);

        return Math.ceil(howMuchRolls);
    }
}
