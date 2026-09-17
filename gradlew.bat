@echo off
REM Gradle start script bootstrap — preferí Android Studio Sync si esto falla.
set DIR=%~dp0
if exist "%DIR%gradle\wrapper\gradle-wrapper.jar" (
  java -jar "%DIR%gradle\wrapper\gradle-wrapper.jar" %*
) else (
  echo Abrí el proyecto en Android Studio para descargar el Gradle Wrapper.
  echo Luego: Build - Generate Signed Bundle / APK
)
