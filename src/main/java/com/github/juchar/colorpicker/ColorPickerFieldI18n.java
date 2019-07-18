package com.github.juchar.colorpicker;

import java.io.Serializable;

public class ColorPickerFieldI18n implements Serializable {

  private String select;
  private String cancel;

  public String getSelect() {
    return select;
  }

  public ColorPickerFieldI18n setSelect(String caption) {
    this.select = caption;
    return this;
  }

  public String getCancel() {
    return cancel;
  }

  public ColorPickerFieldI18n setCancel(String caption) {
    this.cancel = caption;
    return this;
  }
}
