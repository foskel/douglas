package com.github.foskel.douglas.plugin.load.priority;

import com.github.foskel.douglas.plugin.Plugin;

public interface PluginPriorityResolver {
    PluginPriority resolveLoadingPriority(Plugin plugin);

    PluginPriority resolveUnloadingPriority(Plugin plugin);
}