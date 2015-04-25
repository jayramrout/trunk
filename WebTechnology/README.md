# Steps In order to deploy a .war file from apache tomcat
  - Add the below entries in <tomcat-root-dir>/conf/tomcat-users.xml
    ```sh
    <role rolename="manager-gui"/>
      <role rolename="manager-script"/>
      <role rolename="manager-jmx"/>
      <role rolename="manager-status"/>
      <role rolename="admin-gui"/>
      <role rolename="admin-script"/>
      <user username="admin" password="admin" roles="manager-gui, manager-script, manager-jmx, manager-status, admin-gui, admin-script"/>
    ```
  - If your server is already started, the restart your tomcat server.
  - Access the manager url : http://localhost:8080/manager/index.jsp.
  - Choose "WAR file to deploy" section to upload the .war file.
  - You are now ready to access your respective application from url.
