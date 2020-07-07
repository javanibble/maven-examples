# Nexus Repository Example
```xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <servers>
    <server>
        <id>javanibble-snapshot</id>
        <username>admin</username>
        <password>admin123</password>
    </server>
    <server>
      <id>javanibble-release</id>
      <username>admin</username>
      <password>admin123</password>
    </server>
</settings>

```

