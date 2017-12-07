

1.查询 key
keytool -list -v -keystore debug.keystore -storepass debug_key.keystore


2.生成 key
keytool -genkey -v -keyalg RSA -validity 20000 -keystore debug.keystore \
-alias debug_key -keypass debug_key.keystore -storepass debug_key.keystore \
 -dname "CN=cn,OU=gd,O=Nisin,L=Nisin,ST=Nisin,C=CN"

android