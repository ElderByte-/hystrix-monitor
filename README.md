# hystrix-turbine
Provides hystrix stream aggregation with netflix turbine and a hystrix dashboard server.

* The dashboard is located at `/hystrix`
* Use the local turbine server for aggregated streams.


## Cloud Deployment

### Supported Environment Variables

| Env               |      Description                 |  Hint            |
|-------------------|:--------------------------------:|-----------------:|
| CLUSTER_LIST      |  List of cluster names           | comma separated  |
| SERVICE_LIST      |  List of services to monitor     | comma separated  |
