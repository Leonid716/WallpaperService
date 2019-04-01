package ru.itpark.wallpaper.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallpaperServiceTest {

    @Test
    public void calculate(){
        WallpaperService service = new WallpaperService();
        double wallpaper = service.calculate(3.0,5.0,3.0,1.0,10.0);
        assertEquals(5.0,wallpaper);

    }
}