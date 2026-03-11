package org.akazukin.plugin.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.akazukin.loader.api.ILoader;
import org.akazukin.plugin.config.config.ConfigManager;
import org.akazukin.plugin.config.config.data.IConfigManager;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigPlugin implements IConfigPlugin {
    final ILoader loader;
    IConfigManager cfgMgr;

    public ConfigPlugin(final ILoader loader) {
        this.loader = loader;
    }

    @Override
    public void onLoad() {
        this.cfgMgr = new ConfigManager();
    }
}
