package ua.pp.voronin.serhii.tommy;

import ua.pp.voronin.serhii.tommy.model.packaging.Box;
import ua.pp.voronin.serhii.tommy.model.part.Cube;
import ua.pp.voronin.serhii.tommy.model.part.Part;
import ua.pp.voronin.serhii.tommy.model.part.Sphere;
import ua.pp.voronin.serhii.tommy.model.part.Tetrahedron;

import java.util.Collection;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        // Упустимо код отримання списку деталей, задамо його безпосерезньо перед викликом потрібного коду
        Collection<Part> detailsList = List.of(
                new Cube(450, 0.1),
                new Cube(300, 0.2),
                new Sphere( 150, 0.3),
                new Tetrahedron(250, 0.2),
                new Cube(350, 0.2),
                new Sphere(100, 0.1)
        );

        Collection<Box> availableBoxes = List.of(
                new Box(700),
                new Box(500),
                new Box(500),
                new Box(500),
                new Box(400),
                new Box(400),
                new Box(400),
                new Box(300),
                new Box(300),
                new Box(200)
        );

        int boxPackagingPricePerMeter = 40; // в копійках

        new PartsProcessor().packageParts(detailsList, availableBoxes, boxPackagingPricePerMeter); // Підказка: в цьому виклиці складно розібратися з сігнатурою через погані імена зммінних.
    }
}
