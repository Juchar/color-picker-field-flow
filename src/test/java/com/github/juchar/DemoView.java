package com.github.juchar;

import com.github.juchar.colorpicker.ColorPickerField;
import com.github.juchar.colorpicker.ColorPickerFieldRaw;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

import java.awt.*;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        setPadding(true);
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setSpacing(true);

        final ColorPickerField colorPickerField = new ColorPickerField("As Color", Color.BLUE, "#fff");
        colorPickerField.setPinnedPalettes(true);
        colorPickerField.setHexEnabled(false);
        colorPickerField.setPalette(Color.RED, Color.GREEN, Color.BLUE);
        colorPickerField.addValueChangeListener(event -> System.out.println(event.getValue()));
        colorPickerField.setChangeFormatButtonVisible(true);
        colorPickerField.getTextField().setPlaceholder("Test!");
        colorPickerField.setWidth("400px");
        add(colorPickerField);

        final ColorPickerFieldRaw colorPickerFieldRaw = new ColorPickerFieldRaw("As String",
                "--lumo-primary-color", "#fff");
        colorPickerFieldRaw.setPinnedPalettes(true);
        colorPickerFieldRaw.setHexEnabled(false);
        colorPickerFieldRaw.setPalette("#ff0000", "#00ff00", "#0000ff", "--lumo-contrast");
        colorPickerFieldRaw.addValueChangeListener(event -> System.out.println(event.getValue()));
        colorPickerFieldRaw.setChangeFormatButtonVisible(true);
        colorPickerFieldRaw.setWidth("400px");
        colorPickerFieldRaw.setCssCustomPropertiesEnabled(true);
        add(colorPickerFieldRaw);

        Binder<TestColor> binder = new Binder<>();
        TestColor testColor = new TestColor(new Color(128, 128, 128, 128), "rgba(128, 128, 128, 0.5)");

        binder.setBean(testColor);
        binder.forField(colorPickerField).bind(TestColor::getColor, TestColor::setColor);
        binder.forField(colorPickerFieldRaw).bind(TestColor::getRawColor, TestColor::setRawColor);

        TextField colorValue = new TextField();
        colorValue.setWidth("400px");
        colorValue.setLabel("Color Value");

        TextField rawColorValue = new TextField();
        rawColorValue.setWidth("400px");
        rawColorValue.setLabel("Raw Color Value");
        binder.addValueChangeListener(valueChangeEvent -> {
            colorValue.setValue(colorPickerField.getValue().toString());
            rawColorValue.setValue(colorPickerFieldRaw.getValue());
        });
        add(colorValue);
        add(rawColorValue);
    }


    class TestColor {
        Color color;
        String rawColor;

        public TestColor(Color color, String rawColor) {
            this.color = color;
            this.rawColor = rawColor;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public String getRawColor() {
            return rawColor;
        }

        public void setRawColor(String rawColor) {
            this.rawColor = rawColor;
        }
    }
}
