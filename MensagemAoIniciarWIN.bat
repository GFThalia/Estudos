echo off
Color 04
echo Esse é um arquivo para adicionar uma caixa de mensagem cada vez que o computador for iniciado.
echo Eh necessario executa-lo como administrador.
pause
cd C:\Users\Usuario\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup
echo msg * Olá, bom dia. > ola.bat
echo msg * Tome agua, mantenha-se hidratado. >> ola.bat