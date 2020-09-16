package student_aleksey_kodin.lesson16.level_7;

import java.util.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SkylineImpl implements SkyLine {
    private final List<Integer> skyLineCoordinates = new ArrayList<>();

    @Override
    public List<Integer> checkSkyline(List<Rectangle> entryRectangles) {

        sortRectangleUseCoordinateX(entryRectangles);

        List<Integer> arrayOfHeights = createCoordinateLine(entryRectangles);

        createHeightMap(entryRectangles, arrayOfHeights);

        getSkyLine(arrayOfHeights);

        return skyLineCoordinates;
    }

    @Override
    public String toString() {
        StringBuilder skyLineCoordinatesResult = new StringBuilder();
        for (int i = 0; i < skyLineCoordinates.size() - 1; ) {
            skyLineCoordinatesResult.append("{x=").append(skyLineCoordinates.get(i))
                    .append(",y=").append(skyLineCoordinates.get(i + 1)).append("} ");
            i = i + 2;
        }
        return skyLineCoordinatesResult.toString();
    }

    private void sortRectangleUseCoordinateX(List<Rectangle> entryRectangles) {
        entryRectangles.sort(Comparator.comparingInt(Rectangle::getStartCoordinateX));
    }

    private List<Integer> createCoordinateLine(List<Rectangle> entry) {
        final int FREE_PLACE_AFTER_LAST_RECTANGLE = 1;

        int lineLength = entry.stream().map(Rectangle::getFinishCoordinateX).max(Integer::compareTo).orElse(0);

        return new ArrayList<>(Collections.nCopies(lineLength + FREE_PLACE_AFTER_LAST_RECTANGLE, 0));
    }

    private void createHeightMap(List<Rectangle> entryRectangles, List<Integer> arrayOfHeights) {
        for (Rectangle rectangle : entryRectangles) {
            for (int i = rectangle.getStartCoordinateX(); i < rectangle.getFinishCoordinateX(); i++) {
                if (rectangle.height > arrayOfHeights.get(i)) {
                    arrayOfHeights.set(i, rectangle.height);
                }
            }
        }
    }

    private void getSkyLine(List<Integer> arrayOfHeights) {
        int previousLevel = 0;

        for (int i = 0; i < arrayOfHeights.size(); i++) {
            int currentLevel = arrayOfHeights.get(i);

            if (currentLevel > 0 & previousLevel == 0) {
                skyLineCoordinates.add(i);
                skyLineCoordinates.add(0);

                skyLineCoordinates.add(i);
                skyLineCoordinates.add(currentLevel);

                previousLevel = arrayOfHeights.get(i);
                continue;
            }
            if (currentLevel != previousLevel) {
                skyLineCoordinates.add(i);
                skyLineCoordinates.add(previousLevel);

                skyLineCoordinates.add(i);
                skyLineCoordinates.add(currentLevel);
            }
            previousLevel = arrayOfHeights.get(i);
        }
    }
}