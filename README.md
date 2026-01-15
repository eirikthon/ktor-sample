# ktor-sample

Demonstrates a problem with using environment variables tat contain a '$' at the beginning.

To trigger the problem create an env variable named PASSWORD that starts with '\$' (for example '$123Password') and run the application.

Expect:
```
Exception in thread "main" io.ktor.server.config.ApplicationConfigurationException: Required environment variable "123Password" not found and no default value is present
```
