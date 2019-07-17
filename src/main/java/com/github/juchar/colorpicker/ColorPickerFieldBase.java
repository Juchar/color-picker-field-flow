package com.github.juchar.colorpicker;

import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface ColorPickerFieldBase<T> extends ColorPickerBase<T> {

  PropertyDescriptor<Boolean, Boolean> SHOW_CHANGE_FORMAT_BUTTON_PROPERTY
      = PropertyDescriptors.propertyWithDefault("showChangeFormatButton", false);

  /**
   * Check if the button to change the color format inside the input field is visible.
   *
   * @return {@code true} if the button is visible, {@code false} else
   */
  default boolean isChangeFormatButtonVisible() {
    return SHOW_CHANGE_FORMAT_BUTTON_PROPERTY.get(this);
  }

  /**
   * Speciy if the button to change the color format inside the input field is visible.
   *
   * @param visible {@code true} if the button should be visible, {@code false} else
   */
  default void setChangeFormatButtonVisible(boolean visible) {
    SHOW_CHANGE_FORMAT_BUTTON_PROPERTY.set(this, visible);
  }
}
