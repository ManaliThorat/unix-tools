Unix-Tools
==========

## WChttp://markable.in/editor/#
wc file-name
    `ex = wc one.txt`
It will print count of lines ,words and characters form file


## Head
head file-name
    `ex = head one.txt`
It will print top 10 lines of file   
head -number file-name
    `ex = -5 head one.txt`
It will print top 5 lines of file   


## Tail
tail file-name
    `ex = tail one.txt`
It will print last 10 lines of file   
tail -number file-name
    `ex = -5 tail one.txt`
It will print last 5 lines of file  


## Uniq
uniq file-name
    `ex = uniq one.txt`
It will print uniq lines of file.


## Cut
cut fieldNumber file-name delemeter
    `ex = cut -f1 one.txt ; `
It will print 1st field of file.    


## Sort
sort file-name
    `ex = sort one.txt`
It will print file data in ascending order. 
sort file-name -r
    `ex = sort one.txt -r`
It will print file data in descending order. 


## Reduce Space
reducer filename
    `reducer one.txt`
It will remove spaces from file and rewrite that file.    

