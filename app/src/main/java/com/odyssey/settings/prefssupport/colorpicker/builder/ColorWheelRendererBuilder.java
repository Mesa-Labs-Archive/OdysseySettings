package com.odyssey.settings.prefssupport.colorpicker.builder;

import com.odyssey.settings.prefssupport.colorpicker.ColorPickerView;
import com.odyssey.settings.prefssupport.colorpicker.renderer.ColorWheelRenderer;
import com.odyssey.settings.prefssupport.colorpicker.renderer.FlowerColorWheelRenderer;
import com.odyssey.settings.prefssupport.colorpicker.renderer.SimpleColorWheelRenderer;

public class ColorWheelRendererBuilder {
	public static ColorWheelRenderer getRenderer(ColorPickerView.WHEEL_TYPE wheelType) {
		switch (wheelType) {
			case CIRCLE:
				return new SimpleColorWheelRenderer();
			case FLOWER:
				return new FlowerColorWheelRenderer();
		}
		throw new IllegalArgumentException("wrong WHEEL_TYPE");
	}
}