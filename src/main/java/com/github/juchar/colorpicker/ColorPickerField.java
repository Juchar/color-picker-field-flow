package com.github.juchar.colorpicker;

import com.vaadin.flow.component.CompositionNotifier;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasValidation;
import com.vaadin.flow.component.InputNotifier;
import com.vaadin.flow.component.KeyNotifier;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.textfield.GeneratedVaadinTextField;
import com.vaadin.flow.component.textfield.HasAutocapitalize;
import com.vaadin.flow.component.textfield.HasAutocomplete;
import com.vaadin.flow.component.textfield.HasAutocorrect;
import com.vaadin.flow.component.textfield.HasPrefixAndSuffix;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.value.HasValueChangeMode;
import com.vaadin.flow.data.value.ValueChangeMode;
import java.awt.Color;

@Tag("color-picker-field")
@NpmPackage(value = "@appreciated/color-picker-field", version = "2.0.0-alpha.4")
@JsModule("@appreciated/color-picker-field/color-picker-field.js")
public class ColorPickerField extends GeneratedVaadinTextField<ColorPickerField, Color>
    implements ColorPickerFieldBaseColor, HasSize, HasValidation, HasValueChangeMode,
    HasPrefixAndSuffix, InputNotifier, KeyNotifier, CompositionNotifier,
    HasAutocomplete, HasAutocapitalize, HasAutocorrect {

  private ValueChangeMode currentMode;
  private boolean isConnectorAttached;
  private Icon hoverIcon;

  /**
   * Constructs an empty {@code ColorPickerField}.
   */
  public ColorPickerField() {
    super(null, null, String.class,
        ColorPickerFieldBaseColor.PRESENTATION_TO_MODEL,
        ColorPickerFieldBaseColor.MODEL_TO_PRESENTATION);
    setValueChangeMode(ValueChangeMode.ON_CHANGE);
  }

  /**
   * Constructs an empty {@code ColorPickerField} with the given label.
   *
   * @param label the text to set as the label
   */
  public ColorPickerField(String label) {
    this();
    setLabel(label);
  }

  /**
   * Constructs an empty {@code ColorPickerField} with the given label and placeholder text.
   *
   * @param label the text to set as the label
   * @param placeholder the placeholder text to set
   */
  public ColorPickerField(String label, String placeholder) {
    this(label);
    setPlaceholder(placeholder);
  }

  /**
   * Constructs a {@code ColorPickerField} with the given label, an initial value and placeholder
   * text.
   *
   * @param label the text to set as the label
   * @param initialValue the initial value
   * @param placeholder the placeholder text to set
   *
   * @see #setValue(Object)
   * @see #setPlaceholder(String)
   */
  public ColorPickerField(String label, Color initialValue, String placeholder) {
    this(label);
    setValue(initialValue);
    setPlaceholder(placeholder);
  }

  /**
   * Constructs an empty {@code ColorPickerField} with a value change listener.
   *
   * @param listener the value change listener
   *
   * @see #addValueChangeListener(com.vaadin.flow.component.HasValue.ValueChangeListener)
   */
  public ColorPickerField(
      ValueChangeListener<? super ComponentValueChangeEvent<ColorPickerField, Color>> listener) {
    this();
    addValueChangeListener(listener);
  }

  /**
   * Constructs an empty {@code ColorPickerField} with a label and a value change listener.
   *
   * @param label the text to set as the label
   * @param listener the value change listener
   *
   * @see #setLabel(String)
   * @see #addValueChangeListener(com.vaadin.flow.component.HasValue.ValueChangeListener)
   */
  public ColorPickerField(String label,
      ValueChangeListener<? super ComponentValueChangeEvent<ColorPickerField, Color>> listener) {
    this(label);
    addValueChangeListener(listener);
  }

  /**
   * Constructs an empty {@code ColorPickerField} with a label,a value change listener and an
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
  public ColorPickerField(String label, Color initialValue,
      ValueChangeListener<? super ComponentValueChangeEvent<ColorPickerField, Color>> listener) {
    this(label);
    setValue(initialValue);
    addValueChangeListener(listener);
  }

  /**
   * {@inheritDoc}
   * <p>
   * The default value is {@link ValueChangeMode#ON_CHANGE}.
   */
  @Override
  public ValueChangeMode getValueChangeMode() {
    return currentMode;
  }

  @Override
  public void setValueChangeMode(ValueChangeMode valueChangeMode) {
    currentMode = valueChangeMode;
    setSynchronizedEvent(
        ValueChangeMode.eventForMode(valueChangeMode, "value-changed"));
  }

  @Override
  public String getErrorMessage() {
    return super.getErrorMessageString();
  }

  @Override
  public void setErrorMessage(String errorMessage) {
    super.setErrorMessage(errorMessage);
  }

  @Override
  public boolean isInvalid() {
    return isInvalidBoolean();
  }

  @Override
  public void setInvalid(boolean invalid) {
    super.setInvalid(invalid);
  }

  /**
   * String used for the label element.
   *
   * @return the {@code label} property from the webcomponent
   */
  public String getLabel() {
    return getLabelString();
  }

  @Override
  public void setLabel(String label) {
    super.setLabel(label);
  }

  /**
   * A hint to the user of what can be entered in the component.
   *
   * @return the {@code placeholder} property from the webcomponent
   */
  public String getPlaceholder() {
    return getPlaceholderString();
  }

  @Override
  public void setPlaceholder(String placeholder) {
    super.setPlaceholder(placeholder);
  }

  /**
   * Specifies if the field value gets automatically selected when the field gains focus.
   *
   * @return <code>true</code> if autoselect is active, <code>false</code>
   *     otherwise
   */
  public boolean isAutoselect() {
    return super.isAutoselectBoolean();
  }

  /**
   * Set to <code>true</code> to always have the field value automatically selected when the field
   * gains focus, <code>false</code> otherwise.
   *
   * @param autoselect <code>true</code> to set auto select on,
   *     <code>false</code> otherwise
   */
  @Override
  public void setAutoselect(boolean autoselect) {
    super.setAutoselect(autoselect);
  }

  /**
   * Gets the visibility state of the button which clears the text field.
   *
   * @return <code>true</code> if the button is visible, <code>false</code>
   *     otherwise
   */
  public boolean isClearButtonVisible() {
    return isClearButtonVisibleBoolean();
  }

  /**
   * Set to <code>false</code> to hide the clear button which clears the text field.
   *
   * @param clearButtonVisible <code>true</code> to set the button visible,
   *     <code>false</code> otherwise
   */
  @Override
  public void setClearButtonVisible(boolean clearButtonVisible) {
    super.setClearButtonVisible(clearButtonVisible);
  }

  /**
   * Specify that this control should have input focus when the page loads.
   *
   * @return the {@code autofocus} property from the webcomponent
   */
  public boolean isAutofocus() {
    return isAutofocusBoolean();
  }

  @Override
  public void setAutofocus(boolean autofocus) {
    super.setAutofocus(autofocus);
  }

  /**
   * Maximum number of characters (in Unicode code points) that the user can enter.
   *
   * @return the {@code maxlength} property from the webcomponent
   */
  public int getMaxLength() {
    return (int) getMaxlengthDouble();
  }

  /**
   * Maximum number of characters (in Unicode code points) that the user can enter.
   *
   * @param maxLength the maximum length
   */
  public void setMaxLength(int maxLength) {
    super.setMaxlength(maxLength);
  }

  /**
   * Minimum number of characters (in Unicode code points) that the user can enter.
   *
   * @return the {@code minlength} property from the webcomponent
   */
  public int getMinLength() {
    return (int) getMinlengthDouble();
  }

  /**
   * Minimum number of characters (in Unicode code points) that the user can enter.
   *
   * @param minLength the minimum length
   */
  public void setMinLength(int minLength) {
    super.setMinlength(minLength);
  }

  /**
   * Specifies that the user must fill in a value.
   *
   * @return the {@code required} property from the webcomponent
   */
  public boolean isRequired() {
    return isRequiredBoolean();
  }

  /**
   * <p>
   * Specifies that the user must fill in a value.
   * </p>
   * NOTE: The required indicator will not be visible, if there is no {@code label} property set for
   * the colorpickerfield.
   *
   * @param required the boolean value to set
   */
  @Override
  public void setRequired(boolean required) {
    super.setRequired(required);
  }

  /**
   * When set to <code>true</code>, user is prevented from typing a value that conflicts with the
   * given {@code pattern}.
   *
   * @return the {@code preventInvalidInput} property from the webcomponent
   */
  public boolean isPreventInvalidInput() {
    return isPreventInvalidInputBoolean();
  }

  @Override
  public void setPreventInvalidInput(boolean preventInvalidInput) {
    super.setPreventInvalidInput(preventInvalidInput);
  }

  /**
   * A regular expression that the value is checked against. The pattern must match the entire
   * value, not just some subset.
   *
   * @return the {@code pattern} property from the webcomponent
   */
  public String getPattern() {
    return getPatternString();
  }

  @Override
  public void setPattern(String pattern) {
    super.setPattern(pattern);
  }

  /**
   * Message to show to the user when validation fails.
   *
   * @return the {@code title} property from the webcomponent
   */
  public String getTitle() {
    return super.getTitleString();
  }

  @Override
  public void setTitle(String title) {
    super.setTitle(title);
  }

  @Override
  public Color getEmptyValue() {
    return null;
  }

  /**
   * Returns the current value of the text field. By default, the empty text field will return an
   * empty string.
   *
   * @return the current value.
   */
  @Override
  public Color getValue() {
    return super.getValue();
  }

  /**
   * Sets the value of this text field. If the new value is not equal to {@code getValue()}, fires a
   * value change event. Throws {@code NullPointerException}, if the value is null.
   * <p>
   * Note: {@link Binder} will take care of the {@code null} conversion when integrates with text
   * field, as long as no new converter is defined.
   *
   * @param value the new value, not {@code null}
   */
  @Override
  public void setValue(Color value) {
    super.setValue(value);
  }

  @Override
  public void setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
    super.setRequiredIndicatorVisible(requiredIndicatorVisible);
    if (!isConnectorAttached) {
      RequiredValidationUtil.attachConnector(this);
      isConnectorAttached = true;
    }
    RequiredValidationUtil.updateClientValidation(requiredIndicatorVisible, this);
  }
}
