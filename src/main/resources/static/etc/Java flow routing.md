# Spring flow routing

```mermaid
graph TD;

DB --> Entity
Entity --> Repository
Repository --> Service
Service --> Controller
Controller --"Routing"--> HTML

 ```

