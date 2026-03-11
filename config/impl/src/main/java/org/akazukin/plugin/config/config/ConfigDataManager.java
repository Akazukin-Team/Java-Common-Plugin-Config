package org.akazukin.plugin.config.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.akazukin.plugin.config.config.data.IConfigData;
import org.akazukin.plugin.config.config.data.IConfigDataManager;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

@FieldDefaults(level = AccessLevel.PROTECTED)
public class ConfigDataManager<T extends IConfigData> implements IConfigDataManager<T> {
    @Getter
    final Class<T> configClass;
    final Supplier<T> defaultsSupplier;
    @Getter
    @NotNull
    T config;

    public ConfigDataManager(@NotNull final Class<T> configClass, @NotNull final Supplier<@NotNull T> defaultsSupplier) {
        this.configClass = configClass;
        this.defaultsSupplier = defaultsSupplier;
        this.config = defaultsSupplier.get();
    }

    @Override
    public void restoreDefaults() {
        this.config = this.defaultsSupplier.get();
    }
}
