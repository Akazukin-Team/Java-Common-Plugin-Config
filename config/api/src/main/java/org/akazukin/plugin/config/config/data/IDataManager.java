package org.akazukin.plugin.config.config.data;

import java.io.IOException;

public interface IDataManager<T> {
    void loadConfig(T data) throws IOException;

    void saveConfig(T data) throws IOException;
}
