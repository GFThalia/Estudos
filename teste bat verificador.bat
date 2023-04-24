@echo off 
echo ------------------------------------------------------------
echo  Eh necessario abrir esse arquivo em modo de administrador.
echo ------------------------------------------------------------
pause
echo ------------------------------------------------------------
echo  Esse bat verifica a integridade do sistema de arquivos de 
echo um disco rigido, arquivos do sistema e imagem do sistema. 
echo ------------------------------------------------------------
pause
echo --------------------------------------
REM
echo -------- NAO FECHE ESSA JANELA -------
REM
echo --------------------------------------
REM
echo ---- sera fechada automaticamente ----
REM
echo --------------------------------------
pause
cd c:\
md SUPORTE
ipconfig /flushdns > Suporte\ArquivoSuporte.txt
chkdsk >> Suporte\ArquivoSuporte.txt
sfc /scannow >> ArquivoSuporte.txt
Dism /Online /Cleanup-Image /ScanHealth >> Suporte\ArquivoSuporte.txt
Dism /Online /Cleanup-Image /CheckHealth >> Suporte\ArquivoSuporte.txt
echo FECHAR
