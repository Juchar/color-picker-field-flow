package com.github.juchar;

import com.github.juchar.colorpicker.ColorPickerField;
import com.github.juchar.colorpicker.ColorPickerFieldRaw;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.awt.Color;

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
  }
}
