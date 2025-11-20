
---

# ✅ **1. CÓMO EJECUTAR LA APP EN ANDROID STUDIO**

### **Requisitos**

✔ Tener Android Studio instalado
✔ Tener la carpeta del proyecto abierta (tu *Apk isla gorgona*)
✔ Tener un celular Android **o** un emulador configurado

---

## **PASO 1 — Abrir el proyecto**

1. Abre Android Studio
2. Ve a **File → Open**
3. Selecciona la carpeta del proyecto: **Apk isla gorgona**
4. Espera a que gradle termine de sincronizar

---

## **PASO 2 — Seleccionar un dispositivo para ejecutar**

En la parte superior de Android Studio verás algo como:

`Pixel 6 API 34` o “No Devices”.

Tienes dos opciones:
**(A) Ejecutarlo en un emulador**
**(B) Ejecutarlo en tu celular**

---

# 🔵 **A) EJECUTAR EN UN EMULADOR**

1. En el menú de dispositivos, haz clic en **Device Manager**
2. Presiona **Create Device**
3. Elige un modelo (Pixel 5, Pixel 6, etc.)
4. Selecciona una imagen del sistema (Android 12, 13 o 14)
5. Espera a que descargue
6. Presiona en **Play**

Luego presiona el botón verde ▶ **Run App**

Listo. Tu app se abrirá en el emulador.

---

# 🔵 **B) EJECUTARLA EN TU CELULAR (RECOMENDADO)**

### **PASO 1 — Activar opciones de desarrollador**

En tu celular:

1. **Ajustes → Acerca del teléfono**
2. Toca *7 veces* donde dice **Número de compilación**
3. Se activarán las **Opciones de desarrollador**

---

### **PASO 2 — Activar depuración USB**

1. En **Ajustes → Sistema → Opciones de desarrollador**
2. Activa:

   * **Depuración USB**
   * **Permitir depuración ADB**
   * (Opcional) **Depuración USB en modo seguro**

---

### **PASO 3 — Conectar el celular**

1. Conecta tu celular con cable USB

2. En el celular aparecerá:
   **¿Permitir depuración USB? → Aceptar**

3. En Android Studio debe aparecer tu dispositivo en la lista
   Ejemplo:
   **Moto G32 (Android 13)**

---

### **PASO 4 — Ejecutar la app**

Presiona el botón verde ▶ **Run**

Android Studio compilará y enviará la app a tu celular.
Listo: tu app se abrirá automáticamente en el teléfono.

---

# 🚀 **2. INSTALAR LA APK DIRECTAMENTE EN TU CELULAR (SIN CABLE)**

Si quieres enviar la app como APK:

### **PASO 1 — Generar APK**

En Android Studio:

**Build → Build Bundle(s) / APK(s) → Build APK(s)**

La APK queda en:

```
Proyecto → app → build → outputs → apk → debug → app-debug.apk
```

La puedes enviar por:

* WhatsApp
* Telegram
* USB
* Google Drive

Instalas la APK y listo.

Si te dice “instalación bloqueada”, activa:

**Ajustes → Seguridad → Permitir instalación desde orígenes desconocidos**

---



