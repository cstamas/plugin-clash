# Plugin Clash

Two different plugins (different artifacts) may share same prefix.

Still, Maven build output is confusing (is less of a problem):
```
[INFO] --- prefix:1-SNAPSHOT:goal (execution) @ plugin-use ---
org.cstamas.pluginclash.one.TheMojo
[INFO] 
[INFO] --- prefix:1-SNAPSHOT:goal (execution) @ plugin-use ---
org.cstamas.pluginclash.two.TheMojo
[INFO] 
```

If Mojos would not print their FQCNs, one would have no idea what is happening.
