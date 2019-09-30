package com.github.juchar.colorpicker;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("color-picker-field")
@NpmPackage(value = "@appreciated/color-picker-field", version = "2.0.0-beta.2")
@JsModule("@appreciated/color-picker-field/src/color-picker-field.js")
public class ColorPickerFieldRaw extends PolymerTemplate<TemplateModel> implements ColorPickerFieldBaseRaw, HasSize {

  @Id("text-field")
  ColorPickerTextFieldRaw field;

  /**
   * Constructs an empty {@code ColorPickerTextField} with the given label and placeholder text.
   *
   * @param label       the text to set as the label
   * @param placeholder the placeholder text to set
   */
  public ColorPickerFieldRaw(String label, String placeholder) {
    this(label);
    field.setPlaceholder(placeholder);
  }

  /**
   * Constructs an empty {@code ColorPickerTextField} with the given label.
   *
   * @param label the text to set as the label
   */
  public ColorPickerFieldRaw(String label) {
    this();
    field.setLabel(label);
  }

  public ColorPickerFieldRaw() {
    field.setValueChangeMode(ValueChangeMode.ON_CHANGE);
  }

  /**
   * Constructs a {@code ColorPickerTextField} with the given label, an initial value and placeholder
   * text.
   *
   * @param label        the text to set as the label
   * @param initialValue the initial value
   * @param placeholder  the placeholder text to set
   */
  public ColorPickerFieldRaw(String label, String initialValue, String placeholder) {
    this(label);
    field.setValue(initialValue);
    field.setPlaceholder(placeholder);
  }

  /**
   * Constructs an empty {@code ColorPickerTextField} with a value change listener.
   *
   * @param listener the value change listener
   */
  public ColorPickerFieldRaw(
          HasValue.ValueChangeListener<? super AbstractField.ComponentValueChangeEvent<ColorPickerTextFieldRaw, String>> listener) {
    this();
    field.addValueChangeListener(listener);
  }

  /**
   * Constructs an empty {@code ColorPickerTextField} with a label and a value change listener.
   *
   * @param label    the text to set as the label
   * @param listener the value change listener
   */
  public ColorPickerFieldRaw(String label,  HasValue.ValueChangeListener<? super AbstractField.ComponentValueChangeEvent<ColorPickerTextFieldRaw, String>> listener) {
    this(label);
    field.addValueChangeListener(listener);
  }

  /**
   * Constructs an empty {@code ColorPickerTextField} with a label,a value change listener and an
   * initial value.
   *
   * @param label        the text to set as the label
   * @param initialValue the initial value
   * @param listener     the value change listener
   */
  public ColorPickerFieldRaw(String label, String initialValue,
                             HasValue.ValueChangeListener<? super AbstractField.ComponentValueChangeEvent<ColorPickerTextFieldRaw, String>> listener) {
    this(label, listener);
  }


  public ColorPickerTextFieldRaw getTextField() {
    return field;
  }
}
