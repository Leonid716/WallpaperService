package ru.itpark.wallpaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.wallpaper.service.WallpaperService;

@Controller
public class FrontpageController {
    private WallpaperService service;

    public FrontpageController(WallpaperService service) {
        this.service = service;
    }

    @RequestMapping

    public String index(Model model){
        model.addAttribute("title","Some value");
        return "frontpage";
    }
    @RequestMapping(params = {"wallRoom1", "wallRoom2", "heightRoom", "breadthRoll", "lengthRoll"})
    public String calculate(
            Model model,
            @RequestParam double wallRoom1,
            @RequestParam double wallRoom2,
            @RequestParam double heightRoom,
            @RequestParam double breadthRoll,
            @RequestParam double lengthRoll

    ) {
        double wallpaper = service.calculate(wallRoom1,wallRoom2,heightRoom,breadthRoll,lengthRoll);

        model.addAttribute("result", wallpaper);
        return "frontpage";
    }


}
