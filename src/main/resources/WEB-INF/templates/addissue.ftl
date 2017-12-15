<#import "/spring.ftl" as spring>
<@spring.bind "issueForm"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>

<form action="/carservice/issue/save" method="POST">
<@spring.formInput "issueForm.text" /> <br/>
<@spring.showErrors "<br/>" /> <br/>

<@spring.formInput "issueForm.content" /> <br/>
<@spring.showErrors "<br/>" /> <br/>

<input type="submit" value="submit"/>
</form>

</body>
</html>