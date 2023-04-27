#!/bin/bash
# Bash Menu Script Example

PS3='Sartu aukera bat: '
options=("1 Eguneratu" "2 Itzali" "3 Berrabiarazi" "4 Minutu batzuen ostean itzali" "5 Aplikazio bat instalatu" "Quit")
select opt in "${options[@]}"
do
    case $opt in
        "1 Eguneratu")
            echo Install-WindowsUpdate -IgnoreUserInput -AcceptAll -IgnoreReboot -Verbose | Out-File C:\Windows\Temp\PSWindowsUpdate.log;;
        "2 Itzali")
            echo shutdown;;
        "3 Berrabiarazi")
            echo "you chose choice $REPLY which is $opt";;
		"4 Minutu batzuen ostean itzali")
            echo "you chose choice $REPLY which is $opt";;
		"5 Aplikazio bat instalatu")
            echo "you chose choice $REPLY which is $opt";;
        "Quit")
            break;;
        *) echo "invalid option $REPLY";;
    esac
done