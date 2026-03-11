package org.akazukin.plugin.config.config;

import org.akazukin.plugin.config.config.data.IConfigData;
import org.akazukin.plugin.config.config.data.IConfigDataManager;
import org.akazukin.plugin.config.config.data.IConfigManager;
import org.akazukin.service.manager.holder.ServiceManagerHolder;

import java.util.Arrays;
import java.util.Objects;

public class ConfigManager extends ServiceManagerHolder<IConfigDataManager<?>> implements IConfigManager {

    @SuppressWarnings("unchecked")
    public ConfigManager() {
        super((Class<IConfigDataManager<?>>) (Object) IConfigDataManager.class);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends IConfigData> IConfigDataManager<T> getDataMgr(final Class<T> cfgClz) {
        return (IConfigDataManager<T>) Arrays.stream(this.getAllServices())
                .filter(mgr -> Objects.equals(mgr.getConfigClass(), cfgClz))
                .findFirst()
                .orElse(null);
    }
}
