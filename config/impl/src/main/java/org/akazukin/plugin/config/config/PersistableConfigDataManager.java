package org.akazukin.plugin.config.config;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.akazukin.plugin.config.config.data.IConfigData;
import org.akazukin.plugin.config.config.data.IConfigStorageManager;
import org.akazukin.plugin.config.config.data.IPersistableConfigDataManager;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.function.Supplier;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersistableConfigDataManager<T extends IConfigData> extends ConfigDataManager<T> implements IPersistableConfigDataManager<T> {
    final IConfigStorageManager<T> dataMgr;

    public PersistableConfigDataManager(@NotNull final Class<T> configClass, @NotNull final Supplier<@NotNull T> instanceSup, @NotNull final IConfigStorageManager<T> dataMgr) {
        super(configClass, instanceSup);
        this.config = instanceSup.get();
        this.dataMgr = dataMgr;
    }

    @Override
    public void restoreDefaults() {
        this.config = this.defaultsSupplier.get();
    }

    @Override
    public T loadConfig() throws IOException {
        try {
            final T instance = this.defaultsSupplier.get();
            instance.restoreDefaults();

            this.dataMgr.loadConfig(instance);

            this.config = instance;
            return instance;
        } catch (final IOException e) {
            throw new IOException("Failed to load config via PersistableConfig.loadConfig()", e);
        }
    }

    @Override
    public void saveConfig() throws IOException {
        try {
            this.dataMgr.saveConfig(this.config);
        } catch (final IOException e) {
            throw new IOException("Failed to save config via PersistableConfig.saveConfig()", e);
        }
    }
}
