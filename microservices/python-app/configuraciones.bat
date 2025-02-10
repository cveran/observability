set OTEL_EXPORTER_OTLP_ENDPOINT=http://localhost:4318
set OTEL_PYTHON_LOGGING_AUTO_INSTRUMENTATION_ENABLED=true

opentelemetry-instrument ^
  --traces_exporter otlp,console ^
  --metrics_exporter otlp,console ^
  --logs_exporter otlp,console ^
  --metric_export_interval 5000 ^
  --service_name pythonApp ^
  uvicorn pythonApp:app


opentelemetry-instrument ^
  --traces_exporter otlp,console ^
  --metrics_exporter otlp,console ^
  --logs_exporter otlp,console ^
  --metric_export_interval 5000 ^
  --exporter_otlp_protocol http/protobuf ^
  --exporter_otlp_endpoint http://localhost:4318 ^
  --service_name pythonApp ^
  uvicorn pythonApp:app --reload
