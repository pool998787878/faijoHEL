#!/bin/bash

# Directorio raíz del proyecto
PROJECT_ROOT="$(cd "$(dirname "$0")" && pwd)"

# Directorio de las fuentes
SRC_DIR="$PROJECT_ROOT/Source Packages"

# Directorio de clases compiladas
BIN_DIR="$PROJECT_ROOT/bin"

# Nombre del JAR ejecutable
JAR_NAME="MunicipalidadApp.jar"

# Clase principal
MAIN_CLASS="pe.com.empresa.vistacontrol.Index"

# Limpiar directorios de compilación anteriores
rm -rf "$BIN_DIR"
mkdir -p "$BIN_DIR"

echo "Compilando archivos Java..."
find "$SRC_DIR" -name "*.java" -print0 | xargs -0 javac -d "$BIN_DIR"

if [ $? -eq 0 ]; then
    echo "Compilación exitosa. Creando JAR ejecutable..."
    jar -cvfm "$PROJECT_ROOT/$JAR_NAME" "$PROJECT_ROOT/META-INF/MANIFEST.MF" -C "$BIN_DIR" .
    echo "JAR ejecutable creado en: $PROJECT_ROOT/$JAR_NAME"
else
    echo "Error durante la compilación."
fi


