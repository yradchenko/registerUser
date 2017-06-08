Sample "Spring Registration Form"
-------------------------------
used Spring+JSP+hibernate+MySQL
-------------------------------
1. home.jsp :: HomeController
home()=>display a link "register"

2. register.jsp :: RegisterController
showRegistrationForm()=>display a "Register Form"
processRegistration() => check validation and call registerService.saveRegister(user)

3. BL ::  @Service -> @Repository
CRUD data

4. profile.jsp :: RegisterController
showProfile() => call registerService.findByUsername(username);


layout=> https://github.com/jboss-developer/jboss-wfk-quickstarts/blob/951fb68ed09b3aa2ee93065d0362e270a1dcccaf/spring-petclinic/src/main/webapp/WEB-INF/jsp/fragments
css=> http://getbootstrap.com/css/
https://github.com/yradchenko/
