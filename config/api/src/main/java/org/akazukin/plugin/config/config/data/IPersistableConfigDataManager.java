package org.akazukin.plugin.config.config.data;

import java.io.IOException;

public interface IPersistableConfigDataManager<T extends IConfigData> extends IConfigDataManager<T> {
    T loadConfig() throws IOException;

    void saveConfig() throws IOException;
}
