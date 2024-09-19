@echo off
:: Definir rutas
set SRC_DIR=D:\Documents\NetBeansProjects\Spring-Boot-5-testing\data
set BACKUP_DIR=D:\Documents\NetBeansProjects\Spring-Boot-5-testing

:: Fecha y hora actual en formato YYYYMMDD-HHMMSS
set timestamp=%date:~10,4%%date:~7,2%%date:~4,2%-%time:~0,2%%time:~3,2%%time:~6,2%
set timestamp=%timestamp: =0%

:: Copiar archivos de la base de datos clinica
xcopy %SRC_DIR%\clinica.mv.db %BACKUP_DIR%\clinica-backup-%timestamp%.mv.db /Y

:: Copiar archivos de la base de datos clinica_prod
xcopy %SRC_DIR%\clinica_prod.mv.db %BACKUP_DIR%\clinica_prod-backup-%timestamp%.mv.db /Y

:: Mensaje de confirmación
echo Backup realizado con éxito en %BACKUP_DIR% con timestamp %timestamp%.
