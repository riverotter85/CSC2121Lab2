@echo off
cls

set DRIVE_LETTER=%1:
set PATH=%DRIVE_LETTER%\Java\bin;%DRIVE_LETTER%\Java\ant-1.9.6\bin;c:\Windows

ant permute -Ddrive-letter=%DRIVE_LETTER% <lab02_input.txt
::ant run -Ddrive-letter=%DRIVE_LETTER%

