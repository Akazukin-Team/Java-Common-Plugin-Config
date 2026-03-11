package org.akazukin.plugin.config.config.data;

public interface IConfigDataManager<T extends IConfigData> {
    T getConfig();

    Class<T> getConfigClass();

    void restoreDefaults();
}
