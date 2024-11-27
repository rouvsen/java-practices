package com.rouvsen.practice.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Color {
    RED {
        @Override
        public String selectedColor() {
            return this + " - discount: 10$";
        }
    }, WHITE {
        @Override
        public String selectedColor() {
            return this + " - discount: 15$";
        }
    }, BLUE {
        @Override
        public String selectedColor() {
            return this + " - discount: 20$";
        }
    }, YELLOW {
        @Override
        public String selectedColor() {
            return this + " - discount: 25$";
        }
    }, BLACK {
        @Override
        public String selectedColor() {
            return this + " - discount: 5$";
        }
    };

    public abstract String selectedColor();

    @JsonCreator
    public static Color fromString(String val) {
        try {
            return Color.valueOf(val.toUpperCase());
        } catch (Exception ex) {
            return BLACK; /* when exception occurred, we can set BLACK by default. */
        }
    }

}
