package org.akazukin.plugin.config.config.data;

import org.akazukin.service.manager.IServiceStore;

public interface IConfigManager {
    <T extends IConfigData> IConfigDataManager<T> getDataMgr(final Class<T> cfgClz);

    void registerStore(final IServiceStore<IConfigDataManager<?>> store);

    void unregisterStore(final IServiceStore<IConfigDataManager<?>> store);
}
