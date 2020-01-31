#export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.jdk/Contents/Home/
#export PATH=.:$JAVA_HOME/bin:$PATH

export DB_HOST=localhost
export DB_USERNAME=user
export DB_PASSWORD=password
mvnw clean package -DskipTests=true

#java -Xms100m -Xmx1000m -XX:+UseG1GC -Xss512k -jar target/shoppingcart-0.0.1-SNAPSHOT.jar

java -Xms100m -Xmx1000m -XX:+UseG1GC -XX:SurvivorRatio=8 -XX:NewRatio=2 -jar target/shoppingcart-0.0.1-SNAPSHOT.jar

#java -Xms30m -Xmx1000m -XX:+UseSerialGC -jar target/shoppingcart-0.0.1-SNAPSHOT.jar

# Good 1
#java -Xss512k -Xms30m -Xmx1000m -XX:+UseSerialGC -XX:MaxRAM=50m -jar target/shoppingcart-0.0.1-SNAPSHOT.jar

# Good 2
#java -Xss512k -Xms30m -Xmx1000m -XX:+UseParallelOldGC -XX:MaxRAM=50m -XX:SurvivorRatio=8 -XX:NewRatio=2 -jar target/shoppingcart-0.0.1-SNAPSHOT.jar

#java -Xms100m -Xmx1000m -XX:+UseG1GC -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=1 -jar target/shoppingcart-0.0.1-SNAPSHOT.jar

#java -Xms100m -Xmx1000m -XX:+UseShenandoahGC -XX:+UnlockExperimentalVMOptions -XX:ShenandoahUncommitDelay=1000 -XX:ShenandoahGuaranteedGCInterval=10000 -jar target/shoppingcart-0.0.1-SNAPSHOT.jar


#java -jar -Xms1000m -Xmx1000m -XX:+UseG1GC –XX:-ShrinkHeapInSteps target/shoppingcart-0.0.1-SNAPSHOT.jar
#java -Xms1000m -Xmx1000m -XX:+UseShenandoahGC -XX:+UnlockExperimentalVMOptions -XX:ShenandoahUncommitDelay=1000 -XX:ShenandoahGuaranteedGCInterval=10000 -jar target/shoppingcart-0.0.1-SNAPSHOT.jar

#java -jar -Xss512k -Xms1000m -Xmx1000m -XX:+UseG1GC -XX:G1HeapRegionSize=4M target/shoppingcart-0.0.1-SNAPSHOT.jar

#https://www.tutorialdocs.com/article/spring-boot-memory-leak.html