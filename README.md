Unix-Tools
==========

## WC
mtWc file-name
    `ex = mtWc one.txt`
It will print count of lines ,words and characters form file


## Head
mtHead file-name
    `ex = mtHead one.txt`
It will print top 10 lines of file   
mtHead -number file-name
    `ex = -5 mtHead one.txt`
It will print top 5 lines of file   


## Tail
mtTail file-name
    `ex = mtTail one.txt`
It will print last 10 lines of file   
mtTail -number file-name
    `ex = -5 mtTail one.txt`
It will print last 5 lines of file  


## Uniq
mtUniq file-name
    `ex = mtUniq one.txt`
It will print mtUniq lines of file.


## Cut
mtCut fieldNumber file-name delemeter
    `ex = mtCut one.txt -f1 -d";" `
It will print 1st field of file.    


## Sort
mtSort file-name
    `ex = mtSort one.txt`
It will print file data in ascending order. 
mtSort file-name -r
    `ex = mtSort one.txt -r`
It will print file data in descending order. 


## Reduce Space
mtReducer filename
    `mtReducer one.txt`
It will remove spaces from file and rewrite that file.    

