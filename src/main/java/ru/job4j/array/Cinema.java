package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place freePlace = null;
        for (int i = 0; i < places.length - 1; i++) {
            for (int j = 0; j < places[i].length - 1; j++) {
                if (places[i][j] == null && places[i][j + 1] == null && places[i + 1][j] == null) {
                    freePlace = new Place(i, j);
                    break;
                }
            }
        }
        return freePlace;
    }

    public static class Place {
        private final int row;

        private final int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}