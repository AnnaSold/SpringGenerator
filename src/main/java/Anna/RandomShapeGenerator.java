package Anna;

import java.util.ArrayList;
import java.util.List;

public class RandomShapeGenerator implements GeneratorClassName{
    @Override
    public String getName() {
        List<String> figures = new ArrayList<>();
        figures.add("Треугольник");
        figures.add("Квадрат");
        figures.add("Круг");
        figures.add("Прямоугольник");
        figures.add("Параллелограмм");
        figures.add("Иктаэдр");
        int a =(int) Math.random() * 6;

        System.out.println();
        return figures.get(a);
    }
}
