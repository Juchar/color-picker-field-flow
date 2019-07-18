package com.github.juchar.colorpicker;

import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface ColorPickerFieldBase<T> extends ColorPickerBase<T> {

  PropertyDescriptor<Boolean, Boolean> SHOW_CHANGE_FORMAT_BUTTON_PROPERTY
      = PropertyDescriptors.propertyWithDefault("showChangeFormatButton", false);

  PropertyDescriptor<Boolean, Boolean> ENABLE_HISTORY_PROPERTY
      = PropertyDescriptors.propertyWithDefault("enableHistory", false);

  PropertyDescriptor<Integer, Integer> MAX_HISTORY_PROPERTY
      = PropertyDescriptors.propertyWithDefault("maxHistory", 10);

  /**
   * Check if the button to change the color format inside the input field is visible.
   *
   * @return {@code true} if the button is visible, {@code false} else
   */
  default boolean isChangeFormatButtonVisible() {
    return SHOW_CHANGE_FORMAT_BUTTON_PROPERTY.get(this);
  }

  /**
   * Specify if the button to change the color format inside the input field is visible.
   *
   * @param visible {@code true} if the button should be visible, {@code false} else
   */
  default void setChangeFormatButtonVisible(boolean visible) {
    SHOW_CHANGE_FORMAT_BUTTON_PROPERTY.set(this, visible);
  }

  /**
   * Check if history is enabled for picked colors.
   *
   * @return {@code true} if the history is enabled, {@code false} else
   *
   * @see #getMaxHistory()
   */
  default boolean isHistoryEnabled() {
    return ENABLE_HISTORY_PROPERTY.get(this);
  }

  /**
   * Enable or disable the history for picked colors.
   *
   * @param enabled {@code true} if the history should be enabled, {@code false} else
   *
   * @see #setMaxHistory(int)
   */
  default void setHistoryEnabled(boolean enabled) {
    ENABLE_HISTORY_PROPERTY.set(this, enabled);
  }

  /**
   * Check how many colors should be in the history of picked colors.
   *
   * @return The maximum amount of colors in the history
   *
   * @see #isHistoryEnabled()
   */
  default int getMaxHistory() {
    return MAX_HISTORY_PROPERTY.get(this);
  }

  /**
   * Specify how many colors should be in the history of picked colors.
   *
   * @param maxHistory The maximum amount of colors in the history
   *
   * @see #setHistoryEnabled(boolean)
   */
  default void setMaxHistory(int maxHistory) {
    MAX_HISTORY_PROPERTY.set(this, maxHistory);
  }
}
