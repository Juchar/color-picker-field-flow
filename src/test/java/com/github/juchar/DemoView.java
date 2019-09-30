package com.github.juchar;

import com.github.juchar.colorpicker.ColorPickerField;
import com.github.juchar.colorpicker.ColorPickerFieldRaw;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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
    colorPickerField.getTextField().addValueChangeListener(event -> System.out.println(event.getValue()));
    colorPickerField.setChangeFormatButtonVisible(true);
    colorPickerField.getTextField().setPlaceholder("Test!");
    colorPickerField.setWidth("400px");
    add(colorPickerField);

    final ColorPickerFieldRaw colorPickerFieldRaw = new ColorPickerFieldRaw("As String",
        "--lumo-primary-color", "#fff");
    colorPickerFieldRaw.setPinnedPalettes(true);
    colorPickerFieldRaw.setHexEnabled(false);
    colorPickerFieldRaw.setPalette("#ff0000", "#00ff00", "#0000ff", "--lumo-contrast");
    colorPickerFieldRaw.getTextField().addValueChangeListener(event -> System.out.println(event.getValue()));
    colorPickerFieldRaw.setChangeFormatButtonVisible(true);
    colorPickerFieldRaw.setWidth("400px");
    colorPickerFieldRaw.setCssCustomPropertiesEnabled(true);
    add(colorPickerFieldRaw);
  }
}
