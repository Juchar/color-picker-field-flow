package com.github.juchar.colorpicker;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.textfield.TextField;

@Tag("color-picker-field")
@NpmPackage(value = "@appreciated/color-picker-field", version = "2.0.0-beta.1")
@JsModule("@appreciated/color-picker-field/color-picker-field.js")
public class ColorPickerFieldRaw extends TextField implements ColorPickerFieldBaseRaw {

  /**
   * Constructs an empty {@code ColorPickerFieldRaw}.
   */
  public ColorPickerFieldRaw() {
    super();
  }

  /**
   * Constructs an empty {@code ColorPickerFieldRaw} with the given label.
   *
   * @param label the text to set as the label
   */
  public ColorPickerFieldRaw(String label) {
    super(label);
  }

  /**
   * Constructs an empty {@code ColorPickerFieldRaw} with the given label and placeholder text.
   *
   * @param label the text to set as the label
   * @param placeholder the placeholder text to set
   */
  public ColorPickerFieldRaw(String label, String placeholder) {
    super(label, placeholder);
  }

  /**
   * Constructs a {@code ColorPickerFieldRaw} with the given label, an initial value and placeholder
   * text.
   *
   * @param label the text to set as the label
   * @param initialValue the initial value
   * @param placeholder the placeholder text to set
   *
   * @see #setValue(Object)
   * @see #setPlaceholder(String)
   */
  public ColorPickerFieldRaw(String label, String initialValue, String placeholder) {
    super(label, initialValue, placeholder);
  }

  /**
   * Constructs an empty {@code ColorPickerFieldRaw} with a value change listener.
   *
   * @param listener the value change listener
   *
   * @see #addValueChangeListener(com.vaadin.flow.component.HasValue.ValueChangeListener)
   */
  public ColorPickerFieldRaw(
      ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
    super(listener);
  }

  /**
   * Constructs an empty {@code ColorPickerFieldRaw} with a label and a value change listener.
   *
   * @param label the text to set as the label
   * @param listener the value change listener
   *
   * @see #setLabel(String)
   * @see #addValueChangeListener(com.vaadin.flow.component.HasValue.ValueChangeListener)
   */
  public ColorPickerFieldRaw(String label,
      ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
    super(label, listener);
  }

  /**
   * Constructs an empty {@code ColorPickerFieldRaw} with a label,a value change listener and an
   * initial value.
   *
   * @param label the text to set as the label
   * @param initialValue the initial value
   * @param listener the value change listener
   *
   * @see #setLabel(String)
   * @see #setValue(Object)
   * @see #addValueChangeListener(com.vaadin.flow.component.HasValue.ValueChangeListener)
   */
  public ColorPickerFieldRaw(String label, String initialValue,
      ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
    super(label, initialValue, listener);
  }
}
