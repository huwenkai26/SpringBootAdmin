    #!/bin/sh
    rm -f tpid
    nohup java -jar spring-boot-admin.jar --spring.profiles.active=pro > startup`date +%Y-%m-%d`.log 2>&1 &
    echo $! > tpid
    echo Start Success!
