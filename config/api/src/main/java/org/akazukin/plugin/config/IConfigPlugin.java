package org.akazukin.plugin.config;

import org.akazukin.loader.api.context.IPlugin;
import org.akazukin.plugin.config.config.data.IConfigManager;

public interface IConfigPlugin extends IPlugin {
    IConfigManager getCfgMgr();
}
