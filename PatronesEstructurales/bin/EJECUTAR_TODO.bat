@echo off
echo.
echo =========================================
echo   COMPILANDO Y EJECUTANDO ADAPTER
echo =========================================
javac -d bin src\adapter\*.java
if %errorlevel% == 0 (
    echo.
    echo --- ADAPTER FUNCIONANDO ---
    java -cp bin adapter.Main
) else (
    echo ERROR AL COMPILAR ADAPTER
)

echo.
echo =========================================
echo   COMPILANDO Y EJECUTANDO DECORATOR
echo =========================================
javac -d bin src\decorator\*.java
if %errorlevel% == 0 (
    echo.
    echo --- DECORATOR FUNCIONANDO ---
    java -cp bin decorator.Main
) else (
    echo ERROR AL COMPILAR DECORATOR
)

echo.
echo LISTO. PRESIONA UNA TECLA PARA SALIR...
pause