module backup {
	exports net.pgfmc.backup;
	exports net.pgfmc.backup.backup;

	requires core;
	requires java.logging;
	requires transitive org.bukkit;
}