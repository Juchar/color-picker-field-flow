package com.github.juchar.colorpicker;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.textfield.*;
import com.vaadin.flow.data.value.HasValueChangeMode;
import com.vaadin.flow.data.value.ValueChangeMode;

public class ColorPickerTextFieldRaw extends GeneratedVaadinTextField<ColorPickerTextFieldRaw, String>
        implements HasSize, HasValidation, HasValueChangeMode,
        HasPrefixAndSuffix, InputNotifier, KeyNotifier, CompositionNotifier,
        HasAutocomplete, HasAutocapitalize, HasAutocorrect {

    private ValueChangeMode currentMode;
    private boolean isConnectorAttached;
    private Icon hoverIcon;

    /**
     * Constructs an empty {@code ColorPickerTextField} with the given label and placeholder text.
     *
     * @param label       the text to set as the label
     * @param placeholder the placeholder text to set
     */
    public ColorPickerTextFieldRaw(String label, String placeholder) {
        this(label);
        setPlaceholder(placeholder);
    }

    /**
     * Constructs an empty {@code ColorPickerTextField} with the given label.
     *
     * @param label the text to set as the label
     */
    public ColorPickerTextFieldRaw(String label) {
        this();
        setLabel(label);
    }

    /**
     * Constructs an empty {@code ColorPickerTextField}.
     */
    public ColorPickerTextFieldRaw() {
        super(null, null, false);
        setValueChangeMode(ValueChangeMode.ON_CHANGE);
    }

    /**
     * Constructs a {@code ColorPickerTextField} with the given label, an initial value and placeholder
     * text.
     *
     * @param label        the text to set as the label
     * @param initialValue the initial value
     * @param placeholder  the placeholder text to set
     * @see #setValue(Object)
     * @see #setPlaceholder(String)
     */
    public ColorPickerTextFieldRaw(String label, String initialValue, String placeholder) {
        this(label);
        setValue(initialValue);
        setPlaceholder(placeholder);
    }

    /**
     * Constructs an empty {@code ColorPickerTextField} with a value change listener.
     *
     * @param listener the value change listener
     * @see #addValueChangeListener(ValueChangeListener)
     */
    public ColorPickerTextFieldRaw(
            ValueChangeListener<? super ComponentValueChangeEvent<ColorPickerTextFieldRaw, String>> listener) {
        this();
        addValueChangeListener(listener);
    }

    /**
     * Constructs an empty {@code ColorPickerTextField} with a label and a value change listener.
     *
     * @param label    the text to set as the label
     * @param listener the value change listener
     * @see #setLabel(String)
     * @see #addValueChangeListener(ValueChangeListener)
     */
    public ColorPickerTextFieldRaw(String label,
                                   ValueChangeListener<? super ComponentValueChangeEvent<ColorPickerTextFieldRaw, String>> listener) {
        this(label);
        addValueChangeListener(listener);
    }

    /**
     * Constructs an empty {@code ColorPickerTextField} with a label,a value change listener and an
     * initial value.
     *
     * @param label        the text to set as the label
     * @param initialValue the initial value
     * @param listener     the value change listener
     * @see #setLabel(String)
     * @see #setValue(Object)
     * @see #addValueChangeListener(ValueChangeListener)
     */
    public ColorPickerTextFieldRaw(String label, String initialValue,
                                   ValueChangeListener<? super ComponentValueChangeEvent<ColorPickerTextFieldRaw, String>> listener) {
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

    /**
     * String used for the label element.
     *
     * @return the {@code label} property from the webcomponent
     */
    public String getLabel() {
        return getLabelString();
    }


    @Override
    public String getEmptyValue() {
        return null;
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
        return super.isInvalidBoolean();
    }

    @Override
    public void setInvalid(boolean invalid) {
        super.setInvalid(invalid);
    }

    @Override
    public void setPlaceholder(String placeholder) {
        super.setPlaceholder(placeholder);
    }

    @Override
    protected void setLabel(String label) {
        super.setLabel(label);
    }

}
