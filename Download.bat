@echo off
echo Listing files older than 30 days in Downloads...
forfiles /p "%USERPROFILE%\Downloads" /s /m *.* /d -30
echo Saving summary to Download_Summary.txt...
forfiles /p "%USERPROFILE%\Downloads" /s /m *.* /d -30 > "%USERPROFILE%\Downloads\Download_Summary.txt"
echo Summary saved successfully!
pause
